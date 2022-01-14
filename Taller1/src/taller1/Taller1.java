/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sumar();
    }
    public static void sumar() {
        int suma,resta;
        int residuo;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        int num1=entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        int num2=entrada2.nextInt();
        suma = num1+num2;
        resta =num1-num2;
        residuo=num1%num2;
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La residuo es: "+residuo);
        
    }
}
