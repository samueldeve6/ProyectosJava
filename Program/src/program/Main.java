/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.Scanner;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=0,i=0,validaciones=0;
        String cadena="";
        validaciones = input.nextInt();
        for(i=0;i<validaciones;i++){
        a = input.nextInt();
        b = input.nextInt();
        cadena += metodo(a,b);
        }
        for(i=0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }
    }
    public static String metodo(int a, int b){
        if(a<b){
          return "<";
        }
        if(b<a){
          return ">";
        }
        if(a==b){
           return "=";
        }
        return null;
        }
}
