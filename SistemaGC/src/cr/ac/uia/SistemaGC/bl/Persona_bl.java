/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Persona_db;
import cr.ac.uia.SistemaGC.entities.Persona;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Persona_bl {
    
    private final Persona_db pdb;
    
    public Persona_bl() {
        pdb = new Persona_db();
    }
    
    public ArrayList<Persona> select(Persona persona) throws SQLException {
        String id = "NULL";
        String descripcion = "NULL";
        if (null != persona.getId()) {
            id = String.valueOf(persona.getId());
        }
        if (persona.getDescripcion() != null) {
            descripcion = "'" + persona.getDescripcion() + "'";
        }
        return pdb.select(id, descripcion);
    }
    
    private boolean insert_update(Persona persona, String dml) throws SQLException {
        String id = "NULL";
        String descripcion;
        if (dml.equals("update")) {
            id = String.valueOf(persona.getId());
        }
        if (persona.getDescripcion() == null) {
            return false;
        } else {
            descripcion = "'" + persona.getDescripcion() + "'";
        }
        return pdb.insert_update(id, descripcion, dml);
    }
    
    public boolean insert(Persona persona) throws SQLException {
        return insert_update(persona, "insert");
    }
    
    public boolean update(Persona persona) throws SQLException {
        return insert_update(persona, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return pdb.delete(id);
    }
}
