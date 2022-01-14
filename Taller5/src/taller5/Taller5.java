/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        incremento();
    }
    public static void incremento() {
         int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        for (int i=0;i<=num;i=i+3){
            JOptionPane.showMessageDialog(null, i);
            
        }
    }
    
}
