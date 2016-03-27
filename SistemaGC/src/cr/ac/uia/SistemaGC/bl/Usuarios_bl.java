/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Usuarios_db;
import cr.ac.uia.SistemaGC.entities.Usuarios;
import cr.ac.uia.SistemaGC.utils.AES;
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

    public ArrayList<Usuarios> select(Usuarios usuarios) throws SQLException {
        String cedula = "NULL";
        String usuario = "NULL";
        String contrasena = "NULL";
        String nombre = "NULL";
        String apellidos = "NULL";
        String activo = "NULL";
        String observaciones = "NULL";
        String id_rol = "NULL";
        if (usuarios.getCedula() != null) {
            cedula = String.valueOf(usuarios.getCedula());
        }
        if (usuarios.getUsuario() != null) {
            usuario = "'" + usuarios.getUsuario() + "'";
        }
        if (usuarios.getContrasena() != null) {
            contrasena = "'" + usuarios.getContrasena() + "'";
        }
        if (usuarios.getNombre() != null) {
            nombre = "'" + usuarios.getNombre() + "'";
        }
        if (usuarios.getApellidos() != null) {
            apellidos = "'" + usuarios.getApellidos() + "'";
        }
        if (usuarios.getActivo() != null) {
            activo = String.valueOf(usuarios.getActivo());
        }
        if (usuarios.getObservaciones() != null) {
            observaciones = "'" + usuarios.getObservaciones() + "'";
        }
        if (usuarios.getId_rol() != null) {
            id_rol = String.valueOf(usuarios.getId_rol());
        }
        return udb.select(cedula, usuario, contrasena, nombre, apellidos, activo, observaciones, id_rol);
    }

    private boolean insert_update(Usuarios usuarios, String dml) throws SQLException {
        String cedula;
        String usuario;
        String contrasena = "NULL";
        String nombre;
        String apellidos;
        String activo;
        String observaciones;
        String id_rol;
        if (usuarios.getCedula() == null) {
            return false;
        } else {
            cedula = String.valueOf(usuarios.getCedula());
        }
        if (usuarios.getUsuario() == null) {
            return false;
        } else {
            usuario = "'" + usuarios.getUsuario() + "'";
        }
        if (usuarios.getNombre() == null) {
            return false;
        } else {
            nombre = "'" + usuarios.getNombre() + "'";
        }
        if (usuarios.getApellidos() == null) {
            return false;
        } else {
            apellidos = "'" + usuarios.getApellidos() + "'";
        }
        if (usuarios.getContrasena() != null) {
            contrasena = "'" + AES.encrypt(
                    String.valueOf(usuarios.getCedula()),
                    usuarios.getUsuario(),
                    usuarios.getContrasena()) + "'";
        }
        if (usuarios.getActivo() == null) {
            return false;
        } else {
            activo = String.valueOf(usuarios.getActivo());
        }
        if (usuarios.getObservaciones() == null) {
            return false;
        } else {
            observaciones = "'" + usuarios.getObservaciones() + "'";
        }
        if (usuarios.getId_rol() == null) {
            return false;
        } else {
            id_rol = String.valueOf(usuarios.getId_rol());
        }
        return udb.insert_update(cedula, usuario, contrasena, nombre, apellidos, activo, observaciones, id_rol, dml);
    }

    public boolean insert(Usuarios usuarios) throws SQLException {
        return insert_update(usuarios, "insert");
    }

    public boolean update(Usuarios usuarios) throws SQLException {
        return insert_update(usuarios, "update");
    }

    public boolean delete(int cedula) throws SQLException {
        return udb.delete(cedula);
    }

    public Boolean login(Usuarios usuarios) throws SQLException {
        Boolean control = null;
        String contrasena = usuarios.getContrasena();
        ArrayList<Usuarios> al = this.select(usuarios);
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
