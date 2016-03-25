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
public class Becados_VW {

    private Integer cedula;
    private String nombre;
    private String apellidos;
    private String descripcion;
    private String beca;
    private Integer porcentaje;
    private Boolean activo;

    public Becados_VW() {
        this.cedula = null;
        this.nombre = null;
        this.apellidos = null;
        this.descripcion = null;
        this.beca = null;
        this.porcentaje = null;
        this.activo = null;
    }

    public Becados_VW(Integer cedula, String nombre, String apellidos, String descripcion, String beca, Integer porcentaje, Boolean activo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.descripcion = descripcion;
        this.beca = beca;
        this.porcentaje = porcentaje;
        this.activo = activo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
