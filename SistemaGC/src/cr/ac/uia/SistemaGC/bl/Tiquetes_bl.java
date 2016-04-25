/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Tiquetes_db;
import cr.ac.uia.SistemaGC.entities.Tiquetes;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Tiquetes_bl {
    
    private final Tiquetes_db tdb;
    
    public Tiquetes_bl() {
        tdb = new Tiquetes_db();
    }
    
    public ArrayList<Tiquetes> select(Tiquetes tiquetes) throws SQLException {
        String id = "NULL";
        String id_persona = "NULL";
        String id_precio = "NULL";
        String fecha_compra = "NULL";
        String fecha_uso = "NULL";
        String activo = "NULL";
        if (tiquetes.getId() != null) {
            id = String.valueOf(tiquetes.getId());
        }
        if (tiquetes.getId_persona() != null) {
            id_persona = String.valueOf(tiquetes.getId_persona());
        }
        if (tiquetes.getId_precio() != null) {
            id_precio = String.valueOf(tiquetes.getId_precio());
        }
        if (tiquetes.getFecha_compra() != null) {
            fecha_compra = String.valueOf(tiquetes.getFecha_compra());
        }
        if (tiquetes.getFecha_uso() != null) {
            fecha_uso = String.valueOf(tiquetes.getFecha_uso());
        }
        if (tiquetes.getActivo() != null) {
            activo = String.valueOf(tiquetes.getActivo());
        }
        return tdb.select(id, id_persona, id_precio, fecha_compra, fecha_uso, activo);
    }
    
    private boolean insert_update(Tiquetes tiquetes, String dml) throws SQLException {
        String id = "NULL";
        String id_persona;
        String id_precio;
        String fecha_compra;
        String fecha_uso;
        String activo;
        if (dml.equals("update")) {
            id = String.valueOf(tiquetes.getId());
        }
        if (tiquetes.getId_persona() == null) {
            return false;
        } else {
            id_persona = String.valueOf(tiquetes.getId_persona());
        }
        if (tiquetes.getId_precio() == null) {
            return false;
        } else {
            id_precio = String.valueOf(tiquetes.getId_precio());
        }
        if (tiquetes.getFecha_compra() == null) {
            return false;
        } else {
            fecha_compra = "'" + String.valueOf(tiquetes.getFecha_compra()) + "'";
        }
        if (tiquetes.getFecha_uso() == null) {
            fecha_uso = String.valueOf(tiquetes.getFecha_uso());
        } else {
            fecha_uso = "'" + String.valueOf(tiquetes.getFecha_uso() + "'");
        }
        if (tiquetes.getActivo() == null) {
            return false;
        } else {
            activo = String.valueOf(tiquetes.getActivo());
        }
        return tdb.insert_update(id, id_persona, id_precio, fecha_compra, fecha_uso, activo, dml);
    }
    
    public boolean insert(Tiquetes tiquetes) throws SQLException {
        return insert_update(tiquetes, "insert");
    }
    
    public boolean update(Tiquetes tiquetes) throws SQLException {
        return insert_update(tiquetes, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return tdb.delete(id);
    }
    
    public int count(int cedula, int comida) throws SQLException {
        return tdb.count(cedula, comida);
    }
    
    public ArrayList<Tiquetes> activos(int id_persona, int id_comida) throws SQLException{
        return tdb.activos(id_persona, id_comida);
    }
}
