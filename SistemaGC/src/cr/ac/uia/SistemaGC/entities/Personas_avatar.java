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
public class Personas_avatar {

    private Integer cedula;
    private byte[] foto;

    public Personas_avatar() {
        this.cedula = null;
        this.foto = null;
    }

    public Personas_avatar(Integer cedula, byte[] foto) {
        this.cedula = cedula;
        this.foto = foto;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
