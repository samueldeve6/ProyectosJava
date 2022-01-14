/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        notasmusicales();
    }
    public static void notasmusicales(){
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if (num>0&&num<8){     
        switch(num){
            case 1: JOptionPane.showMessageDialog(null,"Do");
            break;
            case 2: JOptionPane.showMessageDialog(null,"Re");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Mi");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Fa");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Sol");
            break;
            case 6: JOptionPane.showMessageDialog(null,"La");
            break;
            case 7: JOptionPane.showMessageDialog(null,"Si");
            break;
                 }
         } 
    }
}
