/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Comida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crobles
 */
public class Comida_bl {

    private Connection conn;
    private Statement st;

    public ArrayList<Comida> select(Comida comida) throws SQLException {
        ArrayList<Comida> comidalst = null;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String descripcion = "NULL";
            if (null != comida.getId()) {
                id = String.valueOf(comida.getId());
            }
            if (comida.getDescripcion() != null) {
                descripcion = "'" + comida.getDescripcion() + "'";
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_comida('select', "
                    + id + ", '"
                    + descripcion + "');")) {
                comidalst = new ArrayList<>();
                while (rs.next()) {
                    Comida c = new Comida();
                    c.setId(rs.getInt("id"));
                    c.setDescripcion(rs.getString("descripcion"));
                    comidalst.add(c);
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
        return comidalst;
    }

    private boolean insert_update(Comida comida, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String descripcion;
            if (dml.equals("update")) {
                id = String.valueOf(comida.getId());
            }
            if (comida.getDescripcion() == null) {
                return false;
            } else {
                descripcion = "'" + comida.getDescripcion() + "'";
            }
            this.st.executeQuery("SELECT f_comida('"
                    + dml + "',"
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

    public boolean insert(Comida comida) throws SQLException {
        return insert_update(comida, "insert");
    }

    public boolean update(Comida comida) throws SQLException {
        return insert_update(comida, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_comida('delete', "
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
