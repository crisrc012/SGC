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
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pao
 */
public class Becados_Formulario extends javax.swing.JFrame {

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
        lblCamposReq = new javax.swing.JLabel();
        lblCedEstudiante = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblNombreBeca = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        lblObsBeca = new javax.swing.JLabel();
        btnGuardarAsignacion = new javax.swing.JButton();
        txtCedEstudiante = new javax.swing.JTextField();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        btnConsultarCed = new javax.swing.JButton();
        cboBecas = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObsBeca = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTituloAB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloAB.setText("Administración de Becas");

        lblCamposReq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCamposReq.setText("* Campos Requeridos");

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

        btnGuardarAsignacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarAsignacion.setText("Guardar Asignación");
        btnGuardarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAsignacionActionPerformed(evt);
            }
        });

        txtNombreEstudiante.setEnabled(false);

        txtPorcentaje.setEnabled(false);

        btnConsultarCed.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnConsultarCed.setText("Consultar");
        btnConsultarCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCedActionPerformed(evt);
            }
        });

        cboBecas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboBecasItemStateChanged(evt);
            }
        });

        txtObsBeca.setColumns(20);
        txtObsBeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtObsBeca.setRows(5);
        jScrollPane1.setViewportView(txtObsBeca);

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
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCamposReq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addComponent(btnGuardarAsignacion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTituloAB)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblObsBeca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblCamposReq))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAsignacionActionPerformed
        try {
            Becados_bl bbl = new Becados_bl();
            becado.setId_persona(Integer.parseInt((String) txtCedEstudiante.getText().trim()));
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
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnGuardarAsignacionActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        try {
            Becas beca = new Becas();
            Becas_bl Bbl = new Becas_bl();
            ArrayList<Becas> abl = Bbl.select(beca);
            for (int i = 0; i < abl.size(); i++) {
                cboBecas.addItem(abl.get(i).getNombre());
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        if (this.isUpdate) {
            btnGuardarAsignacion.setText("Modificar Beca");
            txtCedEstudiante.setText(String.valueOf(this.becado.getId_persona()));
            ConsultarCedula();
            txtObsBeca.setText(this.becado.getObservaciones());
        }
    }//GEN-LAST:event_formComponentShown

    private void btnConsultarCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCedActionPerformed
        ConsultarCedula();
    }//GEN-LAST:event_btnConsultarCedActionPerformed
    public void ConsultarCedula() {
        try {
            if (txtCedEstudiante.getText().isEmpty()) {
                return;
            }
            txtCedEstudiante.setEnabled(false);
            Personas_bl pbl = new Personas_bl();
            Personas p = new Personas();
            p.setCedula(Integer.parseInt((String) txtCedEstudiante.getText().trim()));
            ArrayList<Personas> al = pbl.select(p);
            if (al.size() > 0) {
                txtNombreEstudiante.setText(al.get(0).getNombre() + " " + al.get(0).getApellidos());
            } else {
                JOptionPane.showMessageDialog(this,
                        "No existe ninguna persona relacionada a la cédula ingresada",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    private void cboBecasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboBecasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                String nombre = String.valueOf(cboBecas.getSelectedItem());
                Becas beca = new Becas();
                Becas_bl Bbl = new Becas_bl();
                beca.setNombre(nombre);
                ArrayList<Becas> abl = Bbl.select(beca);
                if (abl.size() > 0) {
                    id_beca = abl.get(0).getId();
                    txtPorcentaje.setText(String.valueOf(abl.get(0).getPorcentaje()));
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_cboBecasItemStateChanged

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
    private javax.swing.JButton btnConsultarCed;
    private javax.swing.JButton btnGuardarAsignacion;
    private javax.swing.JComboBox cboBecas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamposReq;
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
