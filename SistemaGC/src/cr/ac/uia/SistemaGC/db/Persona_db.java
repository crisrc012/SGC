/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Persona;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Persona_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Persona> select(Persona persona) throws SQLException {
        ArrayList<Persona> personalst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select * from f_persona('select',?,?);");
            if (persona.getId() != null) {
                ps.setInt(1, persona.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (persona.getDescripcion() != null) {
                ps.setString(2, persona.getDescripcion());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Persona p = new Persona();
                    p.setId(rs.getInt("id"));
                    p.setDescripcion(rs.getString("descripcion"));
                    personalst.add(p);
                }
                rs.close();
            }
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return personalst;
    }

    public boolean insert_update(Persona persona, String dml) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT f_persona(?,?,?);");
            ps.setString(1, dml);
            ps.setInt(2, persona.getId());
            ps.setString(2, persona.getDescripcion());
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
                    .prepareStatement("SELECT f_persona('delete',?,null);");
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
