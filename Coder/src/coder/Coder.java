/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder;

import coder.vista.Vista;

/**
 *
 * @author Samuel Remolina Alvarez
 *         Javier Andres Ramirez Sabaleta 
 *         Jeisson David Infante Leal
 *         Paula Camila Enriquez Galindo
 */
public class Coder {

    public static void main(String[] args) {
        iniciarVista();
    }
    
    public static void iniciarVista(){
        Vista vista = new Vista();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
       
    }
    
}
