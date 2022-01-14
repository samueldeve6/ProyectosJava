/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int a;
    int b;
    System.out.print("ingrese el primer numero : ");
    a=teclado.nextInt();
    System.out.print("ingrese el segundo numero : ");
    b=teclado.nextInt();
    if(a==b)
      System.out.print("son numeros iguales");
    if(a>b)
        System.out.print("el numero mayor es : "+a);
    if(b>a)   
        System.out.print("el numero mayor es : "+b);
    }
    
}
