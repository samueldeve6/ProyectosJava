/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesconbinarios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionesConBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       String bin1="";
       String bin2="";
       System.out.print("Ingrese un numero binario: ");
       bin1=entrada.next();
       System.out.print("Ingrese un numero binario: ");
       bin2=entrada.next();    
       System.out.print("Su resultado es "+Operacion(bin1,bin2));
    }   
 public static String Operacion(String bin1,String bin2){
     int x1=Integer.parseInt(bin1,2);
     int x2=Integer.parseInt(bin2,2);
     int y=x1+x2;
     String resultado=Integer.toString(y,2);
     return resultado;
    }
}

