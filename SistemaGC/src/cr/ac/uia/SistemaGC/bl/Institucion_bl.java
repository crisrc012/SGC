/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Institucion_db;
import cr.ac.uia.SistemaGC.db.Institucion_db;
import cr.ac.uia.SistemaGC.entities.Institucion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author crisrc012
 */
public class Institucion_bl {

    private final Institucion_db idb;

    public Institucion_bl() {
        idb = new Institucion_db();
    }

    public Institucion select() throws SQLException {
        return idb.select();
    }

    public boolean update(Institucion i) throws SQLException {
        return idb.update(i);
    }
}
