/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrorescaste;

import controlador.Controlador;
import modelo.Mascota;
import vista.Vista;

/**
 * @author Samuel Remolina Alvarez
 * @author Yeferson Guzman
 * @author Diego Jimenez
 */
public class CentroRescaste {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
       Mascota mod = new Mascota();
       Vista vie = new Vista();
       
       Controlador ctrl = new Controlador(vie, mod);
       ctrl.iniciarVista();
    }
    
}
