/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_marzo_16;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Main gato = new Main();
        gato.pruebaPojo();
    }
    public static void pruebaPojo() {
       for(int i =0;i<10;i++){
           new Pojo("viento", 15, i);
       }
       Pojo p1 = new Pojo();
    System.out.println(""+p1);
        
    }
    
}
