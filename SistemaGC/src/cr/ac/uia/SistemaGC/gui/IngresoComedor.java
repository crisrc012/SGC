/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Becados_bl;
import cr.ac.uia.SistemaGC.bl.Becas_bl;
import cr.ac.uia.SistemaGC.bl.Tiquetes_bl;
import cr.ac.uia.SistemaGC.entities.Becados;
import cr.ac.uia.SistemaGC.entities.Becas;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pao
 */
public class IngresoComedor extends SGCForm {

    /**
     * Creates new form GestionIngreso
     */
    public IngresoComedor() {
        initComponents();
        SGCconf();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngComida = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAplicarIngreso = new SGCButton();
        rbtnAlmuerzo = new javax.swing.JRadioButton();
        lblComida = new javax.swing.JLabel();
        rbtnDesayuno = new javax.swing.JRadioButton();
        lblCedPersona = new javax.swing.JLabel();
        lblTituloGI = new javax.swing.JLabel();
        txtCedPersona = new SGCTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnAplicarIngreso.setText("Aplicar Ingreso");
        btnAplicarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarIngresoActionPerformed(evt);
            }
        });

        btngComida.add(rbtnAlmuerzo);
        rbtnAlmuerzo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnAlmuerzo.setText("Almuerzo");

        lblComida.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComida.setText("Hora de comida:");

        btngComida.add(rbtnDesayuno);
        rbtnDesayuno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnDesayuno.setSelected(true);
        rbtnDesayuno.setText("Desayuno");

        lblCedPersona.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCedPersona.setText("Cédula de la Persona:");

        lblTituloGI.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloGI.setText("Ingreso al Comedor");

        txtCedPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedPersonaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedPersonaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloGI)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAplicarIngreso)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCedPersona)
                                .addComponent(lblComida))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtnDesayuno)
                                        .addComponent(rbtnAlmuerzo))
                                    .addGap(107, 107, 107))
                                .addComponent(txtCedPersona)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloGI)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComida)
                    .addComponent(rbtnDesayuno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnAlmuerzo)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedPersona)
                    .addComponent(txtCedPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAplicarIngreso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        txtCedPersona.setText("");
    }

    private void aplicarIngreso() {
        if (txtCedPersona.getText().isEmpty()) {
            JOptionPane.showOptionDialog(this,
                    "Por favor digite una cédula válida",
                    "Error",
                    JOptionPane.OK_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    new Object[]{"Entendido"},
                    "Entendido");
            return;
        }
        if (!rbtnAlmuerzo.isSelected() && !rbtnDesayuno.isSelected()) {
            JOptionPane.showOptionDialog(this,
                    "Por favor elija una comida",
                    "Error",
                    JOptionPane.OK_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    new Object[]{"Entendido"},
                    "Entendido");
            return;
        }
        try {
            int cedula = Integer.parseInt(txtCedPersona.getText());
            Boolean becado = ConfirmarBeca(cedula);
            if (becado) {
                int comida = 0;
                if (rbtnDesayuno.isSelected()) {
                    comida = 1;
                } else if (rbtnAlmuerzo.isSelected()) {
                    comida = 2;
                }
                Tiquetes_bl tbl = new Tiquetes_bl();
                int cantidad = tbl.count(cedula, comida);
                if (cantidad > 1) {
                    new IngresoComedor_Confirmacion(cedula, comida, cantidad).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Por favor compre un tiquete",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }
            }
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void btnAplicarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarIngresoActionPerformed
        aplicarIngreso();
        limpiar();
    }//GEN-LAST:event_btnAplicarIngresoActionPerformed

    private Boolean ConfirmarBeca(int cedula) {
        try {
            Becados b = new Becados();
            b.setId_persona(cedula);
            Becados_bl bbl = new Becados_bl();
            Becas bc = new Becas();
            Becas_bl bl = new Becas_bl();
            ArrayList<Becados> ab = bbl.select(b);
            int beca = 0;
            if (ab.size() > 0) {
                if (ab.get(0).getActivo()) {
                    beca = ab.get(0).getId_beca();
                }
            }
            bc.setId(beca);
            ArrayList<Becas> abc = bl.select(bc);
            if (abc.size() > 0) {
                if (abc.get(0).getPorcentaje() == 100) {
                    JOptionPane.showMessageDialog(this,
                            "Esta persona posee una beca del 100%. Puede ingresar al comedor.",
                            "Información de Beca", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    return false;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return true;
    }


    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Iniciar_Sesion.activarPrincipal();
    }//GEN-LAST:event_formWindowClosed

    private void txtCedPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedPersonaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            aplicarIngreso();
        }
    }//GEN-LAST:event_txtCedPersonaKeyPressed

    private void txtCedPersonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedPersonaKeyReleased
        if (!txtCedPersona.getText().isEmpty()) {
            try {
                Integer.parseInt(txtCedPersona.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Digite únicamente números", "Error", JOptionPane.ERROR_MESSAGE);
                txtCedPersona.setText("");
            }
        }
    }//GEN-LAST:event_txtCedPersonaKeyReleased

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoComedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IngresoComedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarIngreso;
    private javax.swing.ButtonGroup btngComida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedPersona;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblTituloGI;
    private javax.swing.JRadioButton rbtnAlmuerzo;
    private javax.swing.JRadioButton rbtnDesayuno;
    private javax.swing.JTextField txtCedPersona;
    // End of variables declaration//GEN-END:variables
}
