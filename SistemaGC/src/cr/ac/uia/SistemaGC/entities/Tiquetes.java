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
public class Tiquetes {
    private Integer id;
    private Integer id_persona;
    private Integer id_precio;
    private Date fecha_compra;
    private Date fecha_uso;
    private Boolean activo;

    public Tiquetes() {
        this.id = null;
        this.id_persona = null;
        this.id_precio = null;
        this.fecha_compra = null;
        this.fecha_uso = null;
        this.activo = null;
    }
    
    public Tiquetes(Integer id, Integer id_persona, Integer id_precio, Date fecha_compra, Date fecha_uso, Boolean activo) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_precio = id_precio;
        this.fecha_compra = fecha_compra;
        this.fecha_uso = fecha_uso;
        this.activo = activo;
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

    public Integer getId_precio() {
        return id_precio;
    }

    public void setId_precio(Integer id_precio) {
        this.id_precio = id_precio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Date getFecha_uso() {
        return fecha_uso;
    }

    public void setFecha_uso(Date fecha_uso) {
        this.fecha_uso = fecha_uso;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
