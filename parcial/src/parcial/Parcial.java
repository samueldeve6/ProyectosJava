/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c,d,e,f,p=8;
        double x=1355.3456;
        System.out.print("5 ultimos digitos de la cedula");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        e = entrada.nextInt();
        f = entrada.nextInt();
        
        a<<=a+5;
        b= a & 5;
        System.out.printf("\n1 a = %d\n",a);
        System.out.printf("2 b = %d\n",b);
        p <<= f & e | 1;
        System.out.printf("3...%d\n",p);
        System.out.printf("4...%d\n",c++);
        System.out.printf("5...%x\n",b | c & f); 
        System.out.printf("6...%%%12.2f %d\n",x,e);
        d = (a | b & 10 | e);
        c <<= d; 
        System.out.printf("7...%d\n",c);
        
        
    }
    
}
