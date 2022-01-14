/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 * 
 * @author Usuario
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 054;
        int b = 0xab;
        char c = '$';
        int d = 150;
        int e = 20;
        int f = 50;
        int g = 16; 
        int r;
        char r1;
        a*=b+=f-=20;
        r = a ^ b;
        System.out.printf("%d %d %d",a,b,f);
        
        
        r <<= 2;
        System.out.println("Respuesta 2 = "+r);
        e++;
        System.out.println("Respuesta 3 = "+e);
        e--;
        
        System.out.println("Respuesta 3 = "+e);
        g = ~g;
        
        r1 = (char)((g | e & f)<<2);
        System.out.printf("Respuesta 4 %c = ",r1);
    }
    
}
