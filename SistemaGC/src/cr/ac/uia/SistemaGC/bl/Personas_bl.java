/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Personas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Personas_bl {

    private Connection conn;
    private Statement st;

    public ArrayList<Personas> select(Personas personas) throws SQLException {
        ArrayList<Personas> personaslst = null;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String cedula = "NULL";
            String nombre = "NULL";
            String apellidos = "NULL";
            String fecha_nacimiento = "NULL";
            String tel_celular = "NULL";
            String tel_habitacion = "NULL";
            String encargado = "NULL";
            String id_persona = "NULL";
            if (personas.getCedula() != null) {
                cedula = String.valueOf(personas.getCedula());
            }
            if (personas.getNombre() != null) {
                nombre = String.valueOf(personas.getNombre());
            }
            if (personas.getApellidos() != null) {
                apellidos = String.valueOf(personas.getApellidos());
            }
            if (personas.getFecha_nacimiento() != null) {
                fecha_nacimiento = String.valueOf(personas.getFecha_nacimiento());
            }
            if (personas.getTel_celular() != null) {
                tel_celular = String.valueOf(personas.getTel_celular());
            }
            if (personas.getTel_habitacion() != null) {
                tel_habitacion = String.valueOf(personas.getTel_habitacion());
            }
            if (personas.getEncargado() != null) {
                encargado = String.valueOf(personas.getEncargado());
            }
            if (personas.getId_persona() != null) {
                id_persona = String.valueOf(personas.getId_persona());
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_personas('select',"
                    + cedula + ", '"
                    + nombre + "', '"
                    + apellidos + "', '"
                    + fecha_nacimiento + "', "
                    + tel_celular + ", "
                    + tel_habitacion + ", '"
                    + encargado + "', "
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

    private boolean insert_update(Personas personas, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String cedula = "NULL";
            String nombre;
            String apellidos;
            String fecha_nacimiento;
            String tel_celular;
            String tel_habitacion;
            String encargado;
            String id_persona;
            if (dml.equals("update")) {
                cedula = String.valueOf(personas.getCedula());
            }
            if (personas.getNombre() == null) {
                return false;
            } else {
                nombre = personas.getNombre();
            }
            if (personas.getApellidos() == null) {
                return false;
            } else {
                apellidos = personas.getApellidos();
            }
            if (personas.getFecha_nacimiento() == null) {
                return false;
            } else {
                fecha_nacimiento = String.valueOf(personas.getFecha_nacimiento());
            }
            if (personas.getTel_celular() == null) {
                return false;
            } else {
                tel_celular = String.valueOf(personas.getTel_celular());
            }
            if (personas.getTel_habitacion() == null) {
                return false;
            } else {
                tel_habitacion = String.valueOf(personas.getTel_habitacion());
            }
            if (personas.getEncargado() == null) {
                return false;
            } else {
                encargado = personas.getEncargado();
            }
            if (personas.getId_persona() == null) {
                return false;
            } else {
                id_persona = String.valueOf(personas.getId_persona());
            }
            this.st.executeQuery("SELECT f_personas('"
                    + dml + "', "
                    + cedula + ", '"
                    + nombre + "', '"
                    + apellidos + "', '"
                    + fecha_nacimiento + "', "
                    + tel_celular + ", "
                    + tel_habitacion + ", '"
                    + encargado + "', "
                    + id_persona + ");");
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

    public boolean insert(Personas personas) throws SQLException {
        return insert_update(personas, "insert");
    }

    public boolean update(Personas personas) throws SQLException {
        return insert_update(personas, "update");
    }

    public boolean delete(int cedula) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_personas('delete',"
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
