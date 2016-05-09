/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Comida;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crobles
 */
public class Comida_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Comida> select(Comida comida) throws SQLException {
        ArrayList<Comida> comidalst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT * FROM f_comida('select',?,?);");
            if (comida.getId() != null) {
                ps.setInt(1, comida.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (comida.getDescripcion() != null) {
                ps.setString(2, comida.getDescripcion());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Comida c = new Comida();
                    c.setId(rs.getInt("id"));
                    c.setDescripcion(rs.getString("descripcion"));
                    comidalst.add(c);
                }
                rs.close();
            }
            ps.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return comidalst;
    }

    public boolean insert_update(Comida comida, String dml) throws SQLException {
        Boolean control = false;
        try {
            ps = con.getConnection()
                    .prepareStatement("SELECT f_comida(?,?,?);");
            ps.setString(1, dml);
            ps.setInt(2, comida.getId());
            ps.setString(3, comida.getDescripcion());
            control = ps.execute();
            ps.close();
        } catch (SQLException e) {
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
                    .prepareStatement("SELECT f_comida('delete',?,null);");
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
