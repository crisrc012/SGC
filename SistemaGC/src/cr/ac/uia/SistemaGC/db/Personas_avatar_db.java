/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author crisrc012
 */
public class Personas_avatar_db {

    private Conexion conn;
    private Statement st;

    public byte[] select(int cedula) throws SQLException {
        byte[] foto = null;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT foto FROM tbl_personas_avatar WHERE cedula=" + cedula + ";")) {
                while (rs.next()) {
                    foto = rs.getBytes("foto");
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
        return foto;
    }

    public boolean insert_update(String cedula, String foto, String dml) throws FileNotFoundException, SQLException, IOException {
        Boolean control = false;
        try {
            conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            String query = null;
            switch (dml) {
                case "insert":
                    query = "insert into tbl_personas_avatar values (" + cedula + ", '" + foto + "');";
                    break;
                case "update":
                    query = "update tbl_personas_avatar set foto='" + foto + "' where cedula=" + cedula + ");";
                    break;
                default:
                    break;
            }
            if (query != null) {
                this.st.executeQuery(query);
                control = true;
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
        return control;
    }

    public boolean delete(int cedula) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("delete from tbl_personas_avatar where id=" + cedula);
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
