/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Personas_db;
import cr.ac.uia.SistemaGC.entities.Personas;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Personas_bl {

    private final Personas_db pdb;

    public Personas_bl() {
        pdb = new Personas_db();
    }

    public ArrayList<Personas> select(Personas persona) throws SQLException {
        return pdb.select(persona);
    }

    private boolean insert_update(Personas persona, String dml) throws SQLException {
        return pdb.insert_update(persona, dml);
    }

    public boolean insert(Personas personas) throws SQLException {
        return insert_update(personas, "insert");
    }

    public boolean update(Personas personas) throws SQLException {
        return insert_update(personas, "update");
    }

    public boolean delete(int cedula) throws SQLException {
        return pdb.delete(cedula);
    }
}
