/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Becados_VW;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becados_VW_db {
    
    private Conexion conn;
    private Statement st;
    
    public ArrayList<Becados_VW> select() throws SQLException {
        ArrayList<Becados_VW> becadoslst = null;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM vw_becados;")) {
                becadoslst = new ArrayList<>();
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
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return becadoslst;
    }
    
}
