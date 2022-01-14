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
public class HiloCliente implements Runnable{
    Cuenta cuenta;
    int cantidad;

    public HiloCliente(Cuenta cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        /* Forzamos la maquinaria: repetimos
        la operación muchísimas veces para
        intentar verificar si la simulación es
        correcta
        */
        for (int i=0; i<100; i++){
            cuenta.hacerMovimiento(cantidad);
        }
    }
}
