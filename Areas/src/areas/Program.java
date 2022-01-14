/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
    
}