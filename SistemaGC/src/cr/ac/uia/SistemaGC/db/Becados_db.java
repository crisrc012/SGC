/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Becados;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becados_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Becados> select(Becados becados) throws SQLException, ClassNotFoundException {
        ArrayList<Becados> becadoslst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT * FROM f_becados('select',?,?,?,?,?);");
            if (becados.getId() != null) {
                ps.setInt(1, becados.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (becados.getId_persona() != null) {
                ps.setLong(2, becados.getId_persona());
            } else {
                ps.setNull(2, java.sql.Types.INTEGER);
            }
            if (becados.getId_beca() != null) {
                ps.setInt(3, becados.getId_beca());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }
            if (becados.getActivo() != null) {
                ps.setBoolean(4, becados.getActivo());
            } else {
                ps.setNull(4, java.sql.Types.BOOLEAN);
            }
            if (becados.getObservaciones() != null) {
                ps.setString(5, becados.getObservaciones());
            } else {
                ps.setNull(5, java.sql.Types.VARCHAR);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Becados b = new Becados();
                    b.setId(rs.getInt("id"));
                    b.setId_persona(rs.getLong("id_persona"));
                    b.setId_beca(rs.getInt("id_beca"));
                    b.setActivo(rs.getBoolean("activo"));
                    b.setObservaciones(rs.getString("observaciones"));
                    becadoslst.add(b);
                }
                rs.close();
            }
            ps.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            con.close();
        }
        return becadoslst;
    }

    public boolean insert_update(Becados becados, String dml) throws SQLException, ClassNotFoundException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT f_becados(?,?,?,?,?,?);");
            ps.setString(1, dml);
            if (becados.getId() != null) {
                ps.setInt(2, becados.getId());
            } else {
                ps.setNull(2, java.sql.Types.INTEGER);
            }
            ps.setLong(3, becados.getId_persona());
            ps.setInt(4, becados.getId_beca());
            ps.setBoolean(5, becados.getActivo());
            ps.setString(6, becados.getObservaciones());
            control = ps.execute();
            ps.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            con.close();
        }
        return control;
    }

    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        Boolean control = false;
        try {
            this.con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT f_becados('delete',?, NULL, NULL, NULL, NULL);");
            control = ps.execute();
            ps.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            con.close();
        }
        return control;
    }
}
