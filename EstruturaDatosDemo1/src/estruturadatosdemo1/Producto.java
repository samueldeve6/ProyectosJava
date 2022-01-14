/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadatosdemo1;

/**
 *
 * @author Usuario
 */
public class Producto {
private String nombre; 
private int cantidad; 

//constructor de la clase producto

public Producto(String s, int i) { 
nombre = s; 
cantidad = i; 
                                 } 
//mÃ©todo de la clase object
public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
} 

//mÃ©todos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 
}
