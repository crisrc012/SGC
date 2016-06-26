/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import cr.ac.uia.SistemaGC.entities.Tiquetes;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Tiquetes_db {

    private Conexion con;
    private PreparedStatement ps;

    public ArrayList<Tiquetes> select(Tiquetes tiquete) throws SQLException, ClassNotFoundException {
        ArrayList<Tiquetes> tiqueteslst = new ArrayList<>();
        try {
            this.con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("SELECT * FROM f_tiquetes('select',?,?,?,?,?,?);");
            if (tiquete.getId() != null) {
                ps.setInt(1, tiquete.getId());
            } else {
                ps.setNull(1, java.sql.Types.INTEGER);
            }
            if (tiquete.getId_persona() != null) {
                ps.setInt(2, tiquete.getId_persona());
            } else {
                ps.setNull(2, java.sql.Types.INTEGER);
            }
            if (tiquete.getId_precio() != null) {
                ps.setInt(3, tiquete.getId_precio());
            } else {
                ps.setNull(3, java.sql.Types.INTEGER);
            }
            if (tiquete.getFecha_compra() != null) {
                ps.setDate(4, tiquete.getFecha_compra());
            } else {
                ps.setNull(4, java.sql.Types.DATE);
            }
            if (tiquete.getFecha_uso() != null) {
                ps.setDate(5, tiquete.getFecha_uso());
            } else {
                ps.setNull(5, java.sql.Types.DATE);
            }
            if (tiquete.getActivo() != null) {
                ps.setBoolean(6, tiquete.getActivo());
            } else {
                ps.setNull(6, java.sql.Types.BOOLEAN);
            }
            try (ResultSet rs = ps.executeQuery()) {
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
            ps.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            con.close();
        }
        return tiqueteslst;
    }

    public boolean insert_update(Tiquetes tiquete, String dml) throws SQLException, ClassNotFoundException {
        Boolean control = false;
        try {
            con = new Conexion();
            ps = con.getConnection().prepareStatement("SELECT f_tiquetes(?,?,?,?,?,?,?);");
            ps.setString(1, dml);
            ps.setInt(2, tiquete.getId());
            ps.setInt(3, tiquete.getId_persona());
            ps.setInt(4, tiquete.getId_precio());
            ps.setDate(5, tiquete.getFecha_compra());
            if (tiquete.getFecha_uso() != null) {
                ps.setDate(6, tiquete.getFecha_uso());
            } else {
                ps.setNull(6, java.sql.Types.DATE);
            }
            ps.setBoolean(7, tiquete.getActivo());
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
            con = new Conexion();
            ps = con.getConnection()
                    .prepareStatement("select f_tiquetes('delete',?,null,null,null,null,null);");
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

    public int count(Long id_persona, Integer id_comida) throws SQLException, IOException, ClassNotFoundException {
        int cantidad = 0;
        con = new Conexion();
        ps = con.getConnection()
                .prepareStatement("select count(*) from tbl_tiquetes t inner join tbl_precio p on t.id_precio = p.id and t.activo = true and p.id_comida = ? group by t.id_persona having t.id_persona = ?;");
        ps.setInt(1, id_comida);
        ps.setLong(2, id_persona);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                cantidad = rs.getInt("count");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            con.close();
        }
        return cantidad;
    }

    public ArrayList<Tiquetes> activos(Long id_persona, Integer id_comida) throws SQLException, IOException, ClassNotFoundException {
        ArrayList<Tiquetes> tiqueteslst = new ArrayList<>();
        try {
            con = new Conexion();
            ps = con.getConnection().prepareStatement("select * from tbl_tiquetes t inner join tbl_precio p on t.id_persona = ? and t.id_precio = p.id and p.id_comida = ? and t.activo = true;");
            ps.setLong(1, id_persona);
            ps.setInt(2, id_comida);
            try (ResultSet rs = ps.executeQuery()) {
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
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        } finally {
            con.close();
        }
        return tiqueteslst;
    }
}
