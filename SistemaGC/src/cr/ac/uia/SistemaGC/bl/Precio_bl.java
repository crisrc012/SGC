/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Precio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Precio_bl {

    private Connection conn;
    private Statement st;

    public ArrayList<Precio> select(Precio precio) throws SQLException {
        ArrayList<Precio> preciolst = null;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String id_persona = "NULL";
            String id_comida = "NULL";
            String _precio = "NULL";
            if (precio.getId() != null) {
                id = String.valueOf(precio.getId());
            }
            if (precio.getId_persona()!= null) {
                id_persona = String.valueOf(precio.getId_persona());
            }
            if (precio.getId_comida() != null) {
                id_comida = String.valueOf(precio.getId_comida());
            }
            if (precio.getPrecio() != null) {
                _precio = String.valueOf(precio.getPrecio());
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_precio('select',"
                    + id + ", '"
                    + id_persona + "', '"
                    + id_comida + "', "
                    + _precio + ");")) {
                preciolst = new ArrayList<>();
                while (rs.next()) {
                    Precio p = new Precio();
                    p.setId(rs.getInt("id"));
                    p.setId_persona(rs.getInt("id_persona"));
                    p.setId_comida(rs.getInt("id_comida"));
                    p.setPrecio(rs.getInt("precio"));
                    preciolst.add(p);
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
        return preciolst;
    }

    private boolean insert_update(Precio precio, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String id_persona;
            String id_comida;
            String _precio;
            if (dml.equals("update")) {
                id = String.valueOf(precio.getId());
            }
            if (precio.getId_persona() == null) {
                return false;
            } else {
                id_persona = String.valueOf(precio.getId_persona());
            }
            if (precio.getId_comida() == null) {
                return false;
            } else {
                id_comida = String.valueOf(precio.getId_comida());
            }
            if (precio.getPrecio() == null) {
                return false;
            } else {
                _precio = String.valueOf(precio.getPrecio());
            }
            this.st.executeQuery("SELECT f_precio('"
                    + dml + "', "
                    + id + ", "
                    + id_persona + ", "
                    + id_comida + ", "
                    + _precio + ");");
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

    public boolean insert(Precio precio) throws SQLException {
        return insert_update(precio, "insert");
    }

    public boolean update(Precio precio) throws SQLException {
        return insert_update(precio, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_precio('delete', "
                    + id + ", NULL, NULL, NULL);");
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
