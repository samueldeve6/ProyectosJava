/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float participación, primerExamen,  segundoExamen,Examenfinal, notaFinal;
    System.out.print("Digite la nota de participación del estudiante:");
    participación = entrada.nextFloat();
    System.out.print("Digite la nota del primer examen parcial");
    primerExamen = entrada.nextFloat ();
    System.out.print ("Digite la nota del segundo examen");
    segundoExamen = entrada.nextFloat();
    System.out.print ("Digite la nota del examen final");
    Examenfinal = entrada.nextFloat();
    
    participación *=0.10f;
    primerExamen *=0.25f;
    segundoExamen *=0.25f;
    Examenfinal *=0.40f;
    
    notaFinal = participación + primerExamen + segundoExamen + Examenfinal;
    System.out.println("\n La nota final es:"+notaFinal);
    }
    
}
