/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Tiquetes_db;
import cr.ac.uia.SistemaGC.entities.Tiquetes;
import java.io.IOException;
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
    
    public ArrayList<Tiquetes> select(Tiquetes tiquete) throws SQLException {
        return tdb.select(tiquete);
    }
    
    private boolean insert_update(Tiquetes tiquete, String dml) throws SQLException {
        return tdb.insert_update(tiquete, dml);
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
    
    public int count(int cedula, int comida) throws SQLException, IOException {
        return tdb.count(cedula, comida);
    }
    
    public ArrayList<Tiquetes> activos(int id_persona, int id_comida) throws SQLException, IOException{
        return tdb.activos(id_persona, id_comida);
    }
}
