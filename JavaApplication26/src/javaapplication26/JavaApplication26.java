/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication26 {
  
public static void main(String[] args) {
     
        int fib = Fibonacci(9);
        System.out.println("Serie de Fibonacci : "+fib);
        
    }
    public static  int Fibonacci(int n){
        int a=0, b=1, c;
         for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        
        return a;
        
    }
}