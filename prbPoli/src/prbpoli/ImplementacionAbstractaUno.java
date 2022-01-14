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
public class ImplementacionAbstractaUno extends ImpresionAbstracta{

    @Override
    public void imprime() {
        JOptionPane.showMessageDialog(null,"Comportamiento implementadora de la clase abstracta");
    }
    
}
