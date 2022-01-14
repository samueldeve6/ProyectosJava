
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int monto = Integer.parseInt((JOptionPane.showInputDialog("Digite el monto:")));
         int x=1;
         while(x<7){
         float pagar =monto-(monto * (float)0.1);
         int ppagar =(int)pagar;
         monto = ppagar;
         
         if(x == 6) {
             System.out.println("El total a pagar en el mes 6:"+monto); 
         }
         x++;
                  }  
         
    }
}
