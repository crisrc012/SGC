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
    
    public ArrayList<Becas> select(Becas becas) throws SQLException {
        String id = "NULL";
        String nombre = "NULL";
        String porcentaje = "NULL";
        String activo = "NULL";
        String observaciones = "NULL";
        if (becas.getId() != null) {
            id = String.valueOf(becas.getId());
        }
        if (becas.getNombre() != null) {
            nombre = "'" + becas.getNombre() + "'";
        }
        if (becas.getPorcentaje() != null) {
            porcentaje = String.valueOf(becas.getPorcentaje());
        }
        if (becas.getActivo() != null) {
            activo = String.valueOf(becas.getActivo());
        }
        if (becas.getObservaciones() != null) {
            observaciones = "'" + String.valueOf(becas.getObservaciones()) + "'";
        }
        return bdb.select(id, nombre, porcentaje, activo, observaciones);
    }
    
    private boolean insert_update(Becas becas, String dml) throws SQLException {
        String id = "NULL";
        String nombre;
        String porcentaje;
        String activo;
        String observaciones;
        if (dml.equals("update")) {
            id = String.valueOf(becas.getId());
        }
        if (becas.getNombre() == null) {
            return false;
        } else {
            nombre = "'" + becas.getNombre() + "'";
        }
        if (becas.getPorcentaje() == null) {
            return false;
        } else {
            porcentaje = String.valueOf(becas.getPorcentaje());
        }
        if (becas.getActivo() == null) {
            return false;
        } else {
            activo = String.valueOf(becas.getActivo());
        }
        if (becas.getObservaciones() == null) {
            return false;
        } else {
            observaciones = "'" + String.valueOf(becas.getObservaciones()) + "'";
        }
        return bdb.insert_update(id, nombre, porcentaje, activo, observaciones, dml);
    }
    
    public boolean insert(Becas becas) throws SQLException {
        return insert_update(becas, "insert");
    }
    
    public boolean update(Becas becas) throws SQLException {
        return insert_update(becas, "update");
    }
    
    public boolean delete(int id) throws SQLException {
        return bdb.delete(id);
    }
}
