/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
        int n, f=0;
        int t1 = 1;
        int t2;
         int aux=0;
        System.out.println("¿Cuantos numeros desea generar?");
        n = entrada.nextInt();
        System.out.println("Digite un numero entero");
        int l = entrada.nextInt();
        int i = 1;
        while (i <= n ){
            t2 = f;
            f = t1 + f;
            t1 = t2;
            i++;
            System.out.println(t1);
            if (l >= t1){
              aux = t1;
            }
        }
        System.out.println("El fibonacci más cercano a su numero entero es: "+aux);

    }
}
