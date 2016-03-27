/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Usuarios_bl;
import cr.ac.uia.SistemaGC.entities.Usuarios;
import static cr.ac.uia.SistemaGC.gui.Iniciar_Sesion.PUI;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pao
 */
public class Usuarios_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios_Principal() {
        initComponents();
    }

    public Usuarios_Principal(boolean update, Usuarios usuarios) {
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

        lblTituloUsuarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAgregarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnDesHabilitarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTituloUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloUsuarios.setText("Gestión de Usuarios");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Usuario", "Nombre", "Apellidos", "Activo", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnAgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnDesHabilitarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDesHabilitarUsuario.setText("Des/Habilitar Usuario");
        btnDesHabilitarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesHabilitarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnModificarUsuario)
                        .addGap(108, 108, 108)
                        .addComponent(btnDesHabilitarUsuario)
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarUsuario)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTituloUsuarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTituloUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesHabilitarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJTable() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tblUsuarios.getModel();
            tableModel.setRowCount(0);
            Usuarios_bl ubl = new Usuarios_bl();
            ArrayList<Usuarios> u = ubl.select(new Usuarios());
            for (int i = 0; i < u.size(); i++) {
                Object[] ap = {
                    u.get(i).getCedula(),
                    u.get(i).getUsuario(),
                    u.get(i).getNombre(),
                    u.get(i).getApellidos(),
                    u.get(i).getActivo(),
                    u.get(i).getObservaciones()
                };
                tableModel.addRow(ap);
            }
            this.tblUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.tblUsuarios.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        this.dispose();
        new Usuarios_Formulario().setVisible(true);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        int i = tblUsuarios.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una celda.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        new Usuarios_Formulario(true,
                new Usuarios(
                        (Integer) tblUsuarios.getValueAt(i, 0),
                        (String) tblUsuarios.getValueAt(i, 1),
                        null,
                        (String) tblUsuarios.getValueAt(i, 2),
                        (String) tblUsuarios.getValueAt(i, 3),
                        (Boolean) tblUsuarios.getValueAt(i, 4),
                        (String) tblUsuarios.getValueAt(i, 5),
                        1
                )).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refreshJTable();
    }//GEN-LAST:event_formWindowOpened

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        tblUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        PUI.setEnabled(true);
        PUI.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void btnDesHabilitarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesHabilitarUsuarioActionPerformed
        int i = tblUsuarios.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una fila.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Usuarios_bl ubl = new Usuarios_bl();
            if (ubl.update(new Usuarios(
                    (Integer) tblUsuarios.getValueAt(i, 0),
                    (String) tblUsuarios.getValueAt(i, 1),
                    null,
                    (String) tblUsuarios.getValueAt(i, 2),
                    (String) tblUsuarios.getValueAt(i, 3),
                    !(Boolean) tblUsuarios.getValueAt(i, 4),
                    (String) tblUsuarios.getValueAt(i, 5),
                    1))) {
                refreshJTable();
                JOptionPane.showMessageDialog(this,
                        "Se ha actualizado correctamente el usuario.",
                        "Correcto",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Ha ocurrido un error.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnDesHabilitarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Usuarios_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnDesHabilitarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloUsuarios;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}