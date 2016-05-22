/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Usuarios;
import cr.ac.uia.SistemaGC.utils.AES;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Usuarios_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Usuarios> select(Usuarios usuario) throws SQLException, IOException {
        ArrayList<Usuarios> usuarioslst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select * from f_usuarios('select',?,?,null,?,?,?,?,?);");
            if (usuario.getCedula() != null) {
                ps.setLong(1, usuario.getCedula());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (usuario.getUsuario() != null) {
                ps.setString(2, usuario.getUsuario());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            if (usuario.getNombre() != null) {
                ps.setString(3, usuario.getNombre());
            } else {
                ps.setNull(3, java.sql.Types.VARCHAR);
            }
            if (usuario.getApellidos() != null) {
                ps.setString(4, usuario.getApellidos());
            } else {
                ps.setNull(4, java.sql.Types.VARCHAR);
            }
            if (usuario.getActivo() != null) {
                ps.setBoolean(5, usuario.getActivo());
            } else {
                ps.setNull(5, java.sql.Types.BOOLEAN);
            }
            if (usuario.getObservaciones() != null) {
                ps.setString(6, usuario.getObservaciones());
            } else {
                ps.setNull(6, java.sql.Types.VARCHAR);
            }
            if (usuario.getId_rol() != null) {
                ps.setInt(7, usuario.getId_rol());
            } else {
                ps.setNull(7, java.sql.Types.INTEGER);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Usuarios u = new Usuarios();
                    u.setCedula(rs.getLong("cedula"));
                    u.setUsuario(rs.getString("usuario"));
                    u.setNombre(rs.getString("nombre"));
                    u.setApellidos(rs.getString("apellidos"));
                    u.setActivo(rs.getBoolean("activo"));
                    u.setObservaciones(rs.getString("observaciones"));
                    u.setId_rol(rs.getInt("id_rol"));
                    usuarioslst.add(u);
                }
                rs.close();
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return usuarioslst;
    }

    public boolean insert_update(Usuarios usuario, String dml) throws SQLException, IOException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection().prepareStatement("select f_usuarios(?,?,?,?,?,?,?,?,?);");
            ps.setString(1, dml);
            ps.setLong(2, usuario.getCedula());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, AES.encrypt(usuario.getCedula(), usuario.getUsuario(), usuario.getContrasena()));
            ps.setString(5, usuario.getNombre());
            ps.setString(6, usuario.getApellidos());
            ps.setBoolean(7, usuario.getActivo());
            ps.setString(8, usuario.getObservaciones());
            ps.setInt(9, usuario.getId_rol());
            control = ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return control;
    }

    public boolean delete(int cedula) throws SQLException, IOException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_usuarios('delete',?,null,null,null,null,null,null,null);");
            ps.setInt(1, cedula);
            control = ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return control;
    }

    public Boolean login(String usuario, String contrasena) throws SQLException, IOException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection().prepareStatement("select * from f_check_password(?,?);");
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    control = rs.getBoolean("activo");
                }
                rs.close();
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return control;
    }
}
