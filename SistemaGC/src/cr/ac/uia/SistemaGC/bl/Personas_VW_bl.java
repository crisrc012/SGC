/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Personas_VW_db;
import cr.ac.uia.SistemaGC.entities.Personas_VW;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pao
 */
public class Personas_VW_bl {
    private final Personas_VW_db pdb;

    public Personas_VW_bl() {
        pdb = new Personas_VW_db();
    }

    public ArrayList<Personas_VW> select(Personas_VW personas) throws SQLException, ClassNotFoundException {
        return pdb.select();
    }
}
