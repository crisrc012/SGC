/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Personas_avatar;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author crisrc012
 */
public class Personas_avatar_db {

    private Conexion conn;
    private PreparedStatement ps;

    public byte[] select(int cedula) {
        byte[] foto = null;
        try {
            conn = new Conexion();
            ps = conn.getConnection()
                    .prepareStatement("select * f_personas_avatar('select',?,null);");
            ps.setInt(1, cedula);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    foto = rs.getBytes("foto");
                }
                rs.close();
                ps.close();
            }
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        }
        return foto;
    }

    public boolean insert_update(Personas_avatar pa, String dml) throws SQLException {
        Boolean control = false;
        try {
            conn = new Conexion();
            ps = conn.getConnection()
                    .prepareStatement("select f_personas_avatar(?,?,?);");
            ps.setString(1, dml);
            ps.setInt(2, pa.getCedula());
            if (pa.getFotoIN() != null) {
                FileInputStream fis = new FileInputStream(pa.getFotoIN());
                ps.setBinaryStream(2, fis, (int) pa.getFotoIN().length());
            } else {
                ps.setNull(2, java.sql.Types.BLOB);
            }
            control = ps.execute();
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            conn.close();
        }
        return control;
    }
}
