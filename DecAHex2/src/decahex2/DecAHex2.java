/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decahex2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DecAHex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada=new Scanner (System.in);
      System.out.print("Ingrese un decimal: ");//solicita decimal
      int n = entrada.nextInt();//lee decimal
      int residuo;
      String resultado="";
      char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
      while (n>0){
          residuo=n%16;
          resultado=hex[residuo]+resultado; 
          n = n/16;
      }
      System.out.println(resultado);
    }
    
}
