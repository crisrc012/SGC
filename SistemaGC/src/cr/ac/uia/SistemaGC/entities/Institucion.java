/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.entities;

import java.io.File;

/**
 *
 * @author crisrc012
 */
public class Institucion {

    private String nombre;
    private File outFoto;
    private byte[] inFoto;
    
    public Institucion() {
        this.nombre = null;
        this.outFoto = null;
        this.inFoto = null;
    }

    public Institucion(String nombre, File outFoto, byte[] inFoto) {
        this.nombre = nombre;
        this.outFoto = outFoto;
        this.inFoto = inFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getOutFoto() {
        return outFoto;
    }

    public void setOutFoto(File outFoto) {
        this.outFoto = outFoto;
    }

    public byte[] getInFoto() {
        return inFoto;
    }

    public void setInFoto(byte[] inFoto) {
        this.inFoto = inFoto;
    }
}
