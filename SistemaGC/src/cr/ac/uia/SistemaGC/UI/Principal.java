/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Pao
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        // Obteniendo resolucion de pantalla para que se vea a pantalla completa
        setResizable(false);
        setAlwaysOnTop(true);
        Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(res);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogoUIA = new javax.swing.JLabel();
        lblSGC = new javax.swing.JLabel();
        lblIndicacionInicial = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MUsurio = new javax.swing.JMenu();
        MPersonas = new javax.swing.JMenu();
        MTipoBeca = new javax.swing.JMenu();
        MAdmBeca = new javax.swing.JMenu();
        MVentaTiq = new javax.swing.JMenu();
        MGestionIngreso = new javax.swing.JMenu();
        MGestionParam = new javax.swing.JMenu();
        MReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogoUIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/LogoUIA.png"))); // NOI18N

        lblSGC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSGC.setText("Sistema de Gestión de Comedores");

        lblIndicacionInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIndicacionInicial.setText("Para poder comenzar a utilizar las diferentes opciones que presenta el sistema, por favor inicie sesión. Gracias");

        MUsurio.setText("Usuario");
        MUsurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUsurioActionPerformed(evt);
            }
        });
        MenuBar.add(MUsurio);

        MPersonas.setText("Personas");
        MPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPersonasActionPerformed(evt);
            }
        });
        MenuBar.add(MPersonas);

        MTipoBeca.setText("Tipos de Becas");
        MTipoBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTipoBecaActionPerformed(evt);
            }
        });
        MenuBar.add(MTipoBeca);

        MAdmBeca.setText("Administrar Becas");
        MAdmBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAdmBecaActionPerformed(evt);
            }
        });
        MenuBar.add(MAdmBeca);

        MVentaTiq.setText("Venta de Tiquetes");
        MVentaTiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MVentaTiqActionPerformed(evt);
            }
        });
        MenuBar.add(MVentaTiq);

        MGestionIngreso.setText("Gestión de Ingreso");
        MGestionIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGestionIngresoActionPerformed(evt);
            }
        });
        MenuBar.add(MGestionIngreso);

        MGestionParam.setText("Gestión de Parametros");
        MGestionParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGestionParamActionPerformed(evt);
            }
        });
        MenuBar.add(MGestionParam);

        MReportes.setText("Reportes");
        MReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MReportesActionPerformed(evt);
            }
        });
        MenuBar.add(MReportes);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoUIA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblIndicacionInicial)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSGC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblSGC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoUIA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIndicacionInicial)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MUsurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUsurioActionPerformed
        new Usuarios().setVisible(true);
    }//GEN-LAST:event_MUsurioActionPerformed

    private void MPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPersonasActionPerformed
        new Personas().setVisible(true);
    }//GEN-LAST:event_MPersonasActionPerformed

    private void MTipoBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTipoBecaActionPerformed
        new TipoBeca().setVisible(true);
    }//GEN-LAST:event_MTipoBecaActionPerformed

    private void MAdmBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAdmBecaActionPerformed
        new AdministrarBecas().setVisible(true);
    }//GEN-LAST:event_MAdmBecaActionPerformed

    private void MVentaTiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MVentaTiqActionPerformed
        new VentaTiquetes().setVisible(true);
    }//GEN-LAST:event_MVentaTiqActionPerformed

    private void MGestionIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGestionIngresoActionPerformed
        new GestionIngreso().setVisible(true);
    }//GEN-LAST:event_MGestionIngresoActionPerformed

    private void MGestionParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGestionParamActionPerformed
        new GestionParametros().setVisible(true);
    }//GEN-LAST:event_MGestionParamActionPerformed

    private void MReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MReportesActionPerformed
        new Reportes().setVisible(true);
    }//GEN-LAST:event_MReportesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAdmBeca;
    private javax.swing.JMenu MGestionIngreso;
    private javax.swing.JMenu MGestionParam;
    private javax.swing.JMenu MPersonas;
    private javax.swing.JMenu MReportes;
    private javax.swing.JMenu MTipoBeca;
    private javax.swing.JMenu MUsurio;
    private javax.swing.JMenu MVentaTiq;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel lblIndicacionInicial;
    private javax.swing.JLabel lblLogoUIA;
    private javax.swing.JLabel lblSGC;
    // End of variables declaration//GEN-END:variables
}
