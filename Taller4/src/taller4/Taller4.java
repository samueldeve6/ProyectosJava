/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        numeros();
    }
    public static void numeros() {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        for (int x=0;x<=num;x++){
            JOptionPane.showMessageDialog(null, x);
        }      
    }
}
