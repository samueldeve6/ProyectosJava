/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prbpoli;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class PrbPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*IImpresion obj = new ImplementadoraUno();
        obj.imprime();*/
        ImplementacionAbstractaUno a = new ImplementacionAbstractaUno();
        a.imprime();
    }
    
}
