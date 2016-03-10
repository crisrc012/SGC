/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import static cr.ac.uia.SistemaGC.gui.Login.PUI;

/**
 *
 * @author Pao
 */
public class GestionIngreso extends javax.swing.JFrame {

    /**
     * Creates new form GestionIngreso
     */
    public GestionIngreso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloGI = new javax.swing.JLabel();
        lblCedPersona = new javax.swing.JLabel();
        lblNombrePersona = new javax.swing.JLabel();
        lblCondicion = new javax.swing.JLabel();
        lblCamposReq = new javax.swing.JLabel();
        btnAplicarIngreso = new javax.swing.JButton();
        txtCedPersona = new javax.swing.JTextField();
        txtNombrePersona = new javax.swing.JTextField();
        txtCondicion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTituloGI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloGI.setText("Gestión de Ingreso");

        lblCedPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedPersona.setText("Cédula de la Persona:");

        lblNombrePersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombrePersona.setText("Nombre de Persona:");

        lblCondicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCondicion.setText("Condición de Ingreso:");

        lblCamposReq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCamposReq.setText("* Campos Requeridos");

        btnAplicarIngreso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAplicarIngreso.setText("Aplicar Ingreso");
        btnAplicarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarIngresoActionPerformed(evt);
            }
        });

        txtCedPersona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtNombrePersona.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtCondicion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCedPersona)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCondicion)
                                    .addComponent(lblNombrePersona))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombrePersona)
                                    .addComponent(txtCondicion)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAplicarIngreso))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTituloGI)
                                    .addComponent(lblCamposReq))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloGI)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedPersona)
                    .addComponent(txtCedPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePersona)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCondicion)
                    .addComponent(txtCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAplicarIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCamposReq))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarIngresoActionPerformed
        
    }//GEN-LAST:event_btnAplicarIngresoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        PUI.setEnabled(true);
        PUI.toFront();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(GestionIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionIngreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarIngreso;
    private javax.swing.JLabel lblCamposReq;
    private javax.swing.JLabel lblCedPersona;
    private javax.swing.JLabel lblCondicion;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JLabel lblTituloGI;
    private javax.swing.JTextField txtCedPersona;
    private javax.swing.JTextField txtCondicion;
    private javax.swing.JTextField txtNombrePersona;
    // End of variables declaration//GEN-END:variables
}
