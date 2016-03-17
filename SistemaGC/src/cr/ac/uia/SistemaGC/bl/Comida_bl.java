/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Comida_db;
import cr.ac.uia.SistemaGC.entities.Comida;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Comida_bl {

    private final Comida_db cdb;
    
    public Comida_bl(){
        cdb = new Comida_db();
    }

    public ArrayList<Comida> select(Comida comida) throws SQLException {
            String id = "NULL";
            String descripcion = "NULL";
            if (null != comida.getId()) {
                id = String.valueOf(comida.getId());
            }
            if (comida.getDescripcion() != null) {
                descripcion = "'" + comida.getDescripcion() + "'";
            }
        return cdb.select(id, descripcion);
    }

    private boolean insert_update(Comida comida, String dml) throws SQLException {
            String id = "NULL";
            String descripcion;
            if (dml.equals("update")) {
                id = String.valueOf(comida.getId());
            }
            if (comida.getDescripcion() == null) {
                return false;
            } else {
                descripcion = "'" + comida.getDescripcion() + "'";
            }
        return cdb.insert_update(id, descripcion, dml);
    }

    public boolean insert(Comida comida) throws SQLException {
        return insert_update(comida, "insert");
    }

    public boolean update(Comida comida) throws SQLException {
        return insert_update(comida, "update");
    }

    public boolean delete(int id) throws SQLException {
        return cdb.delete(id);
    }
}
