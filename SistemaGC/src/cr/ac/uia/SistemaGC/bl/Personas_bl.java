/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Personas_db;
import cr.ac.uia.SistemaGC.entities.Personas;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Personas_bl {

    private final Personas_db pdb;

    public Personas_bl() {
        pdb = new Personas_db();
    }

    public ArrayList<Personas> select(Personas personas) throws SQLException {
        String cedula = "NULL";
        String nombre = "NULL";
        String apellidos = "NULL";
        String fecha_nacimiento = "NULL";
        String tel_celular = "NULL";
        String tel_habitacion = "NULL";
        String encargado = "NULL";
        String id_persona = "NULL";
        if (personas.getCedula() != null) {
            cedula = String.valueOf(personas.getCedula());
        }
        if (personas.getNombre() != null) {
            nombre = "'" + personas.getNombre() + "'";
        }
        if (personas.getApellidos() != null) {
            apellidos = "'" + personas.getApellidos() + "'";
        }
        if (personas.getFecha_nacimiento() != null) {
            fecha_nacimiento = "'" + String.valueOf(personas.getFecha_nacimiento()) + "'";
        }
        if (personas.getTel_celular() != null) {
            tel_celular = String.valueOf(personas.getTel_celular());
        }
        if (personas.getTel_habitacion() != null) {
            tel_habitacion = String.valueOf(personas.getTel_habitacion());
        }
        if (personas.getEncargado() != null) {
            encargado = "'" + personas.getEncargado() + "'";
        }
        if (personas.getId_persona() != null) {
            id_persona = String.valueOf(personas.getId_persona());
        }
        return pdb.select(cedula, nombre, apellidos, fecha_nacimiento, tel_celular, tel_habitacion, encargado, id_persona);
    }

    private boolean insert_update(Personas personas, String dml) throws SQLException {
        String cedula;
        String nombre;
        String apellidos;
        String fecha_nacimiento;
        String tel_celular;
        String tel_habitacion;
        String encargado;
        String id_persona;
        if (personas.getCedula() == null) {
            return false;
        } else {
            cedula = String.valueOf(personas.getCedula());
        }
        if (personas.getNombre() == null) {
            return false;
        } else {
            nombre = "'" + personas.getNombre() + "'";
        }
        if (personas.getApellidos() == null) {
            return false;
        } else {
            apellidos = "'" + personas.getApellidos() + "'";
        }
        if (personas.getFecha_nacimiento() == null) {
            return false;
        } else {
            fecha_nacimiento = "'" + String.valueOf(personas.getFecha_nacimiento()) + "'";
        }
        if (personas.getTel_celular() == null) {
            return false;
        } else {
            tel_celular = String.valueOf(personas.getTel_celular());
        }
        if (personas.getTel_habitacion() == null) {
            return false;
        } else {
            tel_habitacion = String.valueOf(personas.getTel_habitacion());
        }
        if (personas.getEncargado() == null) {
            return false;
        } else {
            encargado = "'" + personas.getEncargado() + "'";
        }
        if (personas.getId_persona() == null) {
            return false;
        } else {
            id_persona = String.valueOf(personas.getId_persona());
        }
        return pdb.insert_update(cedula, nombre, apellidos, fecha_nacimiento, tel_celular, tel_habitacion, encargado, id_persona, dml);
    }

    public boolean insert(Personas personas) throws SQLException {
        return insert_update(personas, "insert");
    }

    public boolean update(Personas personas) throws SQLException {
        return insert_update(personas, "update");
    }

    public boolean delete(int cedula) throws SQLException {
        return pdb.delete(cedula);
    }
}
