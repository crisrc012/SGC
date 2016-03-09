/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Personas_bl;
import cr.ac.uia.SistemaGC.entities.Personas;
import cr.ac.uia.SistemaGC.entities.Personas_avatar;
import java.awt.Image;
import java.io.File;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Pao
 */
public class AgregarPersona extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPersona
     */
    public AgregarPersona() {
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

        TipoPersona = new javax.swing.ButtonGroup();
        RBEstudiante = new javax.swing.JRadioButton();
        RBProfesor = new javax.swing.JRadioButton();
        lblCedulaPersona = new javax.swing.JLabel();
        lblNombrePersona = new javax.swing.JLabel();
        lblApellidosPersona = new javax.swing.JLabel();
        lblFechaPersona = new javax.swing.JLabel();
        lblTelefonosPersona = new javax.swing.JLabel();
        lblContactoPersona = new javax.swing.JLabel();
        lblObservacionesPersona = new javax.swing.JLabel();
        btnGuardarPersona = new javax.swing.JButton();
        txtCedulaPersona = new javax.swing.JTextField();
        txtNombrePersona = new javax.swing.JTextField();
        txtApellidosPersona = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtContactoPersona = new javax.swing.JTextField();
        txtObservacionesPersona = new javax.swing.JTextField();
        txtFechaPersona = new javax.swing.JFormattedTextField();
        lblTituloAgPersona = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnCargarFoto = new javax.swing.JButton();
        lblCel = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TipoPersona.add(RBEstudiante);
        RBEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBEstudiante.setText("Estudiante");

        TipoPersona.add(RBProfesor);
        RBProfesor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBProfesor.setText("Profesor");

        lblCedulaPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedulaPersona.setText("Cédula:");

        lblNombrePersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombrePersona.setText("Nombre:");

        lblApellidosPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellidosPersona.setText("Apellidos:");

        lblFechaPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaPersona.setText("Fecha de Nacimiento:");

        lblTelefonosPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefonosPersona.setText("Teléfonos:");

        lblContactoPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContactoPersona.setText("Persona para contacto:");

        lblObservacionesPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblObservacionesPersona.setText("Observaciones:");

        btnGuardarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarPersona.setText("Guardar Persona");
        btnGuardarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPersonaActionPerformed(evt);
            }
        });

        txtFechaPersona.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        lblTituloAgPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloAgPersona.setText("Gestión de Personas");

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCargarFoto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCargarFoto.setText("Cargar Foto");
        btnCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFotoActionPerformed(evt);
            }
        });

        lblCel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/Celular.png"))); // NOI18N

        lblTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/Telefono.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellidosPersona)
                        .addGap(123, 123, 123)
                        .addComponent(txtApellidosPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFechaPersona)
                        .addGap(51, 51, 51)
                        .addComponent(txtFechaPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefonosPersona)
                        .addGap(82, 82, 82)
                        .addComponent(lblCel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContactoPersona)
                        .addGap(41, 41, 41)
                        .addComponent(txtContactoPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblObservacionesPersona)
                        .addGap(89, 89, 89)
                        .addComponent(txtObservacionesPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnGuardarPersona)
                        .addGap(0, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePersona)
                            .addComponent(lblCedulaPersona))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaPersona)
                            .addComponent(txtNombrePersona))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBEstudiante)
                    .addComponent(RBProfesor))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloAgPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnCargarFoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(RBEstudiante)
                        .addGap(42, 42, 42)
                        .addComponent(RBProfesor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTituloAgPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarFoto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaPersona)
                    .addComponent(txtCedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePersona)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosPersona)
                    .addComponent(txtApellidosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaPersona)
                    .addComponent(txtFechaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefonosPersona)
                                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactoPersona)
                    .addComponent(txtContactoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservacionesPersona)
                    .addComponent(txtObservacionesPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnGuardarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    File fichero;
    private void btnCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFotoActionPerformed
        int resultado;
        SubirFoto file = new SubirFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        file.FchCargarFoto.setFileFilter(filtro);
        resultado = file.FchCargarFoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = file.FchCargarFoto.getSelectedFile();
            try {
                ImageIcon image = new ImageIcon(fichero.toString());
                Icon icon = new ImageIcon(image.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
                lblFoto.setIcon(icon);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir la imagen " + ex);
            }
        }
    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void btnGuardarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPersonaActionPerformed
        try {
            int id= Integer.parseInt(null);
            if(RBEstudiante.isSelected()){
                //Ejemplos
                id=1;
            }else {
                if (RBProfesor.isSelected()){
                    id=2;
                }
            }
            Personas nueva = new Personas();
            Personas_bl blp = new Personas_bl();
            nueva.setCedula(Integer.parseInt(txtCedulaPersona.getText().trim()));
            nueva.setNombre(txtNombrePersona.getText().trim());
            nueva.setApellidos(txtApellidosPersona.getText().trim());
            nueva.setFecha_nacimiento(Date.valueOf(txtFechaPersona.getText()));
            nueva.setTel_celular(Integer.parseInt(txtTelefono1.getText()));
            nueva.setTel_habitacion(Integer.parseInt(txtTelefono2.getText()));
            nueva.setEncargado(txtContactoPersona.getText().trim());
            nueva.setId_persona(id);
            if(blp.insert(nueva)){
                JOptionPane.showMessageDialog(null, "Se ha guardado correctamente.",
                        "Guardar Persona", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar. Intente nuevamente.",
                        "Guardar Persona", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarPersona().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBEstudiante;
    private javax.swing.JRadioButton RBProfesor;
    private javax.swing.ButtonGroup TipoPersona;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnGuardarPersona;
    private javax.swing.JLabel lblApellidosPersona;
    private javax.swing.JLabel lblCedulaPersona;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblContactoPersona;
    private javax.swing.JLabel lblFechaPersona;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JLabel lblObservacionesPersona;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTelefonosPersona;
    private javax.swing.JLabel lblTituloAgPersona;
    private javax.swing.JTextField txtApellidosPersona;
    private javax.swing.JTextField txtCedulaPersona;
    private javax.swing.JTextField txtContactoPersona;
    private javax.swing.JFormattedTextField txtFechaPersona;
    private javax.swing.JTextField txtNombrePersona;
    private javax.swing.JTextField txtObservacionesPersona;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
