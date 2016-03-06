/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.entities;

/**
 *
 * @author crobles
 */
public class Personas_avatar {
    private int cedula;
    private byte[] foto;

    public Personas_avatar() {
        
    }
    
    public Personas_avatar(int cedula, byte[] foto) {
        this.cedula = cedula;
        this.foto = foto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
