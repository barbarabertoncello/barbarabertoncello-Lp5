/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author u04863235100
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {

            if (vetComp[i] instanceof JTextField) {
                JTextField comp = (JTextField) vetComp[i];
                comp.setText("");
            }
            if (vetComp[i] instanceof JComboBox) {
                JComboBox comp = (JComboBox) vetComp[i];
                comp.setSelectedIndex(-1);
            }
            if (vetComp[i] instanceof JCheckBox) {
                JCheckBox comp = (JCheckBox) vetComp[i];
                comp.setSelected(false);
            }
            if (vetComp[i] instanceof JPasswordField) {
                JPasswordField comp = (JPasswordField) vetComp[i];
                comp.setText("");
            }
            if (vetComp[i] instanceof JTextPane) {
                JTextPane comp = (JTextPane) vetComp[i];
                comp.setText("");
            }
        }
    }

    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean perguntar(String mensagem) {
        return true;
    }

    public static int strInt(String cad) {
        return Integer.valueOf(cad);
    }

    public static String intStr(int num) {
        return "";
    }

    public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }

    public static String doubleStr(double num) {
        return "";
    }

    public static Date strDate(String cad) {
        return null;
    }

    public static String dateStr(Date data) {
        return "";
    }

}
