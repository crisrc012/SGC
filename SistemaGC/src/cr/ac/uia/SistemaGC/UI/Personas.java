/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.ui;

/**
 *
 * @author Pao
 */
public class Personas extends javax.swing.JFrame {

    /**
     * Creates new form Personas
     */
    public Personas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        lblTituloGP = new javax.swing.JLabel();
        btnAgregarPersona = new javax.swing.JButton();
        btnModificarPersona = new javax.swing.JButton();
        btnEliminarPersona = new javax.swing.JButton();
        btnDesHabilitarPersona = new javax.swing.JButton();
        btnImprimirCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPersonas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Teléfono", "Alumno o Profesor", "Activo"
            }
        ));
        jScrollPane1.setViewportView(tblPersonas);

        lblTituloGP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloGP.setText("Gestión de Personas");

        btnAgregarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarPersona.setText("Agregar Persona");
        btnAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonaActionPerformed(evt);
            }
        });

        btnModificarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarPersona.setText("Modificar Persona");
        btnModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPersonaActionPerformed(evt);
            }
        });

        btnEliminarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarPersona.setText("Eliminar Persona");

        btnDesHabilitarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDesHabilitarPersona.setText("Des/Habilitar Persona");

        btnImprimirCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImprimirCodigo.setText("Imprimir Código de Barra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnModificarPersona)
                                .addGap(56, 56, 56)
                                .addComponent(btnEliminarPersona)
                                .addGap(48, 48, 48)
                                .addComponent(btnDesHabilitarPersona)
                                .addGap(50, 50, 50)
                                .addComponent(btnImprimirCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(lblTituloGP)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloGP)
                .addGap(2, 2, 2)
                .addComponent(btnAgregarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesHabilitarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonaActionPerformed
        new AgregarPersona().setVisible(true);
    }//GEN-LAST:event_btnAgregarPersonaActionPerformed

    private void btnModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPersonaActionPerformed
        new AgregarPersona().setVisible(true);
    }//GEN-LAST:event_btnModificarPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Personas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPersona;
    private javax.swing.JButton btnDesHabilitarPersona;
    private javax.swing.JButton btnEliminarPersona;
    private javax.swing.JButton btnImprimirCodigo;
    private javax.swing.JButton btnModificarPersona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloGP;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables

}
