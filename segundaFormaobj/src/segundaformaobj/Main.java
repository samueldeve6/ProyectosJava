/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaformaobj;

/**
 *
 * @author Usuario
 */
public class Main {
    Productoo p1,p2,p3;
   
    public static void main(String[] args) {
        // TODO code application logic here
        Main n = new Main();
        n.empresa();
        
    }
    public void empresa(){
        p1 = new Productoo();
        p2 = new Productoo();
        p3 = new Productoo();
        
        
        p2.setNombre("queso");
        p3.setNombre("chocolate");
        
        
        p2.setCodigo(10);
        p3.setCodigo(1);
        
        
        p2.setCantidad(10);
        p3.setCantidad(2);
        
        
        System.out.println("El codigo es: "+p1.getCodigo());
        System.out.println("El nombre es: "+p1.getNombre());
        System.out.println("La cantidad es: "+p1.getCantidad());
        
        System.out.println("El codigo es: "+p2.getCodigo());
        System.out.println("El nombre es: "+p2.getNombre());
        System.out.println("La cantidad es: "+p2.getCantidad());
        
        System.out.println("El codigo es: "+p3.getCodigo());
        System.out.println("El nombre es: "+p3.getNombre());
        System.out.println("La cantidad es: "+p3.getCantidad());
        
    }
    
}
