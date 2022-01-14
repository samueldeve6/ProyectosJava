/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ObjetoCalculadora {
    //el constructor llama por defecto al constructor de la clase superior a través de una llamada a super() 
      public ObjetoCalculadora() {
          super();
    }

    public ObjetoCalculadora(float numero1, float numero2, float resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = 0;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        //this.numero1 = numero1;
        if(numero1>0){
             this.numero1 = numero1;
        }
        else{
            JOptionPane.showMessageDialog(null,"Por favor digite un numero mayor a cero");
            setNumero1(Float.parseFloat(JOptionPane.showInputDialog("Digite el Numero 1"))); 
        }
            
    }
    public float getNumero2() {
        return numero2;
    }
    public void setNumero2(float numero2) {
        //this.numero2 = numero2;
        
        if(numero2>0){
              this.numero2 = numero2;
        }
        else{
            JOptionPane.showMessageDialog(null,"Por favor digite un numero mayor a cero");
            setNumero2(Float.parseFloat(JOptionPane.showInputDialog("Digite el Numero 2"))); 
        }
    }
  public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
        
    }
    //metodos suma,resta,multiplicacion,division
    public float calcularSuma (float numero1,float numero2)
	{
		resultado = 0;
		resultado = numero1 + numero2;
		return (resultado);
	}
    public float calcularResta (float numero1,float numero2)
	{
		resultado = 0;
		resultado = numero1 - numero2;
		return (resultado);
	}
	public float calcularMultiplicacion (float numero1,float numero2)
	{
		resultado = 0;
		resultado = numero1 * numero2;
		return (resultado);
	}
	public float calcularDivision (float numero1,float numero2)
	{
		resultado = 0;
		if (numero2 != 0)
		{
			resultado = numero1 / numero2;
		}
		return (resultado);
	}
    private float numero1;
    private float numero2;
    private float resultado;
    
}
