/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Roles;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Roles_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Roles> select(Roles rol) throws SQLException {
        ArrayList<Roles> roleslst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT * FROM f_roles('select',?,?);");
            if (rol.getId() != null) {
                ps.setInt(1, rol.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (rol.getDescripcion() != null) {
                ps.setString(2, rol.getDescripcion());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Roles r = new Roles();
                    r.setId(rs.getInt("id"));
                    r.setDescripcion(rs.getString("descripcion"));
                    roleslst.add(r);
                }
                rs.close();
            }
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return roleslst;
    }

    public boolean insert_update(Roles rol, String dml) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT f_roles(?,?,?);");
            ps.setString(1, dml);
            ps.setInt(2, rol.getId());
            ps.setString(3, rol.getDescripcion());
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
                    .prepareStatement("SELECT f_roles('delete',?,null);");
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
