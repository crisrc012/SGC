/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Usuarios_db;
import cr.ac.uia.SistemaGC.entities.Usuarios;
import cr.ac.uia.SistemaGC.utils.AES;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Usuarios_bl {

    private final Usuarios_db udb;

    public Usuarios_bl() {
        udb = new Usuarios_db();
    }

    public ArrayList<Usuarios> select(Usuarios usuario) throws SQLException, IOException {
        return udb.select(usuario);
    }

    private boolean insert_update(Usuarios usuario, String dml) throws SQLException, IOException {
        return udb.insert_update(usuario, dml);
    }

    public boolean insert(Usuarios usuarios) throws SQLException, IOException {
        return insert_update(usuarios, "insert");
    }

    public boolean update(Usuarios usuarios, boolean updatePass) throws SQLException, IOException {
        if(updatePass){
            return insert_update(usuarios, "update_contrasena");
        } else {
            return insert_update(usuarios, "update");
        }
    }

    public boolean delete(int cedula) throws SQLException, IOException {
        return udb.delete(cedula);
    }

    public Boolean login(Usuarios usuarios) throws SQLException, IOException {
        Boolean control = false;
        String contrasena = usuarios.getContrasena();
        ArrayList<Usuarios> al = select(usuarios);
        if (al.size() > 0) {
            usuarios = al.get(0);
            control = udb.login(usuarios.getUsuario(),
                    AES.encrypt(usuarios.getCedula().toString(),
                            usuarios.getUsuario(),
                            contrasena));
        }
        return control;
    }
}
