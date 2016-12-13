/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Personas_VW;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pao
 */
public class Personas_VW_db {
    private Conexion conn;
    private PreparedStatement ps;

    public ArrayList<Personas_VW> select() throws SQLException, ClassNotFoundException {
        ArrayList<Personas_VW> personlst = new ArrayList<>();
        try {
            conn = new Conexion();
            ps = conn.getConnection()
                    .prepareStatement("SELECT * FROM vw_personas;");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Personas_VW p = new Personas_VW();
                    p.setCedula(rs.getLong("cedula"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellidos(rs.getString("apellidos"));
                    p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                    p.setTel_celular(rs.getInt("tel_celular"));
                    p.setTel_habitacion(rs.getInt("tel_habitacion"));
                    p.setEncargado(rs.getString("encargado"));
                    p.setActivo(rs.getBoolean("activo"));
                    p.setDescripcion(rs.getString("descripcion"));
                    personlst.add(p);
                }
                rs.close();
                ps.close();
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            conn.close();
        }
        return personlst;
    }
}
