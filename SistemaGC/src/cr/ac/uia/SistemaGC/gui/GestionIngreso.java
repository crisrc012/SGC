/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Personas_bl;
import cr.ac.uia.SistemaGC.bl.Tiquetes_bl;
import cr.ac.uia.SistemaGC.entities.Personas;
import cr.ac.uia.SistemaGC.entities.Tiquetes;
import static cr.ac.uia.SistemaGC.gui.Iniciar_Sesion.PUI;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pao
 */
public class GestionIngreso extends javax.swing.JFrame {

    /**
     * Creates new form GestionIngreso
     */
    public GestionIngreso() {
        initComponents();
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("../img/Icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngComida = new javax.swing.ButtonGroup();
        lblTituloGI = new javax.swing.JLabel();
        lblCedPersona = new javax.swing.JLabel();
        btnAplicarIngreso = new javax.swing.JButton();
        txtCedPersona = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblComida = new javax.swing.JLabel();
        rbtnDesayuno = new javax.swing.JRadioButton();
        rbtnAlmuerzo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        lblTituloGI.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloGI.setText("Ingreso al Comedor");

        lblCedPersona.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCedPersona.setText("Cédula de la Persona:");

        btnAplicarIngreso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnAplicarIngreso.setText("Aplicar Ingreso");
        btnAplicarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarIngresoActionPerformed(evt);
            }
        });

        txtCedPersona.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlbNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbNombre.setText("Nombre de la Persona:");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Descripción:");

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblComida.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComida.setText("Hora de comida:");

        btngComida.add(rbtnDesayuno);
        rbtnDesayuno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnDesayuno.setText("Desayuno");

        btngComida.add(rbtnAlmuerzo);
        rbtnAlmuerzo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtnAlmuerzo.setText("Almuerzo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblTituloGI))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnAplicarIngreso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbNombre)
                                .addGap(18, 18, 18)
                                .addComponent(lblName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(133, 133, 133)
                                .addComponent(lblDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCedPersona)
                                    .addComponent(lblComida))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnDesayuno)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnAlmuerzo))
                                    .addComponent(txtCedPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloGI)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComida)
                    .addComponent(rbtnDesayuno)
                    .addComponent(rbtnAlmuerzo))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedPersona)
                    .addComponent(txtCedPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(lblName))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDescripcion))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnAplicarIngreso)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar(){
        txtCedPersona.setText("");
        lblName.setText("");
    }
    
    private void btnAplicarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarIngresoActionPerformed
        
        if (txtCedPersona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor digite una cédula válida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int cedula = Integer.parseInt(txtCedPersona.getText());
            Personas p = new Personas();
            p.setCedula(cedula);
            Personas_bl pbl = new Personas_bl();
            ArrayList<Personas> ap = pbl.select(p);
            if (ap.size() > 0) {
                lblName.setText(ap.get(0).getNombre() + " " + ap.get(0).getApellidos());
            }
            Tiquetes_bl tbl = new Tiquetes_bl();
            int cantidad = tbl.count(cedula);
            if (cantidad > 1) {
                if (JOptionPane.showConfirmDialog(this, "Usted tiene disponibles: " + cantidad + " tiquetes.\n"
                        + "¿Desea utilizar uno?",
                        "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ArrayList<Tiquetes> al = tbl.activos(cedula);
                    Tiquetes t = al.get(0);
                    t.setActivo(false); // Desactivando tiquete
                    if (tbl.update(t)) {
                        JOptionPane.showMessageDialog(this,
                                "Se ha usado correctamente el tiquete",
                                "Correcto", JOptionPane.INFORMATION_MESSAGE);
                        this.limpiar();
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Ha ocurrido un error por favor intentelo de nuevo",
                                "Correcto", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
                } else {
                    this.limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Por favor compre un tiquete",
                        "Error", JOptionPane.ERROR_MESSAGE);
                this.limpiar();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAplicarIngresoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        PUI.setEnabled(true);
        PUI.toFront();
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
            java.util.logging.Logger.getLogger(GestionIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionIngreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarIngreso;
    private javax.swing.ButtonGroup btngComida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel lblCedPersona;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTituloGI;
    private javax.swing.JRadioButton rbtnAlmuerzo;
    private javax.swing.JRadioButton rbtnDesayuno;
    private javax.swing.JTextField txtCedPersona;
    // End of variables declaration//GEN-END:variables
}
