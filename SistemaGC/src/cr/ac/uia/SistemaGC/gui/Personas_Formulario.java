/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Personas_avatar_bl;
import cr.ac.uia.SistemaGC.bl.Personas_bl;
import cr.ac.uia.SistemaGC.entities.Personas;
import cr.ac.uia.SistemaGC.entities.Personas_avatar;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Pao
 */
public class Personas_Formulario extends javax.swing.JFrame {

    private final boolean isUpdate;
    private final Personas persona;
    private File foto;

    /**
     * Creates new form AgregarPersona
     */
    public Personas_Formulario() {
        initComponents();
        RBEstudiante.setSelected(true);
        isUpdate = false;
        this.persona = new Personas();
        this.foto = null;
    }

    public Personas_Formulario(boolean Update, Personas persona) {
        initComponents();
        RBEstudiante.setSelected(true);
        this.isUpdate = Update;
        this.persona = persona;
        this.foto = null;
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
        RBFuncionario = new javax.swing.JRadioButton();
        lblCedulaPersona = new javax.swing.JLabel();
        lblNombrePersona = new javax.swing.JLabel();
        lblApellidosPersona = new javax.swing.JLabel();
        lblFechaPersona = new javax.swing.JLabel();
        lblTelefonosPersona = new javax.swing.JLabel();
        lblContactoPersona = new javax.swing.JLabel();
        btnGuardarPersona = new javax.swing.JButton();
        txtCedulaPersona = new javax.swing.JTextField();
        txtNombrePersona = new javax.swing.JTextField();
        txtApellidosPersona = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtContactoPersona = new javax.swing.JTextField();
        lblTituloAgPersona = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnCargarFoto = new javax.swing.JButton();
        lblCel = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblCamposRequeridos = new javax.swing.JLabel();
        lblAsterisco1 = new javax.swing.JLabel();
        lblAsterisco2 = new javax.swing.JLabel();
        lblAsterisco3 = new javax.swing.JLabel();
        lblAsterisco4 = new javax.swing.JLabel();
        lblAsterisco5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("../img/Icono.png")).getImage());
        setResizable(false);
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

        TipoPersona.add(RBEstudiante);
        RBEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBEstudiante.setText("Estudiante");

        TipoPersona.add(RBFuncionario);
        RBFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBFuncionario.setText("Funcionario");

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

        btnGuardarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarPersona.setText("Guardar Persona");
        btnGuardarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPersonaActionPerformed(evt);
            }
        });

        txtCedulaPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNombrePersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtApellidosPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtContactoPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        jDateFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCamposRequeridos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCamposRequeridos.setText("* Campos Requeridos");

        lblAsterisco1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsterisco1.setText("*");

        lblAsterisco2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsterisco2.setText("*");

        lblAsterisco3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsterisco3.setText("*");

        lblAsterisco4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsterisco4.setText("*");

        lblAsterisco5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsterisco5.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellidosPersona)
                        .addGap(123, 123, 123)
                        .addComponent(txtApellidosPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePersona)
                            .addComponent(lblCedulaPersona))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePersona)
                            .addComponent(txtCedulaPersona)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContactoPersona)
                        .addGap(41, 41, 41)
                        .addComponent(txtContactoPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCargarFoto)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTelefonosPersona)
                                    .addGap(84, 84, 84)
                                    .addComponent(lblCel)))
                            .addComponent(lblFechaPersona)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(lblTel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono2)
                            .addComponent(txtTelefono1)
                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsterisco1)
                    .addComponent(lblAsterisco2)
                    .addComponent(lblAsterisco3)
                    .addComponent(lblAsterisco4)
                    .addComponent(lblAsterisco5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBEstudiante)
                    .addComponent(RBFuncionario))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloAgPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnGuardarPersona))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCamposRequeridos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloAgPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RBEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(RBFuncionario)
                        .addGap(39, 39, 39)))
                .addComponent(btnCargarFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCedulaPersona)
                                    .addComponent(txtCedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAsterisco1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombrePersona)
                                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAsterisco2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApellidosPersona)
                                    .addComponent(txtApellidosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAsterisco3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaPersona)
                                    .addComponent(lblAsterisco4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefonosPersona)
                            .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactoPersona)
                    .addComponent(txtContactoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterisco5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblCamposRequeridos)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFotoActionPerformed
        Personas_Agregar_SubirFoto file = new Personas_Agregar_SubirFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        file.FchCargarFoto.setFileFilter(filtro);
        int resultado = file.FchCargarFoto.showOpenDialog(this);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            File fichero = file.FchCargarFoto.getSelectedFile();
            this.foto = fichero;
            try {
                ImageIcon image = new ImageIcon(fichero.toString());
                lblFoto.setIcon(
                        new ImageIcon(
                                image.getImage().getScaledInstance(
                                        lblFoto.getWidth(),
                                        lblFoto.getHeight(),
                                        Image.SCALE_DEFAULT)));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al intentar abrir la imagen " + e);
            }
        }
    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void foto() throws SQLException, IOException {
        Personas_avatar_bl pabl = new Personas_avatar_bl();
        if (this.isUpdate) {
            pabl.update(new Personas_avatar(
                    Integer.parseInt(txtCedulaPersona.getText()), foto));
        } else {
            pabl.insert(
                    new Personas_avatar(
                            Integer.parseInt(txtCedulaPersona.getText()), foto));
        }
    }

    private void btnGuardarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPersonaActionPerformed
        if (txtCedulaPersona.getText().isEmpty() || txtNombrePersona.getText().isEmpty()
                || txtApellidosPersona.getText().isEmpty() || txtContactoPersona.getText().isEmpty()
                || jDateFechaNacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(this,
                    "Existen campos requeridos sin llenar, por favor ingrese la información solicitada",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                int id = 0;
                if (RBEstudiante.isSelected()) {
                    id = 1;
                } else if (RBFuncionario.isSelected()) {
                    id = 2;
                }
                Personas_bl blp = new Personas_bl();
                persona.setCedula(Integer.parseInt(txtCedulaPersona.getText().trim()));
                persona.setNombre(txtNombrePersona.getText().trim());
                persona.setApellidos(txtApellidosPersona.getText().trim());
                persona.setFecha_nacimiento((Date) jDateFechaNacimiento.getDate());
                persona.setTel_celular(Integer.parseInt(txtTelefono1.getText()));
                persona.setTel_habitacion(Integer.parseInt(txtTelefono2.getText()));
                persona.setEncargado(txtContactoPersona.getText().trim());
                persona.setId_persona(id);
                if (this.isUpdate) { // Se valida si se va a actualizar o a insertar
                    if (blp.update(persona)) { // Se actualiza la persona
                        this.foto();
                        JOptionPane.showMessageDialog(this, "Persona actualizada correctamente",
                                "Correcto", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al actualizar, por favor verifique los datos",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (blp.insert(persona)) { // Se inserta una nueva persona
                    this.foto();
                    JOptionPane.showMessageDialog(this, "Se ha guardado correctamente.",
                            "Guardar Persona", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error al guardar. Intente nuevamente.",
                            "Guardar Persona", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException | IOException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_btnGuardarPersonaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (this.isUpdate) {
            try {
                btnGuardarPersona.setText("Modificar Persona");
                txtCedulaPersona.setText(this.persona.getCedula().toString());
                txtCedulaPersona.setEditable(false);
                txtNombrePersona.setText(this.persona.getNombre());
                txtApellidosPersona.setText(this.persona.getApellidos());
                jDateFechaNacimiento.setDate(this.persona.getFecha_nacimiento());
                txtTelefono1.setText(this.persona.getTel_celular().toString());
                txtTelefono2.setText(this.persona.getTel_habitacion().toString());
                txtContactoPersona.setText(this.persona.getEncargado());
                if (this.persona.getId_persona() == 1) {
                    RBEstudiante.setSelected(true);
                } else {
                    RBFuncionario.setSelected(true);
                }
                Personas_avatar_bl pabl = new Personas_avatar_bl();
                byte[] avatar = pabl.select(this.persona.getCedula());
                if (avatar != null) {
                    ImageIcon image = new ImageIcon(avatar);
                    lblFoto.setIcon(
                            new ImageIcon(
                                    image.getImage().getScaledInstance(
                                            lblFoto.getWidth(),
                                            lblFoto.getHeight(),
                                            Image.SCALE_DEFAULT)));
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new Personas_Principal().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Personas_Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Personas_Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBEstudiante;
    private javax.swing.JRadioButton RBFuncionario;
    private javax.swing.ButtonGroup TipoPersona;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnGuardarPersona;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel lblApellidosPersona;
    private javax.swing.JLabel lblAsterisco1;
    private javax.swing.JLabel lblAsterisco2;
    private javax.swing.JLabel lblAsterisco3;
    private javax.swing.JLabel lblAsterisco4;
    private javax.swing.JLabel lblAsterisco5;
    private javax.swing.JLabel lblCamposRequeridos;
    private javax.swing.JLabel lblCedulaPersona;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblContactoPersona;
    private javax.swing.JLabel lblFechaPersona;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTelefonosPersona;
    private javax.swing.JLabel lblTituloAgPersona;
    private javax.swing.JTextField txtApellidosPersona;
    private javax.swing.JTextField txtCedulaPersona;
    private javax.swing.JTextField txtContactoPersona;
    private javax.swing.JTextField txtNombrePersona;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
