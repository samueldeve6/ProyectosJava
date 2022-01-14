/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;                
        System.out.println("Digite un numero");
        num = entrada.nextInt();
        if (num>0){
            System.out.println("El numero es Positivo");
            if (num % 2 == 0){
                System.out.println("El numero es Par");
            }
            if(num % 2 == 1){
                System.out.println("El numero es Impar");
            }
        }
        else {
            System.out.println("El numero es Negativo");
            if (num % 2 == 0){
                System.out.println("El numero es Par");
            }
            else{
                System.out.println("El numero es Impar");
            }   
        }
    }   
}
