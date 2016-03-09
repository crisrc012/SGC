/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

/**
 *
 * @author Pao
 */
public class TipoBeca extends javax.swing.JFrame {

    /**
     * Creates new form TipoBeca
     */
    public TipoBeca() {
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

        lblTituloBecas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTiposBecas = new javax.swing.JTable();
        btnAgregarBeca = new javax.swing.JButton();
        btnModificarBeca = new javax.swing.JButton();
        btnDesHabilitarBeca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTituloBecas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloBecas.setText("Tipos de Becas");

        tblTiposBecas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblTiposBecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre de Beca", "Porcentaje de Beca"
            }
        ));
        jScrollPane1.setViewportView(tblTiposBecas);

        btnAgregarBeca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarBeca.setText("Agregar Beca");
        btnAgregarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBecaActionPerformed(evt);
            }
        });

        btnModificarBeca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarBeca.setText("Modificar Beca");
        btnModificarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBecaActionPerformed(evt);
            }
        });

        btnDesHabilitarBeca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDesHabilitarBeca.setText("Des/Habilitar Beca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnModificarBeca)
                        .addGap(80, 80, 80)
                        .addComponent(btnDesHabilitarBeca)
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblTituloBecas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarBeca)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAgregarBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTituloBecas)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesHabilitarBeca, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnModificarBeca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBecaActionPerformed
        new AgregarBeca().setVisible(true);
    }//GEN-LAST:event_btnAgregarBecaActionPerformed

    private void btnModificarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBecaActionPerformed
        new AgregarBeca().setVisible(true);
    }//GEN-LAST:event_btnModificarBecaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TipoBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoBeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TipoBeca().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBeca;
    private javax.swing.JButton btnDesHabilitarBeca;
    private javax.swing.JButton btnModificarBeca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloBecas;
    private javax.swing.JTable tblTiposBecas;
    // End of variables declaration//GEN-END:variables
}
