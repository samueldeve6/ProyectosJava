/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import javax.swing.JOptionPane;

public class Calculadora1 {
	
	public static void main(String[] args) {
		//Instanciación
		ObjetoCalculadora calculadora = new ObjetoCalculadora();	
		//Se asignan valores a los atributos de la clase
		
	        calculadora.setNumero1(Float.parseFloat(JOptionPane.showInputDialog("Digite el Numero 1")));
	        calculadora.setNumero2(Float.parseFloat(JOptionPane.showInputDialog("Digite el Numero 2")));  
              
		//Se ejecutan las operaciones
		//Suma
                calculadora.setResultado(calculadora.calcularSuma(calculadora.getNumero1(), calculadora.getNumero2()));
		imprimir(calculadora.getResultado());
		//Resta
		calculadora.setResultado(calculadora.calcularResta(calculadora.getNumero1(), calculadora.getNumero2()));
		imprimir(calculadora.getResultado());
		//Multiplicacion
		calculadora.setResultado(calculadora.calcularMultiplicacion(calculadora.getNumero1(), calculadora.getNumero2()));
		imprimir(calculadora.getResultado());
		//División
		calculadora.setResultado(calculadora.calcularDivision(calculadora.getNumero1(), calculadora.getNumero2()));
		imprimir(calculadora.getResultado());

	}
         public static void imprimir(float resultado) {
        JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
    }
    }


