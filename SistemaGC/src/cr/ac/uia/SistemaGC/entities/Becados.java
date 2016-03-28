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
public class Becados {

    private Integer id;
    private Integer id_persona;
    private Integer id_beca;
    private Boolean activo;
    private String observaciones;

    public Becados() {
        this.id = null;
        this.id_persona = null;
        this.id_beca = null;
        this.activo = null;
        this.observaciones = null;
    }

    public Becados(Integer id, int id_persona, int id_beca, boolean activo, String observaciones) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_beca = id_beca;
        this.activo = activo;
        this.observaciones = observaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public Integer getId_beca() {
        return id_beca;
    }

    public void setId_beca(Integer id_beca) {
        this.id_beca = id_beca;
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
}
