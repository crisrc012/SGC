/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Conexion;
import cr.ac.uia.SistemaGC.entities.Tiquetes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Tiquetes_bl {

    private Conexion conn;
    private Statement st;

    public ArrayList<Tiquetes> select(Tiquetes tiquetes) throws SQLException {
        ArrayList<Tiquetes> tiqueteslst = null;
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String id_persona = "NULL";
            String id_precio = "NULL";
            String fecha_compra = "NULL";
            String fecha_uso = "NULL";
            String activo = "NULL";
            if (tiquetes.getId() != null) {
                id = String.valueOf(tiquetes.getId());
            }
            if (tiquetes.getId_persona() != null) {
                id_persona = String.valueOf(tiquetes.getId_persona());
            }
            if (tiquetes.getId_precio() != null) {
                id_precio = String.valueOf(tiquetes.getId_precio());
            }
            if (tiquetes.getFecha_compra() != null) {
                fecha_compra = String.valueOf(tiquetes.getFecha_compra());
            }
            if (tiquetes.getFecha_uso() != null) {
                fecha_uso = String.valueOf(tiquetes.getFecha_uso());
            }
            if (tiquetes.getActivo() != null) {
                activo = String.valueOf(tiquetes.getActivo());
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_tiquetes('select',"
                    + id + ", "
                    + id_persona + ", "
                    + id_precio + ", "
                    + fecha_compra + ", "
                    + fecha_uso + ", "
                    + activo + ");")) {
                tiqueteslst = new ArrayList<>();
                while (rs.next()) {
                    Tiquetes p = new Tiquetes();
                    p.setId(rs.getInt("id"));
                    p.setId_persona(rs.getInt("id_persona"));
                    p.setId_precio(rs.getInt("id_precio"));
                    p.setFecha_compra(rs.getDate("fecha_compra"));
                    p.setFecha_uso(rs.getDate("fecha_uso"));
                    p.setActivo(rs.getBoolean("activo"));
                    tiqueteslst.add(p);
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
        return tiqueteslst;
    }

    private boolean insert_update(Tiquetes tiquetes, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String id_persona;
            String id_precio;
            String fecha_compra;
            String fecha_uso;
            String activo;
            if (dml.equals("update")) {
                id = String.valueOf(tiquetes.getId());
            }
            if (tiquetes.getId_persona() == null) {
                return false;
            } else {
                id_persona = String.valueOf(tiquetes.getId_persona());
            }
            if (tiquetes.getId_precio() == null) {
                return false;
            } else {
                id_precio = String.valueOf(tiquetes.getId_precio());
            }
            if (tiquetes.getFecha_compra() == null) {
                return false;
            } else {
                fecha_compra = "'" + String.valueOf(tiquetes.getFecha_compra()) + "'";
            }
            if (tiquetes.getFecha_uso() == null) {
                return false;
            } else {
                fecha_uso = "'" + String.valueOf(tiquetes.getFecha_uso() + "'");
            }
            if (tiquetes.getActivo() == null) {
                return false;
            } else {
                activo = String.valueOf(tiquetes.getActivo());
            }
            this.st.executeQuery("SELECT f_tiquetes('"
                    + dml + "', "
                    + id + ", "
                    + id_persona + ", "
                    + id_precio + ", "
                    + fecha_compra + ", "
                    + fecha_uso + "', "
                    + activo + ");");
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

    public boolean insert(Tiquetes tiquetes) throws SQLException {
        return insert_update(tiquetes, "insert");
    }

    public boolean update(Tiquetes tiquetes) throws SQLException {
        return insert_update(tiquetes, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_tiquetes('delete',"
                    + id + ", NULL, NULL, NULL, NULL, NULL);");
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
