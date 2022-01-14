/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,mod,decimal;
        String bin="";
    Scanner entrada = new Scanner (System.in);
    System.out.print("digite un numero: ");
    num = entrada.nextInt();
    decimal = num;
    while(num>0){
        mod = (num%2); 
        bin = mod + bin;
        num = num/2;
        
    }
    System.out.print("El numero "+decimal+" es en binario: "+bin);
    
      
       
}
}