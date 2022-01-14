/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    serief();
    }
    public static void serief() {
          Scanner entrada = new Scanner (System.in);
        int n, f=0;
        int t1 = 1;
        int t2;
       
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        int i = 1;
        while (i <= n ){
            t2 = f;
            f = t1 + f;
            t1 = t2;
            i++;
            if(t1>n){break;
            }
            JOptionPane.showMessageDialog(null, t1);
        }   
    }
}


    
    

