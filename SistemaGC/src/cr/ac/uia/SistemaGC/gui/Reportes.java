/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.db.Conexion;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Pao
 */
public class Reportes extends SGCForm {

    private String titulo;
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private Conexion conn;
    private int id_persona;
    private String periodo;
    private boolean beca;
    String reportSource;

    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
        SGCconf();
        reportSource = "src/cr/ac/uia/SistemaGC/reports/Reporte.jrxml";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGTipos = new javax.swing.ButtonGroup();
        btnGPeriodo = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblSelectPeriodo = new javax.swing.JLabel();
        lblSelectTipo = new javax.swing.JLabel();
        lblSelectDate = new javax.swing.JLabel();
        RBSemanal = new javax.swing.JRadioButton();
        RBMensual = new javax.swing.JRadioButton();
        RBBecados = new javax.swing.JRadioButton();
        RBNoBecados = new javax.swing.JRadioButton();
        RBFuncionarios = new javax.swing.JRadioButton();
        RBVentas = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarReporte = new SGCButton();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jDateFin = new com.toedter.calendar.JDateChooser();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Reportes");

        lblSelectPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSelectPeriodo.setText("1. Seleccione el periodo");

        lblSelectTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSelectTipo.setText("2. Seleccione el tipo de reporte");

        lblSelectDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSelectDate.setText("3. Seleccione intervalo de fecha");

        btnGPeriodo.add(RBSemanal);
        RBSemanal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBSemanal.setText("Información Semanal");
        RBSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSemanalActionPerformed(evt);
            }
        });

        btnGPeriodo.add(RBMensual);
        RBMensual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBMensual.setText("Información Mensual");
        RBMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMensualActionPerformed(evt);
            }
        });

        btnGTipos.add(RBBecados);
        RBBecados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBBecados.setText("Cantidad de estudiantes becados que utilizan el comedor");
        RBBecados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBecadosActionPerformed(evt);
            }
        });

        btnGTipos.add(RBNoBecados);
        RBNoBecados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBNoBecados.setText("Cantidad de estudiantes no becados que utilizan el comedor");
        RBNoBecados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNoBecadosActionPerformed(evt);
            }
        });

        btnGTipos.add(RBFuncionarios);
        RBFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBFuncionarios.setText("Cantidad de funcionarios que utilizan el comedor");
        RBFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFuncionariosActionPerformed(evt);
            }
        });

        btnGTipos.add(RBVentas);
        RBVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RBVentas.setText("Ventas");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Desde:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Hasta:");

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectDate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelectPeriodo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBBecados)
                            .addComponent(lblSelectTipo)
                            .addComponent(RBNoBecados)
                            .addComponent(RBFuncionarios)
                            .addComponent(RBVentas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBMensual)
                            .addComponent(RBSemanal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectPeriodo)
                    .addComponent(lblSelectTipo))
                .addGap(18, 18, 18)
                .addComponent(RBBecados)
                .addGap(6, 6, 6)
                .addComponent(RBSemanal)
                .addGap(9, 9, 9)
                .addComponent(RBNoBecados)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(RBMensual))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(RBFuncionarios)))
                .addGap(41, 41, 41)
                .addComponent(RBVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblSelectDate)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenerarReporte)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        // Validaciones
        // Periodo
        if (!RBSemanal.isSelected() && !RBMensual.isSelected()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor seleccione un periodo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Reporte
        if (!RBBecados.isSelected() && !RBNoBecados.isSelected()
                && !RBFuncionarios.isSelected() && !RBVentas.isSelected()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor seleccione un tipo de reporte",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Fechas
        if (jDateInicio.getDateFormatString().isEmpty() || jDateFin.getDateFormatString().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor seleccione un intervalo de fecha",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            conn = new Conexion();
            // Parametros
            Map map = new HashMap();
            map.put("titulo", titulo);
            map.put("periodo", periodo);
            map.put("fechaInicio", jDateInicio.getDate());
            map.put("fechaFin", jDateFin.getDate());
            map.put("id_persona", id_persona);
            map.put("beca", beca);
            // Compilando reporte
            this.jasperReport = (JasperReport) JasperCompileManager.compileReport(reportSource);
            this.jasperPrint = JasperFillManager.fillReport(this.jasperReport, map, this.conn.getConnection());
            // Cerrando conexión
            this.conn.close();
            // Mostrando reporte
            JasperViewer.viewReport(this.jasperPrint, false);
        } catch (IOException | SQLException | JRException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Iniciar_Sesion.activarPrincipal();
    }//GEN-LAST:event_formWindowClosed

    private void RBBecadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBecadosActionPerformed
        id_persona = 1;
        beca = true;
        titulo = RBBecados.getText();
    }//GEN-LAST:event_RBBecadosActionPerformed

    private void RBSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSemanalActionPerformed
        periodo = "Semanal";
    }//GEN-LAST:event_RBSemanalActionPerformed

    private void RBMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMensualActionPerformed
        periodo = "Mensual";
    }//GEN-LAST:event_RBMensualActionPerformed

    private void RBNoBecadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNoBecadosActionPerformed
        id_persona = 1;
        beca = false;
        titulo = RBNoBecados.getText();
    }//GEN-LAST:event_RBNoBecadosActionPerformed

    private void RBFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFuncionariosActionPerformed
        id_persona = 2;
        beca = false;
        titulo = RBFuncionarios.getText();
    }//GEN-LAST:event_RBFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Reportes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBBecados;
    private javax.swing.JRadioButton RBFuncionarios;
    private javax.swing.JRadioButton RBMensual;
    private javax.swing.JRadioButton RBNoBecados;
    private javax.swing.JRadioButton RBSemanal;
    private javax.swing.JRadioButton RBVentas;
    private javax.swing.ButtonGroup btnGPeriodo;
    private javax.swing.ButtonGroup btnGTipos;
    private javax.swing.JButton btnGenerarReporte;
    private com.toedter.calendar.JDateChooser jDateFin;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblSelectDate;
    private javax.swing.JLabel lblSelectPeriodo;
    private javax.swing.JLabel lblSelectTipo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
