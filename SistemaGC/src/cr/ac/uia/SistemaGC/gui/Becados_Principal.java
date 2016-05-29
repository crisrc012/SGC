/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Becados_VW_bl;
import cr.ac.uia.SistemaGC.bl.Becados_bl;
import cr.ac.uia.SistemaGC.bl.Becas_bl;
import cr.ac.uia.SistemaGC.entities.Becados;
import cr.ac.uia.SistemaGC.entities.Becados_VW;
import cr.ac.uia.SistemaGC.entities.Becas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Pao
 */
public class Becados_Principal extends SGCForm {

    /**
     * Creates new form AdministrarBecas
     */
    public Becados_Principal() {
        initComponents();
        SGCconf();
        refreshJTable();
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
        tblAdmBecas = new javax.swing.JTable();
        lblTituloAdmiBecas = new javax.swing.JLabel();
        btnAsignarBeca = new SGCButton();
        btnModificarAsignacion = new SGCButton();
        btnDesasignarBeca = new SGCButton();
        jLabel1 = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        txtFiltro = new SGCTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tblAdmBecas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAdmBecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Descripción", "Beca", "Porcentaje", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdmBecas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblAdmBecas.setShowHorizontalLines(false);
        tblAdmBecas.setShowVerticalLines(false);
        tblAdmBecas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAdmBecas);

        lblTituloAdmiBecas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloAdmiBecas.setText("Administrar Becas");

        btnAsignarBeca.setText("Asignar Beca");
        btnAsignarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarBecaActionPerformed(evt);
            }
        });

        btnModificarAsignacion.setText("Modificar Asignación");
        btnModificarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAsignacionActionPerformed(evt);
            }
        });

        btnDesasignarBeca.setText("Des/Asignar Beca");
        btnDesasignarBeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesasignarBecaActionPerformed(evt);
            }
        });

        lblFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiltro.setText("Búsqueda por nombre:");

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloAdmiBecas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addComponent(btnAsignarBeca)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnModificarAsignacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDesasignarBeca)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAsignarBeca)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloAdmiBecas)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltro))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarAsignacion)
                    .addComponent(btnDesasignarBeca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarBecaActionPerformed
        this.setVisible(false);
        new Becados_Formulario().setVisible(true);
    }//GEN-LAST:event_btnAsignarBecaActionPerformed

    private void btnModificarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAsignacionActionPerformed
        int i = tblAdmBecas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una persona en la tabla.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = 0;
        try {
            Becas beca = new Becas();
            Becas_bl Bbl = new Becas_bl();
            beca.setNombre(String.valueOf(tblAdmBecas.getValueAt(i, 4)));
            ArrayList<Becas> abl = Bbl.select(beca);
            if (abl.size() > 0) {
                id = abl.get(0).getId();
            }
            Becados_bl bbl = new Becados_bl();
            Becados b = new Becados();
            b.setId_persona(Long.parseLong(tblAdmBecas.getValueAt(i, 0).toString()));
            new Becados_Formulario(true,
                    new Becados(bbl.select(b).get(0).getId(),
                            Long.parseLong(tblAdmBecas.getValueAt(i, 0).toString()),
                            id, (Boolean) tblAdmBecas.getValueAt(i, 6),
                            (String) tblAdmBecas.getValueAt(i, 3))
            ).setVisible(true);
            setVisible(false);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnModificarAsignacionActionPerformed

    private void refreshJTable() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) tblAdmBecas.getModel();
            tableModel.setRowCount(0); // Limpiando tabla
            TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(tableModel);
            tblAdmBecas.setRowSorter(order);
            Becados_VW_bl bbl = new Becados_VW_bl();
            ArrayList<Becados_VW> al = bbl.select(new Becados_VW());
            for (int i = 0; i < al.size(); i++) {
                Object[] ap
                        = {al.get(i).getCedula(),
                            al.get(i).getNombre(),
                            al.get(i).getApellidos(),
                            al.get(i).getDescripcion(),
                            al.get(i).getBeca(),
                            al.get(i).getPorcentaje(),
                            al.get(i).getActivo()};
                tableModel.addRow(ap);
            }
            this.tblAdmBecas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.tblAdmBecas.setModel(tableModel);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Iniciar_Sesion.activarPrincipal();
    }//GEN-LAST:event_formWindowClosed

    private void btnDesasignarBecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesasignarBecaActionPerformed
        int i = tblAdmBecas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una persona en la tabla.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Becados_bl bbl = new Becados_bl();
            Becados b = new Becados();
            b.setId_persona((Long) tblAdmBecas.getValueAt(i, 0));
            b = bbl.select(b).get(0);
            b.setActivo(!b.getActivo());
            if (bbl.update(b)) {
                refreshJTable();
                JOptionPane.showMessageDialog(this,
                        "Se ha actualizado correctamente la asiganción de beca.",
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
    }//GEN-LAST:event_btnDesasignarBecaActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        new SGCFiltro().Filtrar(txtFiltro, tblAdmBecas);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        txtFiltro.setText(txtFiltro.getText().toUpperCase());
    }//GEN-LAST:event_txtFiltroKeyReleased

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
            java.util.logging.Logger.getLogger(Becados_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Becados_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarBeca;
    private javax.swing.JButton btnDesasignarBeca;
    private javax.swing.JButton btnModificarAsignacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblTituloAdmiBecas;
    private javax.swing.JTable tblAdmBecas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
