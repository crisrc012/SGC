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
public class Personas_avatar {

    private Integer cedula;
    private File fotoIN;
    private byte[] fotoOUT;

    public Personas_avatar() {
        this.cedula = null;
        this.fotoIN = null;
        this.fotoOUT = null;
    }

    public Personas_avatar(Integer cedula, File foto) {
        this.cedula = cedula;
        this.fotoIN = foto;
    }
    
    public Personas_avatar(Integer cedula, byte[] foto) {
        this.cedula = cedula;
        this.fotoOUT = foto;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public File getFotoIN() {
        return fotoIN;
    }

    public void setFotoIN(File fotoIN) {
        this.fotoIN = fotoIN;
    }

    public byte[] getFotoOUT() {
        return fotoOUT;
    }

    public void setFotoOUT(byte[] fotoOUT) {
        this.fotoOUT = fotoOUT;
    }
    
}
