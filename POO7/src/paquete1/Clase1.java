//Encapsulamiento y métodos accesores (Setters y Getters)
package paquete1;

public class Clase1 {
    private int edad;
    private String nombre;
    //Método Setter: Establecemos la edad
    public void setEdad(int edad){
     this.edad = edad;
    }
    //Método Getter: Mostramos la edad
    public int getEdad(){
     return edad;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
