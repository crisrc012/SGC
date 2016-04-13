/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
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
        conn = new Conexion();
        try (PreparedStatement ps
                = conn.getConnection().prepareStatement(
                        "select foto from tbl_personas_avatar where cedula = ?")) {
            ps.setInt(1, cedula);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    foto = rs.getBytes("foto");
                }
                rs.close();
                ps.close();
            }
        }
        return foto;
    }

    public boolean insert_update(int cedula, File foto, String dml) throws FileNotFoundException, SQLException, IOException {
        Boolean control = false;
        try {
            conn = new Conexion();
            PreparedStatement ps;
            if (foto != null) {
                FileInputStream fis = new FileInputStream(foto);
                if (dml.equals("insert")) {
                    ps = conn.getConnection().prepareStatement("insert into tbl_personas_avatar values (?, ?)");
                    ps.setInt(1, cedula);
                    ps.setBinaryStream(2, fis, (int) foto.length());
                } else {
                    ps = conn.getConnection().prepareStatement("update tbl_personas_avatar set foto=? where cedula=?");
                    ps.setBinaryStream(1, fis, (int) foto.length());
                    ps.setInt(2, cedula);
                }
            } else if (dml.equals("insert")) {
                ps = conn.getConnection().prepareStatement("insert into tbl_personas_avatar values (?, null)");
                ps.setInt(1, cedula);
            } else {
                ps = conn.getConnection().prepareStatement("update tbl_personas_avatar set foto=null where cedula=?");
                ps.setInt(2, cedula);
            }
            ps.executeUpdate();
            ps.close();

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
