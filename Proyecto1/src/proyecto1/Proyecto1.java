/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Proyecto1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int numero1,numero2;
    
     numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
   
     numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
  
    if(numero1>numero2){ 
        JOptionPane.showMessageDialog(null,"el "+numero1+" es el mayor de los dos") ;
         }
    if(numero2>numero1){ 
        JOptionPane.showMessageDialog(null,"el "+numero2+" es el mayor de los dos") ;
    }
    if(numero1==numero2){ 
        JOptionPane.showMessageDialog(null,"El numero "+numero1+" es igual que "+numero2+"");
        
    }
    else{ 
        JOptionPane.showMessageDialog(null,"El numero "+numero1+" no es igual que "+numero2+"");
    }
    }
    
}
