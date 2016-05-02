/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Comida;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crobles
 */
public class Comida_db {

    private Conexion conn;
    private Statement st;

    public ArrayList<Comida> select(String id, String descripcion) throws SQLException {
        ArrayList<Comida> comidalst = new ArrayList<>();
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_comida('select', "
                    + id + ", "
                    + descripcion + ");")) {
                while (rs.next()) {
                    Comida c = new Comida();
                    c.setId(rs.getInt("id"));
                    c.setDescripcion(rs.getString("descripcion"));
                    comidalst.add(c);
                }
                rs.close();
            }
        } catch (IOException | SQLException e) {
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

    public boolean insert_update(String id, String descripcion, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_comida('"
                    + dml + "',"
                    + id + ", "
                    + descripcion + ");");
            control = true;
        } catch (IOException | SQLException e) {
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
            this.st.executeQuery("SELECT f_comida('delete', "
                    + id + ", NULL);");
            control = true;
        } catch (IOException | SQLException e) {
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
