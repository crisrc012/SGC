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
    
    public ArrayList<Roles> select(Roles roles) throws SQLException {
        String id = "NULL";
        String descripcion = "NULL";
        if (null != roles.getId()) {
            id = String.valueOf(roles.getId());
        }
        if (roles.getDescripcion() != null) {
            descripcion = "'" + roles.getDescripcion() + "'";
        }
        return rdb.select(id, descripcion);
    }
    
    private boolean insert_update(Roles roles, String dml) throws SQLException {
        String id = "NULL";
        String descripcion;
        if (dml.equals("update")) {
            id = String.valueOf(roles.getId());
        }
        if (roles.getDescripcion() == null) {
            return false;
        } else {
            descripcion = "'" + roles.getDescripcion() + "'";
        }
        return rdb.insert_update(id, descripcion, dml);
    }
    
    public boolean insert(Roles roles) throws SQLException {
        return insert_update(roles, "insert");
    }
    
    public boolean update(Roles roles) throws SQLException {
        return insert_update(roles, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return rdb.delete(id);
    }
}
