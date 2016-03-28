/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Becas_bl;
import cr.ac.uia.SistemaGC.entities.Becas;
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
public class Becas_Principal extends javax.swing.JFrame {

    /**
     * Creates new form TipoBeca
     */
    public Becas_Principal() {
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

        lblTituloBecas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTiposBecas = new javax.swing.JTable();
        btnAgregarBeca = new javax.swing.JButton();
        btnModificarBeca = new javax.swing.JButton();
        btnDesHabilitarBeca = new javax.swing.JButton();

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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTituloBecas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloBecas.setText("Tipos de Becas");

        tblTiposBecas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblTiposBecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Porcentaje", "Activo", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTiposBecas);

        btnAgregarBeca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarBeca.setText("Agregar Beca");
        btnAgregarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBecaActionPerformed(evt);
            }
        });

        btnModificarBeca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarBeca.setText("Modificar Beca");
        btnModificarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBecaActionPerformed(evt);
            }
        });

        btnDesHabilitarBeca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDesHabilitarBeca.setText("Des/Habilitar Beca");
        btnDesHabilitarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesHabilitarBecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnModificarBeca)
                        .addGap(80, 80, 80)
                        .addComponent(btnDesHabilitarBeca)
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblTituloBecas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarBeca)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAgregarBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTituloBecas)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesHabilitarBeca, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnModificarBeca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBecaActionPerformed
        this.dispose();
        new Becas_Formulario().setVisible(true);
    }//GEN-LAST:event_btnAgregarBecaActionPerformed

    private void btnModificarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBecaActionPerformed
        int i = tblTiposBecas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una celda.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        new Becas_Formulario(true,
                new Becas(
                        (Integer) tblTiposBecas.getValueAt(i, 0),
                        (String) tblTiposBecas.getValueAt(i, 1),
                        (Integer) tblTiposBecas.getValueAt(i, 2),
                        (Boolean) tblTiposBecas.getValueAt(i, 3),
                        (String) tblTiposBecas.getValueAt(i, 4))).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarBecaActionPerformed

    private void refreshJTable() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tblTiposBecas.getModel();
            tableModel.setRowCount(0); // Limpiando tabla
            Becas_bl bbl = new Becas_bl();
            ArrayList<Becas> al = bbl.select(new Becas());
            for (int i = 0; i < al.size(); i++) {
                Object[] ap
                        = {al.get(i).getId(),
                            al.get(i).getNombre(),
                            al.get(i).getPorcentaje(),
                            al.get(i).getActivo(),
                            al.get(i).getObservaciones()};
                tableModel.addRow(ap);
            }
            this.tblTiposBecas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.tblTiposBecas.setModel(tableModel);
            // Ocultando columna id
            this.tblTiposBecas.getColumnModel().getColumn(0).setMinWidth(0);
            this.tblTiposBecas.getColumnModel().getColumn(0).setMaxWidth(0);
            this.tblTiposBecas.getColumnModel().getColumn(0).setWidth(0);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refreshJTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnDesHabilitarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesHabilitarBecaActionPerformed
        int i = tblTiposBecas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una celda.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Becas_bl bbl = new Becas_bl();
            if (bbl.update(new Becas(
                    (Integer) tblTiposBecas.getValueAt(i, 0),
                    (String) tblTiposBecas.getValueAt(i, 1),
                    (Integer) tblTiposBecas.getValueAt(i, 2),
                    !(Boolean) tblTiposBecas.getValueAt(i, 3),
                    (String) tblTiposBecas.getValueAt(i, 4)))) {
                refreshJTable();
                JOptionPane.showMessageDialog(this,
                        "Se ha actualizado correctamente la beca.",
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
    }//GEN-LAST:event_btnDesHabilitarBecaActionPerformed

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
            java.util.logging.Logger.getLogger(Becas_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Becas_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBeca;
    private javax.swing.JButton btnDesHabilitarBeca;
    private javax.swing.JButton btnModificarBeca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloBecas;
    private javax.swing.JTable tblTiposBecas;
    // End of variables declaration//GEN-END:variables
}
