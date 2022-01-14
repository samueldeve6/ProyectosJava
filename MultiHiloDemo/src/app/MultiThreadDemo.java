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
class MultiThreadDemo {
  public static void main(String args[]) {
    new NewThread("Uno"); // comienzan los hilos
    new NewThread("Dos");
    new NewThread("Tres");
    try {
      // espera un tiempo para que terminen los otros hilos
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Interrupci�n del hilo principal");
    }
    System.out.println("Sale del hilo principal.");
  }
}
