
package Ejercicio1;

public class Cuadrilatero {
    //Atributos
    private float l1,l2;
    //Metodos
    //Método constructor 1 (Cuadrilatero)
    public Cuadrilatero(float l1, float l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
    //Método constructor 2 (Cuadrado)
    public Cuadrilatero(float l1) {
        this.l1 = this.l2 = l1;
    }
    public float getPerimetro(){
    float perimetro = 2 * (l1+l2);
    return perimetro;
    }
    public float getArea(){
    float area = (l1*l2);
    return area;
    }
}
