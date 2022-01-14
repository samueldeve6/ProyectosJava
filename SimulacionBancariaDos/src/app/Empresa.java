/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Usuario
 */
public class Empresa implements Runnable {

    // Propiedades.
    private Cuenta cuenta;
    
    // Constructor
    public Empresa(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public void run() {
        // Realizo 10 ingresos de 10 euros.
        for (int i = 0; i < 10; i++) {
            cuenta.ingresar(10);
        }
    }

}