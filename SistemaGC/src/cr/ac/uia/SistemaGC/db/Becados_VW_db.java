/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Becados_VW;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 *
 * @author crisrc012
 */
public class Becados_VW_db {

    private Conexion conn;
    private PreparedStatement ps;

    public ArrayList<Becados_VW> select() throws SQLException, ClassNotFoundException {
        ArrayList<Becados_VW> becadoslst = new ArrayList<>();
        try {
            conn = new Conexion();
            ps = conn.getConnection()
                    .prepareStatement("SELECT * FROM vw_becados;");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Becados_VW b = new Becados_VW();
                    b.setCedula(rs.getInt("cedula"));
                    b.setNombre(rs.getString("nombre"));
                    b.setApellidos(rs.getString("apellidos"));
                    b.setDescripcion(rs.getString("descripcion"));
                    b.setBeca(rs.getString("beca"));
                    b.setPorcentaje(rs.getInt("porcentaje"));
                    b.setActivo(rs.getBoolean("activo"));
                    becadoslst.add(b);
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
        return becadoslst;
    }
}
