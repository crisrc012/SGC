/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

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
        setIconImage(getIconImage());
        setIconImages(null);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblLogoUIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/LogoUIA.png"))); // NOI18N

        lblSGC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSGC.setText("Sistema de Gestión de Comedores");

        lblIndicacionInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIndicacionInicial.setText("Para poder comenzar a utilizar las diferentes opciones que presenta el sistema, por favor inicie sesión. Gracias");

        MUsurio.setText("Usuario");
        MUsurio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MUsurioMousePressed(evt);
            }
        });
        MenuBar.add(MUsurio);

        MPersonas.setText("Personas");
        MPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MPersonasMousePressed(evt);
            }
        });
        MenuBar.add(MPersonas);

        MTipoBeca.setText("Tipos de Becas");
        MTipoBeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MTipoBecaMousePressed(evt);
            }
        });
        MenuBar.add(MTipoBeca);

        MAdmBeca.setText("Administrar Becas");
        MAdmBeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MAdmBecaMousePressed(evt);
            }
        });
        MenuBar.add(MAdmBeca);

        MVentaTiq.setText("Venta de Tiquetes");
        MVentaTiq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MVentaTiqMousePressed(evt);
            }
        });
        MenuBar.add(MVentaTiq);

        MGestionIngreso.setText("Gestión de Ingreso");
        MGestionIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MGestionIngresoMousePressed(evt);
            }
        });
        MenuBar.add(MGestionIngreso);

        MGestionParam.setText("Gestión de Parametros");
        MGestionParam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MGestionParamMousePressed(evt);
            }
        });
        MenuBar.add(MGestionParam);

        MReportes.setText("Reportes");
        MReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MReportesMousePressed(evt);
            }
        });
        MenuBar.add(MReportes);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblIndicacionInicial)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoUIA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSGC, javax.swing.GroupLayout.Alignment.TRAILING))
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

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // Ventana centrada de forma mandatoria
        this.setLocation(0, 0);
    }//GEN-LAST:event_formComponentMoved

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Obteniendo resolución de pantalla para que se vea a pantalla completa
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        // Definiendo propiedades de la ventana
        this.setResizable(false);
    }//GEN-LAST:event_formComponentShown

    private void MUsurioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MUsurioMousePressed
        new Usuarios_Principal().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MUsurioMousePressed

    private void MPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPersonasMousePressed
        new Personas_Principal().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MPersonasMousePressed

    private void MTipoBecaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTipoBecaMousePressed
        new Becas_Principal().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MTipoBecaMousePressed

    private void MAdmBecaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAdmBecaMousePressed
        new Becados_Principal().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MAdmBecaMousePressed

    private void MVentaTiqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MVentaTiqMousePressed
        new VentaTiquetes().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MVentaTiqMousePressed

    private void MGestionIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MGestionIngresoMousePressed
        new GestionIngreso().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MGestionIngresoMousePressed

    private void MGestionParamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MGestionParamMousePressed
        new GestionParametros().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MGestionParamMousePressed

    private void MReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MReportesMousePressed
        new Reportes().setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_MReportesMousePressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
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
