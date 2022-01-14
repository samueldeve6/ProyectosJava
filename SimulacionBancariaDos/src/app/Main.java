/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
	// Creo una nueva cuenta con un saldo inicial de 100 euros.
	Cuenta	cuenta = new Cuenta(100);
	SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
	System.out.printf("%s -> Saldo inicial: %f\n", 
			  formateador.format(new Date()), cuenta.getSaldo());		
	// Creo un nuevo hilo para una nueva empresa.
	Thread hiloEmpresa = new Thread(new Empresa(cuenta));
	hiloEmpresa.start();
	// Creo un nuevo hilo para un nuevo banco.
	Thread hiloBanco = new Thread(new Banco(cuenta));
	hiloBanco.start();
	try {
	    // Espero la finalización de los hilos.
	    hiloEmpresa.join();
	    hiloBanco.join();
	    // Muestro el saldo final.
	    System.out.printf("%s -> Saldo final: %f\n", 
	                      formateador.format(new Date()), cuenta.getSaldo());
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
	
}
