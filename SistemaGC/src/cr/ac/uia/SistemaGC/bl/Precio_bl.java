/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Precio_db;
import cr.ac.uia.SistemaGC.entities.Precio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Precio_bl {
    
    private final Precio_db pdb;
    
    public Precio_bl() {
        pdb = new Precio_db();
    }
    
    public ArrayList<Precio> select(Precio precio) throws SQLException {
        String id = "NULL";
        String id_persona = "NULL";
        String id_comida = "NULL";
        String _precio = "NULL";
        if (precio.getId() != null) {
            id = String.valueOf(precio.getId());
        }
        if (precio.getId_persona() != null) {
            id_persona = String.valueOf(precio.getId_persona());
        }
        if (precio.getId_comida() != null) {
            id_comida = String.valueOf(precio.getId_comida());
        }
        if (precio.getPrecio() != null) {
            _precio = String.valueOf(precio.getPrecio());
        }
        return pdb.select(id, id_persona, id_comida, _precio);
    }
    
    private boolean insert_update(Precio precio, String dml) throws SQLException {
        String id = "NULL";
        String id_persona;
        String id_comida;
        String _precio;
        if (dml.equals("update")) {
            id = String.valueOf(precio.getId());
        }
        if (precio.getId_persona() == null) {
            return false;
        } else {
            id_persona = String.valueOf(precio.getId_persona());
        }
        if (precio.getId_comida() == null) {
            return false;
        } else {
            id_comida = String.valueOf(precio.getId_comida());
        }
        if (precio.getPrecio() == null) {
            return false;
        } else {
            _precio = String.valueOf(precio.getPrecio());
        }
        return pdb.insert_update(id, id_persona, id_comida, _precio, dml);
    }
    
    public boolean insert(Precio precio) throws SQLException {
        return insert_update(precio, "insert");
    }
    
    public boolean update(Precio precio) throws SQLException {
        return insert_update(precio, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return pdb.delete(id);
    }
}
