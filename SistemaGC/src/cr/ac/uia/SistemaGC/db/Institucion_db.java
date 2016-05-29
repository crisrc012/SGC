/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Institucion;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author crisrc012
 */
public class Institucion_db {

    private Conexion con;
    private PreparedStatement ps;

    public Institucion select() throws SQLException {
        Institucion institucion = new Institucion();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select * from f_institucion('select',null,null);");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    institucion.setNombre(rs.getString("nombre"));
                    institucion.setInFoto(rs.getBytes("foto"));
                }
                rs.close();
            }
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return institucion;
    }

    public boolean update(Institucion i) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_institucion('update',?,?);");
            ps.setString(1, i.getNombre());
            if (i.getOutFoto() != null) {
                FileInputStream fis = new FileInputStream(i.getOutFoto());
                ps.setBinaryStream(2, fis, (int) i.getOutFoto().length());
            } else {
                ps.setNull(2, java.sql.Types.ARRAY);
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
