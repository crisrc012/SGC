/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Institucion_bl;
import cr.ac.uia.SistemaGC.entities.Institucion;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Pao
 */
public class Principal extends SGCForm {

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

        lblLogoEscuela = new javax.swing.JLabel();
        lblSGC = new javax.swing.JLabel();
        lblLogoInstitucion = new javax.swing.JLabel();
        lblNombreInstitucion = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MUsurio = new javax.swing.JMenu();
        MPersonas = new javax.swing.JMenu();
        MTipoBeca = new javax.swing.JMenu();
        MAdmBeca = new javax.swing.JMenu();
        MVentaTiq = new javax.swing.JMenu();
        MGestionIngreso = new javax.swing.JMenu();
        MGestionParam = new javax.swing.JMenu();
        MReportes = new javax.swing.JMenu();
        MHerramientas = new javax.swing.JMenu();
        MInstitucion = new javax.swing.JMenuItem();
        MRespaldo = new javax.swing.JMenuItem();
        MAcerca = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblLogoEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/SplashSmall.png"))); // NOI18N

        lblSGC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSGC.setText("Sistema de Gestión de Comedores");

        lblNombreInstitucion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreInstitucion.setText("Mi institución");

        MenuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Menú", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        MUsurio.setText("Usuario");
        MUsurio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MUsurio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MUsurioMousePressed(evt);
            }
        });
        MenuBar.add(MUsurio);

        MPersonas.setText("Personas");
        MPersonas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MPersonasMousePressed(evt);
            }
        });
        MenuBar.add(MPersonas);

        MTipoBeca.setText("Tipos de Becas");
        MTipoBeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MTipoBeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MTipoBecaMousePressed(evt);
            }
        });
        MenuBar.add(MTipoBeca);

        MAdmBeca.setText("Administrar Becas");
        MAdmBeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MAdmBeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MAdmBecaMousePressed(evt);
            }
        });
        MenuBar.add(MAdmBeca);

        MVentaTiq.setText("Tiquetes");
        MVentaTiq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MVentaTiq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MVentaTiqMousePressed(evt);
            }
        });
        MenuBar.add(MVentaTiq);

        MGestionIngreso.setText("Ingreso al comedor");
        MGestionIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MGestionIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MGestionIngresoMousePressed(evt);
            }
        });
        MenuBar.add(MGestionIngreso);

        MGestionParam.setText("Precios");
        MGestionParam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MGestionParam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MGestionParamMousePressed(evt);
            }
        });
        MenuBar.add(MGestionParam);

        MReportes.setText("Reportes");
        MReportes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MReportesMousePressed(evt);
            }
        });
        MenuBar.add(MReportes);

        MHerramientas.setText("Herramientas");
        MHerramientas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MInstitucion.setText("Institución");
        MInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MInstitucionActionPerformed(evt);
            }
        });
        MHerramientas.add(MInstitucion);

        MRespaldo.setText("Respaldo");
        MRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRespaldoActionPerformed(evt);
            }
        });
        MHerramientas.add(MRespaldo);

        MenuBar.add(MHerramientas);

        MAcerca.setText("Acerca de");
        MAcerca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MAcercaMousePressed(evt);
            }
        });
        MenuBar.add(MAcerca);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLogoInstitucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogoEscuela))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSGC)
                            .addComponent(lblNombreInstitucion))
                        .addGap(0, 399, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSGC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreInstitucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoEscuela, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogoInstitucion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // Ventana centrada de forma mandatoria
        this.setLocation(0, 0);
    }//GEN-LAST:event_formComponentMoved

    private void desactivar() {
        this.setEnabled(false);
        this.setAutoRequestFocus(false);
    }

    private void MUsurioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MUsurioMousePressed
        desactivar();
        try {
            new Usuarios_Principal().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_MUsurioMousePressed

    private void MPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPersonasMousePressed
        desactivar();
        try {
            new Personas_Principal().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MPersonasMousePressed

    private void MTipoBecaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTipoBecaMousePressed
        desactivar();
        new Becas_Principal().setVisible(true);
    }//GEN-LAST:event_MTipoBecaMousePressed

    private void MAdmBecaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAdmBecaMousePressed
        desactivar();
        try {
            new Becados_Principal().setVisible(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_MAdmBecaMousePressed

    private void MVentaTiqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MVentaTiqMousePressed
        desactivar();
        new VentaTiquetes().setVisible(true);
    }//GEN-LAST:event_MVentaTiqMousePressed

    private void MGestionIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MGestionIngresoMousePressed
        desactivar();
        new IngresoComedor().setVisible(true);
    }//GEN-LAST:event_MGestionIngresoMousePressed

    private void MGestionParamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MGestionParamMousePressed
        desactivar();
        new GestionPrecio().setVisible(true);
    }//GEN-LAST:event_MGestionParamMousePressed

    private void MReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MReportesMousePressed
        desactivar();
        new Reportes().setVisible(true);
    }//GEN-LAST:event_MReportesMousePressed

    private void MAcercaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAcercaMousePressed
        desactivar();
        new Acercade().setVisible(true);
    }//GEN-LAST:event_MAcercaMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(0, 0);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height - 37);
        cargarLogo();
    }//GEN-LAST:event_formWindowOpened

    private void MRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRespaldoActionPerformed
        new Respaldo().setVisible(true);
    }//GEN-LAST:event_MRespaldoActionPerformed

    private void MInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MInstitucionActionPerformed
        new SGCInstitucion().setVisible(true);
    }//GEN-LAST:event_MInstitucionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAcerca;
    private javax.swing.JMenu MAdmBeca;
    private javax.swing.JMenu MGestionIngreso;
    private javax.swing.JMenu MGestionParam;
    private javax.swing.JMenu MHerramientas;
    private javax.swing.JMenuItem MInstitucion;
    private javax.swing.JMenu MPersonas;
    private javax.swing.JMenu MReportes;
    private javax.swing.JMenuItem MRespaldo;
    private javax.swing.JMenu MTipoBeca;
    private javax.swing.JMenu MUsurio;
    private javax.swing.JMenu MVentaTiq;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel lblLogoEscuela;
    private javax.swing.JLabel lblLogoInstitucion;
    private javax.swing.JLabel lblNombreInstitucion;
    private javax.swing.JLabel lblSGC;
    // End of variables declaration//GEN-END:variables

    public void cargarLogo() {
        try {
            // Descangando logo de la base de datos
            Institucion_bl ibl = new Institucion_bl();
            Institucion i = ibl.select();
            if (i.getInFoto() != null) {
                ImageIcon image = new ImageIcon(i.getInFoto());
                lblNombreInstitucion.setText(i.getNombre());
                lblLogoInstitucion.setIcon(image);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
