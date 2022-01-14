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
public class Cuenta {

    // Propiedades.
    private double saldo;

    // Constructor.
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // Getters y Setters.
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Realiza un ingreso en la cuenta. Recibe la cantidad a ingresar.
    public synchronized void ingresar(double cantidad) {
        // Incremento el saldo.
        saldo += cantidad;
        // Duermo el hilo durante dos décimas de segundo 
        // para simular el ingreso.
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    // Realiza un cargo en la cuenta. Recibe la cantidad a cargar.
    public synchronized void cargar(double cantidad) {
        // Decremento el saldo.
        saldo -= cantidad;
        // Duermo el hilo durante dos décimas de segundo 
        // para simular el cargo.
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
