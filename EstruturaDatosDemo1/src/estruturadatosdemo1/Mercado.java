/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadatosdemo1;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Usuario
 */
public class Mercado {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Se definen 5 instancias con el constructor de la clase Producto.
Producto gaseosa = new Producto("gaseosa", 6); 
Producto paquetes = new Producto("paquetes", 2);
Producto manzanas = new Producto("manzanas", 5); 
Producto lentejas = new Producto("lentejas", 2); 
Producto aceite = new Producto("aceite", 2); 

// Definir un ArrayList llamado lista
ArrayList lista = new ArrayList(); 

// Agregamos estas instancias al ArrayList con el mÃ©todo add 
lista.add(gaseosa); 
lista.add(paquetes); 
lista.add(manzanas); 
lista.add(lentejas); 
// Las listas inician en 0 (Cero) 
// Indica el Ã­ndice de inserciÃ³n 
lista.add(1, aceite); 
lista.add(aceite); 
// Mostramos el nÃºmero de objetos de la colecciÃ³n mediante el mÃ©todo size.
System.out.println(" Lista del mercado con " + lista.size() + 
" productos"); 

// Se declara una instancia Iterator it la cual facilita recorrer los objetos, para extraer e imprimir sus valores 
Iterator it = lista.iterator();
//verifica si existe otro elemento con el mÃ©todo hasNext()
while ( it.hasNext() ) { 
Object objeto = it.next(); 
Producto producto = (Producto)objeto; 
System.out.println(producto); 
} 

// Eliminar elemento de ArrayList. Se elimina el objeto con Ã­ndice 2 con el mÃ©todo remove. Se muestra la nueva lista.
lista.remove(2); 
System.out.println(" Lista del mercado con " + lista.size() + " productos"); 

// Definir Iterator para extraer e imprimir valores 
Iterator it2 = lista.iterator(); 
while ( it2.hasNext() ) { 
Producto producto = (Producto)it2.next(); 
System.out.println(producto); 
} 

// Eliminar todos los valores del ArrayList, Se eliminan todos los objetos mediante el mÃ©todo clear. 
lista.clear(); 
System.out.println(" Lista del mercado con " + lista.size() +" productos"); 
} 
}    
