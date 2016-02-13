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
public class Precio {
    private Integer id;
    private Integer id_persona;
    private Integer id_comida;
    private Integer precio;

    public Precio() {
        this.id = null;
        this.id_persona = null;
        this.id_comida = null;
        this.precio = null;
    }
    
    public Precio(Integer id, Integer id_persona, Integer id_comida, Integer precio) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_comida = id_comida;
        this.precio = precio;
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

    public Integer getId_comida() {
        return id_comida;
    }

    public void setId_comida(Integer id_comida) {
        this.id_comida = id_comida;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
