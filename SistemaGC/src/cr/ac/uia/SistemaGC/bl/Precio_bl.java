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
        return pdb.select(precio);
    }
    
    private boolean insert_update(Precio precio, String dml) throws SQLException {
        return pdb.insert_update(precio, dml);
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
