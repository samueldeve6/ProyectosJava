/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author Usuario
 */
/*Clase que define las características de un objeto 
 *que denominaremos Hilos e imprime el nombre y tiempo de espera
 *demostrando que no se ejecutan secuencialmente.  
*/

public class Hilos extends Thread  {

	private String nombre;
	private int retardo;
	
	
	// Constructor sobrecargado para inicializar el nombre del hilo y tiempo de retardo
	public Hilos( String s,int d ) {
		nombre = s;
		retardo = d;
	}

	// El metodo run() ejecuta
	// threads. Cuando run() termina el thread muere

	public void run() {

		// Con el método sleep retrasamos la ejecución el tiempo especificado
		try {
			sleep( retardo );
		} catch( InterruptedException e ) {
		}

		// Imprimimos el nombre y tiempo que hemos retardado el hilo
		
		System.out.println( "Prueba Hilos: "+nombre+" "+retardo);
	}
}

