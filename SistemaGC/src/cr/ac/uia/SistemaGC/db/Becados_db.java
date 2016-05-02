/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Becados;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becados_db {

    private Conexion conn;
    private Statement st;

    public ArrayList<Becados> select(String id, String id_persona, String id_beca, String activo, String observaciones) throws SQLException {
        ArrayList<Becados> becadoslst = new ArrayList<>();
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_becados('select',"
                    + id + ", "
                    + id_persona + ", "
                    + id_beca + ", "
                    + activo + ", "
                    + observaciones + ");")) {
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
        return becadoslst;
    }

    public boolean insert_update(String id, String id_persona, String id_beca, String activo, String observaciones, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_becados('"
                    + dml + "', "
                    + id + ", "
                    + id_persona + ", "
                    + id_beca + ", "
                    + activo + ", '"
                    + observaciones + "');");
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
            this.st.executeQuery("SELECT f_becados('delete',"
                    + id + ", NULL, NULL, NULL, NULL);");
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
