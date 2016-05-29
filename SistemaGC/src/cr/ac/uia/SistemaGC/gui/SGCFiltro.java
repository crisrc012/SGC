/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author crobles
 */
public class SGCFiltro {

    private TableRowSorter tblRS;
    
    public void Filtrar(JTextField txt, JTable table) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                txt.setText(txt.getText());
                table.repaint();
                tblRS.setRowFilter(RowFilter.regexFilter(txt.getText(), 1));
            }
        });
        tblRS = new TableRowSorter(table.getModel());
        table.setRowSorter(tblRS);
    }

}
