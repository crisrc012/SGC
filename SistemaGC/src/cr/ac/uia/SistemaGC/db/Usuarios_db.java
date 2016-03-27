/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Usuarios_db {

    private Conexion conn;
    private Statement st;

    public ArrayList<Usuarios> select(String cedula, String usuario, String contrasena, String nombre, String apellidos, String activo, String observaciones, String id_rol) throws SQLException {
        ArrayList<Usuarios> usuarioslst = new ArrayList<>();
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
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

    public boolean insert_update(String cedula, String usuario, String contrasena, String nombre, String apellidos, String activo, String observaciones, String id_rol, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
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

    public boolean delete(int cedula) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_usuarios('delete',"
                    + cedula + ", NULL, NULL, NULL, NULL, NULL, NULL, NULL);");
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

    public Boolean login(String usuario, String contrasena) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery("SELECT * FROM f_check_password('" + usuario + "','" + contrasena + "');")) {
                while (rs.next()) {
                    control = rs.getBoolean("activo");
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
        return control;
    }
}
