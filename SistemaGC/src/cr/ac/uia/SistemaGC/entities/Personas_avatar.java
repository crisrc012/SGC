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

    private Long cedula;
    private File foto;

    public Personas_avatar() {
        this.cedula = null;
        this.foto = null;
    }

    public Personas_avatar(Long cedula, File foto) {
        this.cedula = cedula;
        this.foto = foto;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }
}
