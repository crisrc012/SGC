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

    public ArrayList<Persona> select(Persona persona) throws SQLException, ClassNotFoundException {
        return pdb.select(persona);
    }

    private boolean insert_update(Persona persona, String dml) throws SQLException, ClassNotFoundException {
        return pdb.insert_update(persona, dml);
    }

    public boolean insert(Persona persona) throws SQLException, ClassNotFoundException {
        return insert_update(persona, "insert");
    }

    public boolean update(Persona persona) throws SQLException, ClassNotFoundException {
        return insert_update(persona, "update");
    }

    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        return pdb.delete(id);
    }
}
