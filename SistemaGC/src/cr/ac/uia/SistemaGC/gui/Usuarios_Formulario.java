/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Usuarios_bl;
import cr.ac.uia.SistemaGC.entities.Usuarios;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Pao
 */
public class Usuarios_Formulario extends SGCForm {

    // Propiedad que determina si la ventana se ejecuta para insertar o actualizar
    private final boolean isUpdate;
    private final Usuarios usuarios;

    /**
     * Creates new form AgregarUsuario
     */
    public Usuarios_Formulario() {
        initComponents();
        SGCconf();
        isUpdate = false;
        this.usuarios = new Usuarios();
        chckCambioContrasena.setVisible(false);
    }

    public Usuarios_Formulario(boolean update, Usuarios usuarios) {
        initComponents();
        SGCconf();
        isUpdate = update;
        this.usuarios = usuarios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloGU = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblRepetir = new javax.swing.JLabel();
        lblActivo = new javax.swing.JLabel();
        lblObservacionesUsuario = new javax.swing.JLabel();
        btnGuardarUsuario = new SGCButton();
        txtNombre = new SGCTextField();
        txtUsuario = new SGCTextField();
        CBActivo = new javax.swing.JCheckBox();
        txtContraseña = new javax.swing.JPasswordField();
        txtRepetirCont = new javax.swing.JPasswordField();
        lblCedula = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new SGCTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObsUsuario = new javax.swing.JTextPane();
        chckCambioContrasena = new javax.swing.JCheckBox();
        txtCedula = new javax.swing.JSpinner();

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

        lblTituloGU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloGU.setText("Gestión de Usuarios");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreUsuario.setText("Nombre de Usuario:");

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");

        lblRepetir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRepetir.setText("Repetir Contraseña:");

        lblActivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblActivo.setText("Activo:");

        lblObservacionesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblObservacionesUsuario.setText("Observaciones:");

        btnGuardarUsuario.setText("Guardar Usuario");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });

        CBActivo.setSelected(true);

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtRepetirCont.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedula.setText("Cédula:");

        lblApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellidos.setText("Apellidos:");

        txtObsUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txtObsUsuario);

        chckCambioContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckCambioContrasenaActionPerformed(evt);
            }
        });

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloGU)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardarUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreUsuario)
                                    .addComponent(lblActivo)
                                    .addComponent(lblObservacionesUsuario)
                                    .addComponent(lblContraseña)
                                    .addComponent(lblRepetir)
                                    .addComponent(lblCedula)
                                    .addComponent(lblNombre)
                                    .addComponent(lblApellidos))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(chckCambioContrasena)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBActivo)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtRepetirCont, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtCedula)))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloGU)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chckCambioContrasena, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContraseña)))
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepetirCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepetir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblActivo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservacionesUsuario))))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarUsuario)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        // Validaciones de campos
        if (txtCedula.getValue().toString().isEmpty()
                || txtNombre.getText().isEmpty() || txtUsuario.getText().isEmpty()
                || txtObsUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No pueden haber campos vacíos, por favor ingrese la información correspondiente");
            return;
        }
        if (!Arrays.equals(txtContraseña.getPassword(), txtRepetirCont.getPassword())) {
            JOptionPane.showMessageDialog(this,
                    "Las contraseñas no coinciden, por favor intente nuevamente");
            txtContraseña.requestFocus();
            txtContraseña.setText("");
            txtRepetirCont.setText("");
            return;
        }
        // Fin validaciones de campo
        try {
            Usuarios_bl p_bl = new Usuarios_bl();
            usuarios.setContrasena(Arrays.toString(txtContraseña.getPassword()));
            usuarios.setCedula(Long.parseLong(txtCedula.getValue().toString()));
            usuarios.setNombre(txtNombre.getText().trim());
            usuarios.setApellidos(txtApellidos.getText());
            usuarios.setUsuario(txtUsuario.getText().trim());
            usuarios.setActivo(CBActivo.isSelected());
            usuarios.setObservaciones(txtObsUsuario.getText().trim());
            usuarios.setId_rol(1000);
            if (this.isUpdate) {
                if (p_bl.update(usuarios, chckCambioContrasena.isSelected())) {
                    JOptionPane.showMessageDialog(this,
                            "Se ha actualizado correctamente el usuario.",
                            "Correcto",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Ha ocurrido un error, revise los datos ingresados.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else if (p_bl.insert(usuarios)) {
                JOptionPane.showMessageDialog(this,
                        "Se ha insertado correctamente el usuario.",
                        "Correcto",
                        JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Ha ocurrido un error, revise los datos ingresados.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException | SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (this.isUpdate) {
            btnGuardarUsuario.setText("Modificar Usuario");
            txtApellidos.setText(this.usuarios.getApellidos());
            txtCedula.setValue(this.usuarios.getCedula());
            txtNombre.setText(this.usuarios.getNombre());
            txtObsUsuario.setText(this.usuarios.getObservaciones());
            txtUsuario.setText(this.usuarios.getUsuario());
            CBActivo.setSelected(this.usuarios.getActivo());
            txtCedula.setEnabled(false);
            txtContraseña.setEnabled(false);
            txtRepetirCont.setEnabled(false);
            txtUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            new Usuarios_Principal().setVisible(true);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_formWindowClosed

    private void chckCambioContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckCambioContrasenaActionPerformed
        txtContraseña.setEnabled(chckCambioContrasena.isSelected());
        txtRepetirCont.setEnabled(chckCambioContrasena.isSelected());
    }//GEN-LAST:event_chckCambioContrasenaActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios_Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Usuarios_Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBActivo;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JCheckBox chckCambioContrasena;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActivo;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblObservacionesUsuario;
    private javax.swing.JLabel lblRepetir;
    private javax.swing.JLabel lblTituloGU;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JSpinner txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextPane txtObsUsuario;
    private javax.swing.JPasswordField txtRepetirCont;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
