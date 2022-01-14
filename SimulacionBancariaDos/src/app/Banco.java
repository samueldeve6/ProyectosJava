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
public class Banco implements Runnable {

    // Propiedades.
    private Cuenta cuenta;
    
    // Constructor. Recibe la cuenta manejada.
    public Banco(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public void run() {
        // Realizo 10 cargos de 5 euros
        for (int i = 0; i < 10; i++) {
            cuenta.cargar(5);
        }
    }

}
