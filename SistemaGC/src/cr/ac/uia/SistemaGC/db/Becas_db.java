/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Becas;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becas_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Becas> select(Becas becas) throws SQLException {
        ArrayList<Becas> becaslst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select * from f_becas('select',?,?,?,?,?);");
            if (becas.getId() != null) {
                ps.setInt(1, becas.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (becas.getNombre() != null) {
                ps.setString(2, becas.getNombre());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            if (becas.getPorcentaje() != null) {
                ps.setInt(3, becas.getPorcentaje());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }
            if (becas.getActivo() != null) {
                ps.setBoolean(4, becas.getActivo());
            } else {
                ps.setNull(4, java.sql.Types.BOOLEAN);
            }
            if (becas.getObservaciones() != null) {
                ps.setString(5, becas.getObservaciones());
            } else {
                ps.setNull(5, java.sql.Types.VARCHAR);
            }
            try (ResultSet rs = ps.executeQuery()) {
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
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return becaslst;
    }

    public boolean insert_update(Becas becas, String dml) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_becas(?,?,?,?,?,?);");
            ps.setString(1, dml);
            if (becas.getId() != null) {
                ps.setInt(2, becas.getId());
            } else {
                ps.setNull(2, java.sql.Types.INTEGER);
            }
            ps.setString(3, becas.getNombre());
            ps.setInt(4, becas.getPorcentaje());
            ps.setBoolean(5, becas.getActivo());
            ps.setString(6, becas.getObservaciones());
            control = ps.execute();
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return control;
    }

    public boolean delete(int id) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT f_becas('delete',?,NULL,NULL,NULL,NULL);");
            ps.setInt(1, id);
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
