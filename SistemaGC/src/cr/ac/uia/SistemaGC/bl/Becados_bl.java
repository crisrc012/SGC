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
        String id = "NULL";
        String id_persona = "NULL";
        String id_beca = "NULL";
        String activo = "NULL";
        String observaciones = "NULL";
        if (null != becados.getId()) {
            id = String.valueOf(becados.getId());
        }
        if (becados.getId_persona() != null) {
            id_persona = String.valueOf(becados.getId_persona());
        }
        if (null != becados.getId_beca()) {
            id = String.valueOf(becados.getId_beca());
        }
        if (becados.getActivo() != null) {
            activo = String.valueOf(becados.getActivo());
        }
        if (becados.getObservaciones() != null) {
            observaciones = "'" + becados.getObservaciones() + "'";
        }
        return bdb.select(id, id_persona, id_beca, activo, observaciones);
    }
    
    private boolean insert_update(Becados becados, String dml) throws SQLException {
        String id = "NULL";
        String id_persona;
        String id_beca;
        String activo;
        String observaciones;
        if (dml.equals("update")) {
            id = String.valueOf(becados.getId());
        }
        if (becados.getId_persona() == null) {
            return false;
        } else {
            id_persona = String.valueOf(becados.getId_persona());
        }
        if (becados.getId_beca() == null) {
            return false;
        } else {
            id_beca = String.valueOf(becados.getId_beca());
        }
        if (becados.getActivo() == null) {
            return false;
        } else {
            activo = String.valueOf(becados.getActivo());
        }
        if (becados.getObservaciones() == null) {
            return false;
        } else {
            observaciones = becados.getObservaciones();
        }
        return bdb.insert_update(id, id_persona, id_beca, activo, observaciones, dml);
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
