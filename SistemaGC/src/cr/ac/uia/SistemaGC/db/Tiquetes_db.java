/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Tiquetes;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Tiquetes_db {

    private Conexion conn;
    private Statement st;

    public ArrayList<Tiquetes> select(String id, String id_persona, String id_precio, String fecha_compra, String fecha_uso, String activo) throws SQLException {
        ArrayList<Tiquetes> tiqueteslst = new ArrayList<>();
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_tiquetes('select',"
                    + id + ", "
                    + id_persona + ", "
                    + id_precio + ", "
                    + fecha_compra + ", "
                    + fecha_uso + ", "
                    + activo + ");")) {
                while (rs.next()) {
                    Tiquetes p = new Tiquetes();
                    p.setId(rs.getInt("id"));
                    p.setId_persona(rs.getInt("id_persona"));
                    p.setId_precio(rs.getInt("id_precio"));
                    p.setFecha_compra(rs.getDate("fecha_compra"));
                    p.setFecha_uso(rs.getDate("fecha_uso"));
                    p.setActivo(rs.getBoolean("activo"));
                    tiqueteslst.add(p);
                }
                rs.close();
            }
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return tiqueteslst;
    }

    public boolean insert_update(String id, String id_persona, String id_precio, String fecha_compra, String fecha_uso, String activo, String dml) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_tiquetes('"
                    + dml + "', "
                    + id + ", "
                    + id_persona + ", "
                    + id_precio + ", "
                    + fecha_compra + ", "
                    + fecha_uso + ", "
                    + activo + ");");
            control = true;
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return control;
    }

    public boolean delete(int id) throws SQLException {
        Boolean control = false;
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_tiquetes('delete',"
                    + id + ", NULL, NULL, NULL, NULL, NULL);");
            control = true;
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return control;
    }

    public int count(int id_persona, int id_comida) throws SQLException, IOException {
        int cantidad = 0;
        this.conn = new Conexion();
        this.st = conn.getConnection().createStatement();
        try (ResultSet rs = this.st.executeQuery(
                "select count(*) from tbl_tiquetes t inner join tbl_precio p on t.id_precio = p.id and t.activo = true and p.id_comida =  "
                        + id_comida +"group by t.id_persona having t.id_persona = "
                        + id_persona + ";")) {
            while (rs.next()) {
                cantidad = rs.getInt("count");
            }
            rs.close();
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
        return cantidad;
    }

    public ArrayList<Tiquetes> activos(int id_persona, int id_comida) throws SQLException, IOException {
        ArrayList<Tiquetes> tiqueteslst = new ArrayList<>();
        try {
            this.conn = new Conexion();
            this.st = conn.getConnection().createStatement();
            try (ResultSet rs = this.st.executeQuery(
                    "select * from tbl_tiquetes t inner join tbl_precio p on t.id_persona = "
                    + id_persona
                    + "and t.id_precio = p.id and p.id_comida = "
                    + id_comida
                    + " and t.activo = true;")) {
                while (rs.next()) {
                    Tiquetes p = new Tiquetes();
                    p.setId(rs.getInt("id"));
                    p.setId_persona(rs.getInt("id_persona"));
                    p.setId_precio(rs.getInt("id_precio"));
                    p.setFecha_compra(rs.getDate("fecha_compra"));
                    p.setFecha_uso(rs.getDate("fecha_uso"));
                    p.setActivo(rs.getBoolean("activo"));
                    tiqueteslst.add(p);
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
        return tiqueteslst;
    }
}
