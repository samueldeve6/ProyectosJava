/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaformaobj;


public class Productoo {

    public Productoo() {
        //Constructor normal o por defecto
        this.nombre="";
        this.cantidad=0;
        this.codigo=0;   
    }
     //Constructor SOBRECARGADO

    public Productoo(String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    
    private int codigo;
    private String nombre;
    private int cantidad;
    //Metodos de encapsulamiento, set= establecer , get = obtener 
    public void setCodigo(int codigo){
        this.codigo=codigo;
        
    }
    public int getCodigo(){
        return this.codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
