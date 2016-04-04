/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Personas_avatar_db;
import cr.ac.uia.SistemaGC.entities.Personas_avatar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author crisrc012
 */
public class Personas_avatar_bl {

    private final Personas_avatar_db padb;

    public Personas_avatar_bl() {
        padb = new Personas_avatar_db();
    }

    public byte[] select(int cedula) throws SQLException {
        return padb.select(cedula);
    }

    private boolean insert_update(Personas_avatar personas_avatar, String dml) throws FileNotFoundException, SQLException, IOException {
        return padb.insert_update(personas_avatar.getCedula(), personas_avatar.getFotoIN(), dml);
    }

    public boolean insert(Personas_avatar personas_avatar) throws SQLException, IOException {
        return insert_update(personas_avatar, "insert");
    }

    public boolean update(Personas_avatar personas_avatar) throws SQLException, IOException {
        return insert_update(personas_avatar, "update");
    }

    public boolean delete(int cedula) throws SQLException {
        return padb.delete(cedula);
    }
}
