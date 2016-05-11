/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Personas_bl;
import cr.ac.uia.SistemaGC.entities.Personas;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Pao
 */
public class Personas_Principal extends SGCForm {

    /**
     * Creates new form Personas
     */
    public Personas_Principal() {
        initComponents();
        SGCconf();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        lblTituloGP = new javax.swing.JLabel();
        btnAgregarPersona = new SGCButton();
        btnModificarPersona = new javax.swing.JButton();
        btnDesactivarPersona = new SGCButton();
        btnImprimirCodigo = new SGCButton();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tblPersonas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Fecha de Nacimiento", "Celular", "Teléfono", "Encargado", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonas.setShowHorizontalLines(false);
        tblPersonas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblPersonas);

        lblTituloGP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloGP.setText("Gestión de Personas");

        btnAgregarPersona.setText("Agregar Persona");
        btnAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonaActionPerformed(evt);
            }
        });

        btnModificarPersona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarPersona.setText("Modificar Persona");
        btnModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPersonaActionPerformed(evt);
            }
        });

        btnDesactivarPersona.setText("Desactivar Persona");

        btnImprimirCodigo.setText("Imprimir Código de Barra");
        btnImprimirCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirCodigoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/persons.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnModificarPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(btnDesactivarPersona)
                        .addGap(166, 166, 166)
                        .addComponent(btnImprimirCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloGP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarPersona)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblTituloGP)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarPersona)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirCodigo)
                    .addComponent(btnDesactivarPersona))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonaActionPerformed
        this.setVisible(false);
        new Personas_Formulario().setVisible(true);
    }//GEN-LAST:event_btnAgregarPersonaActionPerformed

    private void btnModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPersonaActionPerformed
        int i = tblPersonas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una celda.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        new Personas_Formulario(true,
                new Personas(
                        (Integer) tblPersonas.getValueAt(i, 0),
                        (String) tblPersonas.getValueAt(i, 1),
                        (String) tblPersonas.getValueAt(i, 2),
                        (Date) tblPersonas.getValueAt(i, 3),
                        (Integer) tblPersonas.getValueAt(i, 4),
                        (Integer) tblPersonas.getValueAt(i, 5),
                        (String) tblPersonas.getValueAt(i, 6),
                        (Integer) tblPersonas.getValueAt(i, 7))).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModificarPersonaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Iniciar_Sesion.activarPrincipal();
    }//GEN-LAST:event_formWindowClosed

    private void btnImprimirCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirCodigoActionPerformed
        int i = tblPersonas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una celda.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            new BarCode_Formulario ((Integer) tblPersonas.getValueAt(i, 0)).setVisible(true);
        }
            
        
    }//GEN-LAST:event_btnImprimirCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(Personas_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Personas_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPersona;
    private javax.swing.JButton btnDesactivarPersona;
    private javax.swing.JButton btnImprimirCodigo;
    private javax.swing.JButton btnModificarPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloGP;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tblPersonas.getModel();
            tableModel.setRowCount(0);
            TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(tableModel);
            tblPersonas.setRowSorter(order);
            Personas_bl pbl = new Personas_bl();
            ArrayList<Personas> al = pbl.select(new Personas());
            for (int i = 0; i < al.size(); i++) {
                Object[] ap = {al.get(i).getCedula(),
                    al.get(i).getNombre(),
                    al.get(i).getApellidos(),
                    al.get(i).getFecha_nacimiento(),
                    al.get(i).getTel_celular(),
                    al.get(i).getTel_habitacion(),
                    al.get(i).getEncargado(),
                    al.get(i).getId_persona()};
                tableModel.addRow(ap);
            }
            this.tblPersonas.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
