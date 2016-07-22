/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

/**
 *
 * @author crobles
 */
public class SGCForm extends javax.swing.JFrame {

    public SGCForm() {
        SGCconf();
    }

    private void SGCconf() {
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/Icono.png")).getImage());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
