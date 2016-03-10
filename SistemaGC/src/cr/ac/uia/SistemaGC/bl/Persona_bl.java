/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Conexion;
import cr.ac.uia.SistemaGC.entities.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Persona_bl {

    private Conexion conn;
    private Statement st;

    public ArrayList<Persona> select(Persona persona) throws SQLException {
        ArrayList<Persona> personalst = null;
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String descripcion = "NULL";
            if (null != persona.getId()) {
                id = String.valueOf(persona.getId());
            }
            if (persona.getDescripcion() != null) {
                descripcion = "'" + persona.getDescripcion() + "'";
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_persona('select', "
                    + id + ", "
                    + descripcion + ");")) {
                personalst = new ArrayList<>();
                while (rs.next()) {
                    Persona p = new Persona();
                    p.setId(rs.getInt("id"));
                    p.setDescripcion(rs.getString("descripcion"));
                    personalst.add(p);
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
        return personalst;
    }

    private boolean insert_update(Persona persona, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String descripcion;
            if (dml.equals("update")) {
                id = String.valueOf(persona.getId());
            }
            if (persona.getDescripcion() == null) {
                return false;
            } else {
                descripcion = "'" + persona.getDescripcion() + "'";
            }
            this.st.executeQuery("SELECT f_persona('"
                    + dml + "', "
                    + id + ", '"
                    + descripcion + "');");
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

    public boolean insert(Persona persona) throws SQLException {
        return insert_update(persona, "insert");
    }

    public boolean update(Persona persona) throws SQLException {
        return insert_update(persona, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_persona('delete', "
                    + id + ", NULL);");
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
