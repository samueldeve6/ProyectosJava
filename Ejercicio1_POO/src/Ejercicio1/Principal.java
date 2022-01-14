
package Ejercicio1;

import javax.swing.JOptionPane;


public class Principal {
    public static void main (String[]args){
    Cuadrilatero c1;
    float l1,l2;
    l1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1"));
    l2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2"));
    if (l1 == l2)//es un cuadrado
    {
        c1 = new Cuadrilatero(l1);
    }
    else{
        c1 = new Cuadrilatero(l1,l2);
    }
    System.out.println("El perimetro es: "+c1.getPerimetro());
    System.out.println("El area es: "+c1.getArea());
    }
}
