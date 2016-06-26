/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.utils;

import cr.ac.uia.SistemaGC.gui.SGCForm;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author crobles
 */
public class ValidarGUI {

    public static void validar(SGCForm form, javax.swing.JTextField txt) {
        try {
            if (!txt.getText().isEmpty()) {
                Integer.parseInt(txt.getText());
            }
        } catch (NumberFormatException | HeadlessException e) {
            txt.setText("");
            JOptionPane.showMessageDialog(form,
                    "Por favor ingrese unicamente números.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
