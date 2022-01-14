/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alumnos;
        float cal1,cal2,cal3;
        float acumulador=0;
        System.out.println("Digite el numero de alumnos");
        alumnos = entrada.nextInt();
        int aux = alumnos; 
        while (alumnos > 0 ) {  
        System.out.println("Digite la nota 1");
        cal1 = entrada.nextInt();
        System.out.println("Digite la nota 2");
        cal2 = entrada.nextInt();
        System.out.println("Digite la nota 3 ");
        cal3 = entrada.nextInt();
        float promedioI =(cal1+cal2+cal3)/3; 
        
        System.out.println("El promedio del estudiante es: "+promedioI); 
        alumnos--;
        acumulador += promedioI;
        
        
    }
       float promediog = acumulador/aux;
       System.out.println("El promedio de los estudiantes es: "+promediog); 
       System.out.println("fin");
    }
     
}
