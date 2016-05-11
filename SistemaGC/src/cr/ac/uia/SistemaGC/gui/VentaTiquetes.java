/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import cr.ac.uia.SistemaGC.bl.Becados_bl;
import cr.ac.uia.SistemaGC.bl.Becas_bl;
import cr.ac.uia.SistemaGC.bl.Persona_bl;
import cr.ac.uia.SistemaGC.bl.Personas_bl;
import cr.ac.uia.SistemaGC.bl.Precio_bl;
import cr.ac.uia.SistemaGC.bl.Tiquetes_bl;
import cr.ac.uia.SistemaGC.entities.Becados;
import cr.ac.uia.SistemaGC.entities.Becas;
import cr.ac.uia.SistemaGC.entities.Persona;
import cr.ac.uia.SistemaGC.entities.Personas;
import cr.ac.uia.SistemaGC.entities.Precio;
import cr.ac.uia.SistemaGC.entities.Tiquetes;
import java.awt.HeadlessException;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Pao
 */
public class VentaTiquetes extends SGCForm {

    private int id_persona;
    private Integer precioD;
    private Integer precioA;

    /**
     * Creates new form VentaTiquetes
     */
    public VentaTiquetes() {
        initComponents();
        SGCconf();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloVT = new javax.swing.JLabel();
        lblDesayuno = new javax.swing.JLabel();
        lblAlmuerzo = new javax.swing.JLabel();
        lblSigno1 = new javax.swing.JLabel();
        lblSigno2 = new javax.swing.JLabel();
        lblPrecioDes = new javax.swing.JLabel();
        lblPrecioAlm = new javax.swing.JLabel();
        lblTipoComida = new javax.swing.JLabel();
        lblCantTique = new javax.swing.JLabel();
        lblCedPersona = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        cboTiposComida = new javax.swing.JComboBox();
        txtCedula = new SGCTextField();
        txtNombre = new SGCTextField();
        btnCosultarCed = new SGCButton();
        btnComprar = new SGCButton();
        btnCancelar = new SGCButton();
        lblTickets = new javax.swing.JLabel();
        lblBreakfast = new javax.swing.JLabel();
        lblLunch = new javax.swing.JLabel();
        lblBuy = new javax.swing.JLabel();
        lblCancel = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new SGCTextField();
        txtCantidad = new javax.swing.JSpinner();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTituloVT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloVT.setText("VENTA DE TIQUETES");

        lblDesayuno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDesayuno.setText("DESAYUNO");

        lblAlmuerzo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAlmuerzo.setText("ALMUERZO");

        lblSigno1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSigno1.setText("₡");

        lblSigno2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSigno2.setText("₡");

        lblPrecioDes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPrecioDes.setText("0");

        lblPrecioAlm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPrecioAlm.setText("0");

        lblTipoComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoComida.setText("Tipo de comida:");

        lblCantTique.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCantTique.setText("Cantidad de tiquetes:");

        lblCedPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedPersona.setText("Cédula de Persona:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre Completo:");

        cboTiposComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboTiposComida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Desayuno", "Almuerzo" }));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        txtNombre.setEnabled(false);

        btnCosultarCed.setText("Consultar");
        btnCosultarCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosultarCedActionPerformed(evt);
            }
        });

        btnComprar.setText("VENDER TIQUETE");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR VENTA");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/tickets.png"))); // NOI18N

        lblBreakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/Breakfast2.png"))); // NOI18N

        lblLunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/lunch2.png"))); // NOI18N

        lblBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/shop1.png"))); // NOI18N

        lblCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/uia/SistemaGC/img/shop2.png"))); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripción:");

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTickets)
                        .addGap(18, 18, 18)
                        .addComponent(lblTituloVT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblBreakfast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesayuno)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSigno1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecioDes)))
                        .addGap(80, 80, 80)
                        .addComponent(lblLunch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSigno2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecioAlm))
                            .addComponent(lblAlmuerzo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBuy)
                            .addComponent(lblCancel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar)
                            .addComponent(btnComprar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoComida)
                            .addComponent(lblCantTique))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTiposComida, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedPersona)
                            .addComponent(lblNombre)
                            .addComponent(lblDescripcion))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCosultarCed))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTickets))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTituloVT)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDesayuno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSigno1)
                            .addComponent(lblPrecioDes)))
                    .addComponent(lblBreakfast)
                    .addComponent(lblLunch)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlmuerzo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSigno2)
                            .addComponent(lblPrecioAlm))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoComida)
                    .addComponent(cboTiposComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantTique)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedPersona)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCosultarCed))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Iniciar_Sesion.activarPrincipal();
    }//GEN-LAST:event_formWindowClosed

    private void limpiar() {
        txtCedula.setEnabled(true);
        txtCantidad.setValue(1);
        txtCedula.setText("");
        txtNombre.setText("");
        lblPrecioAlm.setText("0");
        lblPrecioDes.setText("0");
    }
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            int answ = JOptionPane.showConfirmDialog(this, "¿Está seguro de realizar la compra?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (answ == JOptionPane.YES_OPTION) {
                int cant = Integer.parseInt(txtCantidad.getValue().toString());
                int id_comida = 0;
                Date fecha = new Date();
                java.sql.Date fechaActual = new java.sql.Date(fecha.getTime());
                if (cboTiposComida.getSelectedIndex() == 0 && id_persona == 1) {
                    id_comida = 1;
                } else if (cboTiposComida.getSelectedIndex() == 0 && id_persona == 2) {
                    id_comida = 2;
                } else if (cboTiposComida.getSelectedIndex() == 1 && id_persona == 1) {
                    id_comida = 3;
                } else if (cboTiposComida.getSelectedIndex() == 1 && id_persona == 2) {
                    id_comida = 4;
                }
                int correctos = 0;
                for (int i = 0; i < cant; i++) {
                    Tiquetes_bl tbl = new Tiquetes_bl();
                    Tiquetes tiquete = new Tiquetes(
                            null, Integer.parseInt(txtCedula.getText().trim()),
                            id_comida, fechaActual, null, true);
                    if (tbl.insert(tiquete)) {
                        correctos++;
                    }
                }
                JOptionPane.showMessageDialog(this,
                        "Se han comprado con éxito " + correctos + " tiquetes",
                        "Correcto", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                limpiar();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCosultarCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosultarCedActionPerformed
        try {
            // Validaciones
            if (txtCedula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor digite una cédula válida",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            txtCedula.setEnabled(false);
            Personas_bl pbl = new Personas_bl();
            Personas p = new Personas();
            p.setCedula(Integer.parseInt(txtCedula.getText().trim()));
            ArrayList<Personas> al = pbl.select(p);
            if (al.size() > 0) {
                txtNombre.setText(
                        al.get(0).getNombre() + " " + al.get(0).getApellidos());
                id_persona = al.get(0).getId_persona();
                Precios(al.get(0).getId_persona());
                calcularTotal();
            } else {
                JOptionPane.showMessageDialog(this,
                        "No existe ninguna persona relacionada a la cédula ingresada",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            Persona ps = new Persona();
            ps.setId(id_persona);
            Persona_bl psbl = new Persona_bl();
            ArrayList<Persona> ap = psbl.select(ps);
            if (ap.size() > 0) {
                txtDescripcion.setText(ap.get(0).getDescripcion());
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnCosultarCedActionPerformed

    private void validarEnteros(JTextField txt) {
        try {
            if (Integer.parseInt(txt.getText()) < 1) {
                JOptionPane.showMessageDialog(this,
                        "Por favor digite únicamente números positivos",
                        "Error", JOptionPane.ERROR_MESSAGE);
                txt.setText("");
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor digite únicamente números",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txt.setText("");
        }
    }

    private void Precios(int id_persona) {
        Precio_bl pbl = new Precio_bl();
        precioD = 0;
        precioA = 0;
        try {
            ArrayList<Precio> ap = pbl.select(new Precio());
            for (int i = 0; i < ap.size(); i++) {
                if (id_persona == 1) {
                    if (ap.get(i).getId_persona() == 1) { // Estudiante
                        if (ap.get(i).getId_comida() == 1) {
                            precioD = ap.get(i).getPrecio();
                        } else if (ap.get(i).getId_comida() == 2) {
                            precioA = ap.get(i).getPrecio();
                        }
                    } else // Docente
                     if (id_persona == 2) {
                            if (ap.get(i).getId_comida() == 1) {
                                precioD = ap.get(i).getPrecio();
                            } else if (ap.get(i).getId_comida() == 2) {
                                precioA = ap.get(i).getPrecio();
                            }
                        }
                }//id=1
            }
            lblPrecioDes.setText(precioD.toString());
            lblPrecioAlm.setText(precioA.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        validarEnteros(txtCedula);
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void calcularTotal() {
        try {
            Becados b = new Becados();
            Becados_bl bbl = new Becados_bl();
            b.setId_persona(Integer.parseInt(txtCedula.getText()));
            ArrayList<Becados> al = bbl.select(b);
            int beca = 0;
            if (al.size() > 0) {
                if (al.get(0).getActivo()) {
                    beca = al.get(0).getId_beca();
                }
            }
            Becas bc = new Becas();
            bc.setId(beca);
            Becas_bl bcbl = new Becas_bl();
            ArrayList<Becas> ab = bcbl.select(bc);
            double desc = 0;
            if (ab.size() > 0) {
                desc = (ab.get(0).getPorcentaje());
                desc = desc / 100;
            }
            int cantidad = Integer.parseInt(txtCantidad.getValue().toString());
            Double total = (precioA - (precioA * desc)) * cantidad;
            lblPrecioAlm.setText(total.toString());
            total = (precioD - (precioD * desc)) * cantidad;
            lblPrecioDes.setText(total.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

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
            java.util.logging.Logger.getLogger(VentaTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentaTiquetes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnCosultarCed;
    private javax.swing.JComboBox cboTiposComida;
    private javax.swing.JLabel lblAlmuerzo;
    private javax.swing.JLabel lblBreakfast;
    private javax.swing.JLabel lblBuy;
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel lblCantTique;
    private javax.swing.JLabel lblCedPersona;
    private javax.swing.JLabel lblDesayuno;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblLunch;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioAlm;
    private javax.swing.JLabel lblPrecioDes;
    private javax.swing.JLabel lblSigno1;
    private javax.swing.JLabel lblSigno2;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblTipoComida;
    private javax.swing.JLabel lblTituloVT;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
