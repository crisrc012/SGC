/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.entities;

import java.sql.Date;

/**
 *
 * @author crisrc012
 */
public class Personas {
    private Integer cedula;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private Integer tel_celular;
    private Integer tel_habitacion;
    private String encargado;
    private Integer id_persona;

    public Personas() {
        this.cedula = null;
        this.nombre = null;
        this.apellidos = null;
        this.fecha_nacimiento = null;
        this.tel_celular = null;
        this.tel_habitacion = null;
        this.encargado = null;
        this.id_persona = null;
    }
    
    public Personas(Integer cedula, String nombre, String apellidos, Date fecha_nacimiento, Integer tel_celular, Integer tel_habitacion, String encargado, Integer id_persona) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tel_celular = tel_celular;
        this.tel_habitacion = tel_habitacion;
        this.encargado = encargado;
        this.id_persona = id_persona;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getTel_celular() {
        return tel_celular;
    }

    public void setTel_celular(Integer tel_celular) {
        this.tel_celular = tel_celular;
    }

    public Integer getTel_habitacion() {
        return tel_habitacion;
    }

    public void setTel_habitacion(Integer tel_habitacion) {
        this.tel_habitacion = tel_habitacion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }
}
