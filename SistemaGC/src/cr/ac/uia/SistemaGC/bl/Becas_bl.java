/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Becas_db;
import cr.ac.uia.SistemaGC.entities.Becas;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becas_bl {

    private final Becas_db bdb;

    public Becas_bl() {
        bdb = new Becas_db();
    }

    public ArrayList<Becas> select(Becas becas) throws SQLException, ClassNotFoundException {
        return bdb.select(becas);
    }

    private boolean insert_update(Becas becas, String dml) throws SQLException, ClassNotFoundException {
        return bdb.insert_update(becas, dml);
    }

    public boolean insert(Becas becas) throws SQLException, ClassNotFoundException {
        return insert_update(becas, "insert");
    }

    public boolean update(Becas becas) throws SQLException, ClassNotFoundException {
        return insert_update(becas, "update");
    }

    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        return bdb.delete(id);
    }
}
