/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Becados_db;
import cr.ac.uia.SistemaGC.entities.Becados;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becados_bl {
    
    private final Becados_db bdb;
    
    public Becados_bl() {
        bdb = new Becados_db();
    }
    
    public ArrayList<Becados> select(Becados becados) throws SQLException {
        return bdb.select(becados);
    }
    
    private boolean insert_update(Becados becados, String dml) throws SQLException {
        return bdb.insert_update(becados, dml);
    }
    
    public boolean insert(Becados becados) throws SQLException {
        return insert_update(becados, "insert");
    }
    
    public boolean update(Becados becados) throws SQLException {
        return insert_update(becados, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return bdb.delete(id);
    }
}
