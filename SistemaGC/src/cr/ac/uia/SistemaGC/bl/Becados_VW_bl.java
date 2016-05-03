/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Becados_VW_db;
import cr.ac.uia.SistemaGC.entities.Becados_VW;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Becados_VW_bl {

    private final Becados_VW_db bdb;

    public Becados_VW_bl() {
        bdb = new Becados_VW_db();
    }

    public ArrayList<Becados_VW> select(Becados_VW becados) throws SQLException {
        return bdb.select();
    }
}
