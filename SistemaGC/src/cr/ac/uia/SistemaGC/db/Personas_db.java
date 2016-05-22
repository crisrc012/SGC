/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Personas;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Personas_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Personas> select(Personas persona) throws SQLException {
        ArrayList<Personas> personaslst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT * FROM f_personas('select',?,?,?,?,?,?,?,?);");
            if (persona.getCedula() != null) {
                ps.setLong(1, persona.getCedula());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (persona.getNombre() != null) {
                ps.setString(2, persona.getNombre());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            if (persona.getApellidos() != null) {
                ps.setString(3, persona.getApellidos());
            } else {
                ps.setNull(3, java.sql.Types.VARCHAR);
            }
            if (persona.getFecha_nacimiento() != null) {
                ps.setDate(4, (java.sql.Date) persona.getFecha_nacimiento());
            } else {
                ps.setNull(4, java.sql.Types.DATE);
            }
            if (persona.getTel_celular() != null) {
                ps.setInt(5, persona.getTel_celular());
            } else {
                ps.setNull(5, java.sql.Types.INTEGER);
            }
            if (persona.getTel_habitacion() != null) {
                ps.setInt(6, persona.getTel_habitacion());
            } else {
                ps.setNull(6, java.sql.Types.INTEGER);
            }
            if (persona.getEncargado() != null) {
                ps.setString(7, persona.getEncargado());
            } else {
                ps.setNull(7, java.sql.Types.VARCHAR);
            }
            if (persona.getId_persona() != null) {
                ps.setInt(8, persona.getId_persona());
            } else {
                ps.setNull(8, java.sql.Types.INTEGER);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Personas p = new Personas();
                    p.setCedula(rs.getLong("cedula"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellidos(rs.getString("apellidos"));
                    p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                    p.setTel_celular(rs.getInt("tel_celular"));
                    p.setTel_habitacion(rs.getInt("tel_habitacion"));
                    p.setEncargado(rs.getString("encargado"));
                    p.setId_persona(rs.getInt("id_persona"));
                    personaslst.add(p);
                }
                rs.close();
            }
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return personaslst;
    }

    public boolean insert_update(Personas persona, String dml) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select * from f_personas(?,?,?,?,?,?,?,?,?);");
            ps.setString(1, dml);
            ps.setLong(2, persona.getCedula());
            ps.setString(3, persona.getNombre());
            ps.setString(4, persona.getApellidos());
            ps.setDate(5, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
            if (persona.getTel_celular() != null) {
                ps.setInt(6, persona.getTel_celular());
            } else {
                ps.setNull(6, java.sql.Types.INTEGER);
            }
            if (persona.getTel_habitacion() != null) {
                ps.setInt(7, persona.getTel_habitacion());
            } else {
                ps.setNull(7, java.sql.Types.INTEGER);
            }
            ps.setString(8, persona.getEncargado());
            ps.setInt(9, persona.getId_persona());
            control = ps.execute();
            ps.close();
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            con.close();
        }
        return control;
    }

    public boolean delete(int cedula) throws SQLException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_personas('delete',?,null,null,null,null,null,null,null);");
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
