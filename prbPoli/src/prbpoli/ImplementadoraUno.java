/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prbpoli;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ImplementadoraUno implements IImpresion {

    @Override
    public void imprime() {
         JOptionPane.showMessageDialog(null,"Comportamiento implementadora 1");
    }
    
}
