
package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division; 
    //Métodos
    
    //Método para pedirle al usuario que nos digite 2 números
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }
    //Método para sumar ambos numeros
    public void sumar(){
        suma = numero1 + numero2;
    }
    //Método para restar ambos numeros
    public void restar(){
       resta = numero1 - numero2;
    }    
    //Método para multiplicar ambos numeros
    public void multiplicar(){
     multiplicacion = numero1*numero2;
    }
    //Método para dividir ambos numeros
    public void dividir(){
     division = numero1/numero2;
    }
    public void mostrarResultados(){
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicacion es: "+multiplicacion);
    System.out.println("La division es: "+division);
    
    }
}
