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

    private Conexion con;
    private PreparedStatement ps;

    public byte[] select(Long cedula) throws SQLException {
        byte[] foto = null;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select foto from f_personas_avatar('select',?,null);");
            ps.setLong(1, cedula);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    foto = rs.getBytes("foto");
                }
                rs.close();
            }
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return foto;
    }

    public boolean insert_update(Personas_avatar pa, String dml) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_personas_avatar(?,?,?);");
            ps.setString(1, dml);
            ps.setLong(2, pa.getCedula());
            if (pa.getFoto() != null) {
                FileInputStream fis = new FileInputStream(pa.getFoto());
                ps.setBinaryStream(3, fis, (int) pa.getFoto().length());
            } else {
                ps.setNull(3, java.sql.Types.ARRAY);
            }
            control = ps.execute();
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return control;
    }
}
