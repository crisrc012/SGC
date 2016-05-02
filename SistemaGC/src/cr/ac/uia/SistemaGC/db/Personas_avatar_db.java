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

    public byte[] select(int cedula) {
        try {
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
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public boolean insert_update(int cedula, File foto, String dml) throws SQLException {
        Boolean control = false;
        try {
            conn = new Conexion();
            PreparedStatement ps;
            if (dml.equals("insert")) {
                ps = conn.getConnection()
                        .prepareStatement("insert into tbl_personas_avatar values (?, ?)");
                if (foto == null) {
                    ps = conn.getConnection()
                            .prepareStatement("insert into tbl_personas_avatar values (?, null)");
                } else {
                    FileInputStream fis = new FileInputStream(foto);
                    ps.setBinaryStream(2, fis, (int) foto.length());
                }
                ps.setInt(1, cedula);
            } else { // update
                ps = conn.getConnection()
                        .prepareStatement("update tbl_personas_avatar set foto=? where cedula=?");
                if (foto == null) {
                    ps = conn.getConnection()
                            .prepareStatement("update tbl_personas_avatar set foto=null where cedula=?");
                    ps.setInt(1, cedula);
                } else {
                    FileInputStream fis = new FileInputStream(foto);
                    ps.setBinaryStream(1, fis, (int) foto.length());
                    ps.setInt(2, cedula);
                }
            }
            ps.executeUpdate();
            ps.close();

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

    public boolean delete(int cedula) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("delete from tbl_personas_avatar where id=" + cedula);
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
