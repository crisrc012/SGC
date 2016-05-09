/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Roles_db;
import cr.ac.uia.SistemaGC.entities.Roles;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Roles_bl {
    
    private final Roles_db rdb;
    
    public Roles_bl() {
        rdb = new Roles_db();
    }
    
    public ArrayList<Roles> select(Roles rol) throws SQLException {
        return rdb.select(rol);
    }
    
    private boolean insert_update(Roles rol, String dml) throws SQLException {
        return rdb.insert_update(rol, dml);
    }
    
    public boolean insert(Roles rol) throws SQLException {
        return insert_update(rol, "insert");
    }
    
    public boolean update(Roles rol) throws SQLException {
        return insert_update(rol, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return rdb.delete(id);
    }
}
