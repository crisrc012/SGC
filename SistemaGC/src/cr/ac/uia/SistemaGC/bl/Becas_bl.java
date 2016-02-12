/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Becas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becas_bl {

    private Connection conn;
    private Statement st;

    public ArrayList<Becas> select(Becas becas) throws SQLException {
        ArrayList<Becas> becaslst = null;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String nombre = "NULL";
            String porcentaje = "NULL";
            if (null != becas.getId()) {
                id = String.valueOf(becas.getId());
            }
            if (becas.getNombre() != null) {
                nombre = "'" + becas.getNombre() + "'";
            }
            if (null != becas.getPorcentaje()) {
                id = String.valueOf(becas.getId());
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_becas('select',"
                    + id + "," + nombre + "," + porcentaje + ");")) {
                becaslst = new ArrayList<>();
                while (rs.next()) {
                    Becas b = new Becas();
                    b.setId(rs.getInt("id"));
                    b.setNombre(rs.getString("nombre"));
                    b.setPorcentaje(rs.getInt("porcentaje"));
                    becaslst.add(b);
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
        return becaslst;
    }

    private boolean insert_update(Becas becas, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String nombre;
            String porcentaje;
            if (dml.equals("update")) {
                id = String.valueOf(becas.getId());
            }
            if (becas.getNombre() == null) {
                return false;
            } else {
                nombre = "'" + becas.getNombre() + "'";
            }
            if (becas.getPorcentaje() == null) {
                return false;
            } else {
                porcentaje = "'" + becas.getPorcentaje() + "'";
            }
            this.st.executeQuery("SELECT f_becas('"
                    + dml + "'," + id + " ," + nombre + ");");
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

    public boolean insert(Becas becas) throws SQLException {
        return insert_update(becas, "insert");
    }

    public boolean update(Becas becas) throws SQLException {
        return insert_update(becas, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_becas('delete'," + id + ",NULL);");
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
