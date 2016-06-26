/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Precio;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Precio_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Precio> select(Precio precio) throws SQLException {
        ArrayList<Precio> preciolst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT * FROM f_precio('select',?,?,?,?);");
            if (precio.getId() != null) {
                ps.setInt(1, precio.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (precio.getId_persona() != null) {
                ps.setInt(2, precio.getId_persona());
            } else {
                ps.setNull(2, java.sql.Types.INTEGER);
            }
            if (precio.getId_comida() != null) {
                ps.setInt(3, precio.getId_comida());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }
            if (precio.getPrecio() != null) {
                ps.setInt(4, precio.getPrecio());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Precio p = new Precio();
                    p.setId(rs.getInt("id"));
                    p.setId_persona(rs.getInt("id_persona"));
                    p.setId_comida(rs.getInt("id_comida"));
                    p.setPrecio(rs.getInt("precio"));
                    preciolst.add(p);
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
        return preciolst;
    }

    public boolean insert_update(Precio precio, String dml) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection().prepareStatement("SELECT f_precio(?,?,?,?,?);");
            ps.setString(1, dml);
            ps.setInt(2, precio.getId());
            ps.setInt(3, precio.getId_persona());
            ps.setInt(4, precio.getId_comida());
            ps.setInt(5, precio.getPrecio());
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

    public boolean delete(int id) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_precio('delete',?,null,null,null);");
            ps.setInt(1, id);
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
