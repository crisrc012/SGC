/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Personas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Personas_db {

    private Conexion conn;
    private Statement st;

    public ArrayList<Personas> select(String cedula, String nombre, String apellidos, String fecha_nacimiento, String tel_celular, String tel_habitacion, String encargado, String id_persona) throws SQLException {
        ArrayList<Personas> personaslst = null;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_personas('select', "
                    + cedula + ", "
                    + nombre + ", "
                    + apellidos + ", "
                    + fecha_nacimiento + ", "
                    + tel_celular + ", "
                    + tel_habitacion + ", "
                    + encargado + ", "
                    + id_persona + ");")) {
                personaslst = new ArrayList<>();
                while (rs.next()) {
                    Personas p = new Personas();
                    p.setCedula(rs.getInt("cedula"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellidos(rs.getString("apellidos"));
                    p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                    p.setTel_celular(rs.getInt("tel_celular"));
                    p.setTel_habitacion(rs.getInt("tel_habitacion"));
                    p.setId_persona(rs.getInt("id_persona"));
                    personaslst.add(p);
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
        return personaslst;
    }

    public boolean insert_update(String cedula, String nombre, String apellidos, String fecha_nacimiento, String tel_celular, String tel_habitacion, String encargado, String id_persona, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT * FROM f_personas('"
                    + dml + "', "
                    + cedula + ", "
                    + nombre + ", "
                    + apellidos + ", "
                    + fecha_nacimiento + ", "
                    + tel_celular + ", "
                    + tel_habitacion + ", "
                    + encargado + ", "
                    + id_persona + ");");
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
            this.st.executeQuery("SELECT f_personas('delete', "
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
}
