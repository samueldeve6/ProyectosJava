/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        pantalla();
    }
    public static void consola() {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero");
        num = entrada.nextInt();
        System.out.println("La variable que ingreso es"+num);
    }
    public static void pantalla(){
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"escriba un numero"));
        JOptionPane.showMessageDialog(null, "La variable ingresada es"+a);
}  
    public static void conversores(){
        String cadena="hola";
        int num1;
        double num2;
        num1 = 10;
        num2 = 5.2;
        num1 = (int)num2;
        String.valueOf(num1);
        cadena = Integer.toString(num1);
        System.out.println(num1);   
}       
   
    
}
