/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;

/**
 *
 * @author Pao
 */
public class BarCode_Formulario extends javax.swing.JFrame {
    private final int cedula;

    /**
     * Creates new form BarCode
     */
    public BarCode_Formulario() {
        initComponents();
        this.cedula = 0;
    }

    public BarCode_Formulario(int cedula) {
        initComponents();
        this.cedula = cedula;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        lblTituloBC = new javax.swing.JLabel();
        btnGenerarCodigo = new javax.swing.JButton();
        pnlBar = new javax.swing.JPanel();
        btnImprimirCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTituloBC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloBC.setText("Código de Barras");

        btnGenerarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerarCodigo.setText("Generar Código");
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBarLayout = new javax.swing.GroupLayout(pnlBar);
        pnlBar.setLayout(pnlBarLayout);
        pnlBarLayout.setHorizontalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBarLayout.setVerticalGroup(
            pnlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnImprimirCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImprimirCodigo.setText("Imprimir Código");
        btnImprimirCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloBC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnlBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                            .addComponent(btnGenerarCodigo)
                            .addComponent(btnImprimirCodigo))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTituloBC)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirCodigo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Barcode b = null;
    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede generar un código vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        b = null;
        try {
            b = BarcodeFactory.createCode128B(txtCodigo.getText());
        } catch (BarcodeException e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible hacer el código: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        pnlBar.removeAll();
        pnlBar.add(b);
        pnlBar.updateUI();
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void btnImprimirCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirCodigoActionPerformed
        try {
            if (b == null) {
                JOptionPane.showMessageDialog(null, "Debe generar un código primero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(b);
            if (job.printDialog()) {
                job.print();
            }
        } catch (HeadlessException | PrinterException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirCodigoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        if(this.cedula!=0){
            txtCodigo.setText(String.valueOf(cedula));
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(BarCode_Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BarCode_Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JButton btnImprimirCodigo;
    private javax.swing.JLabel lblTituloBC;
    private javax.swing.JPanel pnlBar;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}