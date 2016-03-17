/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Becas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becas_db {

    private Conexion conn;
    private Statement st;

    public ArrayList<Becas> select(String id, String nombre, String porcentaje, String activo, String observaciones) throws SQLException {
        ArrayList<Becas> becaslst = null;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_becas('select',"
                    + id + ", "
                    + nombre + ", "
                    + porcentaje + ","
                    + activo + ", "
                    + observaciones + ");")) {
                becaslst = new ArrayList<>();
                while (rs.next()) {
                    Becas b = new Becas();
                    b.setId(rs.getInt("id"));
                    b.setNombre(rs.getString("nombre"));
                    b.setPorcentaje(rs.getInt("porcentaje"));
                    b.setActivo(rs.getBoolean("activo"));
                    b.setObservaciones(rs.getString("observaciones"));
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

    public boolean insert_update(String id, String nombre, String porcentaje, String activo, String observaciones, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_becas('"
                    + dml + "',"
                    + id + ", "
                    + nombre + ", "
                    + porcentaje + ", "
                    + activo + ", "
                    + observaciones + ");");
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

    public boolean delete(int id) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_becas('delete', "
                    + id + ", NULL, NULL, NULL, NULL, NULL);");
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
