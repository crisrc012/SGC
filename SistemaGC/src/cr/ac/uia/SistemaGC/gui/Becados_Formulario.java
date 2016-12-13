/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Becados_bl;
import cr.ac.uia.SistemaGC.bl.Becas_bl;
import cr.ac.uia.SistemaGC.bl.Personas_bl;
import cr.ac.uia.SistemaGC.entities.Becados;
import cr.ac.uia.SistemaGC.entities.Becas;
import cr.ac.uia.SistemaGC.entities.Personas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pao
 */
public class Becados_Formulario extends SGCForm {

    private int id_beca;
    private final boolean isUpdate;
    private final Becados becado;

    /**
     * Creates new form AsignarBeca
     */
    public Becados_Formulario() {
        initComponents();
        isUpdate = false;
        this.becado = new Becados();
    }

    public Becados_Formulario(boolean isUpdate, Becados becado) {
        initComponents();
        this.isUpdate = isUpdate;
        this.becado = becado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloAB = new javax.swing.JLabel();
        lblCedEstudiante = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblNombreBeca = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        lblObsBeca = new javax.swing.JLabel();
        btnGuardarAsignacion = new SGCButton();
        txtCedEstudiante = new SGCTextField();
        txtNombreEstudiante = new SGCTextField();
        txtPorcentaje = new SGCTextField();
        btnConsultarCed = new SGCButton();
        cboBecas = new javax.swing.JComboBox();
        ScrollPane = new javax.swing.JScrollPane();
        txtObsBeca = new javax.swing.JTextArea();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTituloAB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloAB.setText("Administración de Becas");

        lblCedEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedEstudiante.setText("Cédula de Estudiante:");

        lblNombreEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreEstudiante.setText("Nombre de Estudiante:");

        lblNombreBeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreBeca.setText("Nombre de Beca:");

        lblPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPorcentaje.setText("Porcentaje de Beca:");

        lblObsBeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblObsBeca.setText("Observaciones:");

        btnGuardarAsignacion.setText("Guardar Asignación");
        btnGuardarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAsignacionActionPerformed(evt);
            }
        });

        txtCedEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedEstudianteKeyReleased(evt);
            }
        });

        txtNombreEstudiante.setEnabled(false);

        txtPorcentaje.setEnabled(false);

        btnConsultarCed.setText("Consultar");
        btnConsultarCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCedActionPerformed(evt);
            }
        });

        cboBecas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboBecas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboBecasItemStateChanged(evt);
            }
        });

        txtObsBeca.setColumns(20);
        txtObsBeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtObsBeca.setRows(5);
        ScrollPane.setViewportView(txtObsBeca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedEstudiante)
                            .addComponent(lblNombreEstudiante)
                            .addComponent(lblNombreBeca)
                            .addComponent(lblPorcentaje)
                            .addComponent(lblObsBeca))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEstudiante)
                            .addComponent(txtCedEstudiante)
                            .addComponent(txtPorcentaje)
                            .addComponent(cboBecas, 0, 250, Short.MAX_VALUE)
                            .addComponent(ScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTituloAB)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardarAsignacion)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnConsultarCed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAB)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedEstudiante)
                    .addComponent(txtCedEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarCed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstudiante)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreBeca)
                    .addComponent(cboBecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcentaje)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObsBeca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarAsignacion)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAsignacionActionPerformed
        if (txtCedEstudiante.getText().isEmpty() || txtObsBeca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Existen campos requeridos sin llenar, por favor ingrese la información solicitada",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                Becados_bl bbl = new Becados_bl();
                becado.setId(becado.getId());
                becado.setId_persona(Long.parseLong(txtCedEstudiante.getText().trim()));
                becado.setId_beca(id_beca);
                becado.setObservaciones(txtObsBeca.getText().trim());
                becado.setActivo(true);
                if (this.isUpdate) {
                    if (bbl.update(becado)) {
                        JOptionPane.showMessageDialog(this,
                                "Beca actualizada correctamente", "Correcto",
                                JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Ha ocurrido un error, revise los datos ingresados.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if (bbl.insert(becado)) {
                    JOptionPane.showMessageDialog(this,
                            "Beca asignada correctamente.",
                            "Correcto",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Ha ocurrido un error, revise los datos ingresados.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                txtCedEstudiante.setEnabled(true);
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnGuardarAsignacionActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            Becas beca = new Becas();
            beca.setActivo(true); // busca las becas activas
            Becas_bl Bbl = new Becas_bl();
            ArrayList<Becas> abl = Bbl.select(beca);
            abl.stream().forEach((b) -> {
                cboBecas.addItem(b.getNombre());
            });
            if (isUpdate) {
                btnGuardarAsignacion.setText("Modificar Beca");
                txtCedEstudiante.setText(String.valueOf(becado.getId_persona()));
                ConsultarCedula();
                txtObsBeca.setText(becado.getObservaciones());
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnConsultarCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCedActionPerformed
        try {
            ConsultarCedula();
        } catch (ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_btnConsultarCedActionPerformed

    public void ConsultarCedula() throws ClassNotFoundException {
        try {
            if (txtCedEstudiante.getText().isEmpty()) {
                return;
            }
            txtCedEstudiante.setEnabled(false);
            Becados b = new Becados();
            Becados_bl bbl = new Becados_bl();
            b.setId_persona(Long.parseLong(txtCedEstudiante.getText().trim()));
            ArrayList<Becados> ab = bbl.select(b);
            if (isUpdate == false) {
                if (ab.size() > 0) {
                    JOptionPane.showMessageDialog(this,
                            "Esta persona, ya posee una beca.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    txtCedEstudiante.setText("");
                    txtCedEstudiante.setEnabled(true);
                    return;
                }
            }
            Personas_bl pbl = new Personas_bl();
            Personas p = new Personas();
            p.setCedula(Long.parseLong(txtCedEstudiante.getText().trim()));
            ArrayList<Personas> al = pbl.select(p);
            if(al.get(0).getActivo() == false){
                JOptionPane.showMessageDialog(this,
                        "Esta persona se encuentra deshabilitada",
                        "Error", JOptionPane.ERROR_MESSAGE);
                txtCedEstudiante.setText("");
                txtCedEstudiante.setEnabled(true);
            }else{
                if (al.size() > 0) {
                    txtNombreEstudiante.setText(al.get(0).getNombre() + " " + al.get(0).getApellidos());
                } else {
                    JOptionPane.showMessageDialog(this,
                            "No existe ninguna persona relacionada a la cédula ingresada",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    txtCedEstudiante.setText("");
                    txtCedEstudiante.setEnabled(true);
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    private void cboBecasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboBecasItemStateChanged
        try {
            Becas beca = new Becas();
            Becas_bl Bbl = new Becas_bl();
            beca.setNombre(String.valueOf(cboBecas.getSelectedItem()));
            beca = Bbl.select(beca).get(0);
            id_beca = beca.getId();
            txtPorcentaje.setText(beca.getPorcentaje().toString());
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_cboBecasItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            new Becados_Principal().setVisible(true);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosed

    private void txtCedEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedEstudianteKeyReleased
        cr.ac.uia.SistemaGC.utils.ValidarGUI.validar(this, txtCedEstudiante);
    }//GEN-LAST:event_txtCedEstudianteKeyReleased

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
            java.util.logging.Logger.getLogger(Becados_Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Becados_Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnConsultarCed;
    private javax.swing.JButton btnGuardarAsignacion;
    private javax.swing.JComboBox cboBecas;
    private javax.swing.JLabel lblCedEstudiante;
    private javax.swing.JLabel lblNombreBeca;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblObsBeca;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblTituloAB;
    private javax.swing.JTextField txtCedEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextArea txtObsBeca;
    private javax.swing.JTextField txtPorcentaje;
    // End of variables declaration//GEN-END:variables
}
