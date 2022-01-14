/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paresimpares();
    }
    public static void paresimpares(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if(num%2==0){
            JOptionPane.showMessageDialog(null, "Es par");
            System.out.println("Es par");
        }
        else{
            JOptionPane.showMessageDialog(null, "Es impar");
        }
    } 
    
}
