/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.entities;

/**
 *
 * @author crisrc012
 */
public class Usuarios {

    private Integer cedula;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private Boolean activo;
    private String observaciones;
    private Integer id_rol;

    public Usuarios() {
        this.cedula = null;
        this.usuario = null;
        this.contrasena = null;
        this.nombre = null;
        this.activo = null;
        this.observaciones = null;
        this.id_rol = null;
    }

    public Usuarios(Integer cedula, String usuario, String contrasena, String nombre_completo, Boolean activo, String observaciones, Integer id_rol) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre_completo;
        this.activo = activo;
        this.observaciones = observaciones;
        this.id_rol = id_rol;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }
}
