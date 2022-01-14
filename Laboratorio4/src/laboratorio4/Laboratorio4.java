/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author Usuario
 */
public class Laboratorio4 {
    
   public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro burrito = new Burro();
        hacerCantar(burrito);
    } 
    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}
