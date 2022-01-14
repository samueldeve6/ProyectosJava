/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorand;

/**
 * && AND "A y B"
 * || OR "A o B"
 * | OR inclusivo si ambos o Alguno de los dos son true devuelve true,si ninguno es true devuelve(false)
 * ! NOT "Invierte estado"
 * ^ XOR "A o B pero no ambos"
 */
public class OperadorAnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
       boolean b;
       a = 10;
       b = true;
       if ((a == 10) || (b == true))  System.out.println("Éxito");
    }
    
}
