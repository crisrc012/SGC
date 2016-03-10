/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Usuarios_bl {

    private Connection conn;
    private Statement st;

    public ArrayList<Usuarios> select(Usuarios usuarios) throws SQLException {
        ArrayList<Usuarios> usuarioslst = null;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String cedula = "NULL";
            String usuario = "NULL";
            String contrasena = "NULL";
            String nombre = "NULL";
            String apellidos = "NULL";
            String activo = "NULL";
            String observaciones = "NULL";
            String id_rol = "NULL";
            if (usuarios.getCedula() != null) {
                cedula = String.valueOf(usuarios.getCedula());
            }
            if (usuarios.getUsuario() != null) {
                usuario = "'" + usuarios.getUsuario() + "'";
            }
            if (usuarios.getContrasena() != null) {
                contrasena = "'" + usuarios.getContrasena() + "'";
            }
            if (usuarios.getNombre() != null) {
                nombre = "'" + usuarios.getNombre() + "'";
            }
            if (usuarios.getApellidos() != null) {
                apellidos = "'" + usuarios.getApellidos() + "'";
            }
            if (usuarios.getActivo() != null) {
                activo = String.valueOf(usuarios.getActivo());
            }
            if (usuarios.getObservaciones() != null) {
                observaciones = "'" + usuarios.getObservaciones() + "'";
            }
            if (usuarios.getId_rol() != null) {
                id_rol = String.valueOf(usuarios.getId_rol());
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_usuarios('select', "
                    + cedula + ", "
                    + usuario + ", "
                    + contrasena + ", "
                    + nombre + ", "
                    + apellidos + ", "
                    + activo + ", "
                    + observaciones + ", "
                    + id_rol + ");")) {
                usuarioslst = new ArrayList<>();
                while (rs.next()) {
                    Usuarios u = new Usuarios();
                    u.setCedula(rs.getInt("cedula"));
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
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return usuarioslst;
    }

    private boolean insert_update(Usuarios usuarios, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String cedula;
            String usuario;
            String contrasena;
            String nombre;
            String apellidos;
            String activo;
            String observaciones;
            String id_rol;
            if (usuarios.getCedula() == null) {
                return false;
            } else {
                cedula = String.valueOf(usuarios.getCedula());
            }
            if (usuarios.getUsuario() == null) {
                return false;
            } else {
                usuario = "'" + usuarios.getUsuario() + "'";
            }
            if (usuarios.getNombre() == null) {
                return false;
            } else {
                nombre = "'" + usuarios.getNombre() + "'";
            }
            if (usuarios.getApellidos() == null) {
                return false;
            } else {
                apellidos = "'" + usuarios.getApellidos() + "'";
            }
            if (usuarios.getContrasena() == null) {
                return false;
            } else {
                contrasena = "'" + cr.ac.uia.SistemaGC.utils.AES.encrypt(
                        String.valueOf(usuarios.getCedula()),
                        usuarios.getUsuario(),
                        usuarios.getContrasena()) + "'";
            }
            if (usuarios.getActivo() == null) {
                return false;
            } else {
                activo = String.valueOf(usuarios.getActivo());
            }
            if (usuarios.getObservaciones() == null) {
                return false;
            } else {
                observaciones = "'" + usuarios.getObservaciones() + "'";
            }
            if (usuarios.getId_rol() == null) {
                return false;
            } else {
                id_rol = String.valueOf(usuarios.getId_rol());
            }
            this.st.executeQuery("SELECT f_usuarios('"
                    + dml + "', "
                    + cedula + ", "
                    + usuario + ", "
                    + contrasena + ", "
                    + nombre + ", "
                    + apellidos + ", "
                    + activo + ", "
                    + observaciones + ", "
                    + id_rol + ");");
            control = true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return control;
    }

    public boolean insert(Usuarios usuarios) throws SQLException {
        return insert_update(usuarios, "insert");
    }

    public boolean update(Usuarios usuarios) throws SQLException {
        return insert_update(usuarios, "update");
    }

    public boolean delete(int cedula) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_usuarios('delete',"
                    + cedula + ", NULL, NULL, NULL, NULL, NULL, NULL, NULL);");
        } catch (SQLException e) {
            return false;
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return true;
    }
}
