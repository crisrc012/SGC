/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Conexion;
import cr.ac.uia.SistemaGC.entities.Becados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becados_bl {

    private Conexion conn;
    private Statement st;

    public ArrayList<Becados> select(Becados becados) throws SQLException {
        ArrayList<Becados> becadoslst = null;
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String id_persona = "NULL";
            String id_beca = "NULL";
            String activo = "NULL";
            String observaciones = "NULL";
            if (null != becados.getId()) {
                id = String.valueOf(becados.getId());
            }
            if (becados.getId_persona() != null) {
                id_persona = String.valueOf(becados.getId_persona());
            }
            if (null != becados.getId_beca()) {
                id = String.valueOf(becados.getId_beca());
            }
            if (becados.getActivo() != null) {
                activo = String.valueOf(becados.getActivo());
            }
            if (becados.getObservaciones() != null) {
                observaciones = "'" + becados.getObservaciones() + "'";
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_becados('select',"
                    + id + ", "
                    + id_persona + ", "
                    + id_beca + ", "
                    + activo + ", "
                    + observaciones + ");")) {
                becadoslst = new ArrayList<>();
                while (rs.next()) {
                    Becados b = new Becados();
                    b.setId(rs.getInt("id"));
                    b.setId_persona(rs.getInt("id_persona"));
                    b.setId_beca(rs.getInt("id_beca"));
                    b.setActivo(rs.getBoolean("activo"));
                    b.setObservaciones(rs.getString("observaciones"));
                    becadoslst.add(b);
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
        return becadoslst;
    }

    private boolean insert_update(Becados becados, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String id_persona;
            String id_beca;
            String activo;
            String observaciones;
            if (dml.equals("update")) {
                id = String.valueOf(becados.getId());
            }
            if (becados.getId_persona() == null) {
                return false;
            } else {
                id_persona = String.valueOf(becados.getId_persona());
            }
            if (becados.getId_beca() == null) {
                return false;
            } else {
                id_beca = String.valueOf(becados.getId_beca());
            }
            if (becados.getActivo() == null) {
                return false;
            } else {
                activo = String.valueOf(becados.getActivo());
            }
            if (becados.getObservaciones() == null) {
                return false;
            } else {
                observaciones = becados.getObservaciones();
            }
            this.st.executeQuery("SELECT f_becados('"
                    + dml + "', "
                    + id + ", "
                    + id_persona + ", "
                    + id_beca + ", "
                    + activo + ", '"
                    + observaciones + "');");
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

    public boolean insert(Becados becados) throws SQLException {
        return insert_update(becados, "insert");
    }

    public boolean update(Becados becados) throws SQLException {
        return insert_update(becados, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_becados('delete',"
                    + id + ", NULL, NULL, NULL, NULL);");
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
