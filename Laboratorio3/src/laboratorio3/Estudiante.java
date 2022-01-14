/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class Estudiante extends Persona {
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, int peso,
        String carnet, double promedioNotas, int numeroMaterias) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public double calcularPromedio(double promedioNs,int numMateria){
    double prom = 0.0;
    prom = promedioNs/numMateria;
    return(prom);
    }
    public void imprimirPromedio (String nombree, String apellidos, double promedioarit)
    {
    DecimalFormat df = new DecimalFormat("#.00");
    JOptionPane.showMessageDialog(null,"El promedio del estudiante " +nombree+" "+apellidos+" es: "+df.format(promedioarit));
    }
    
public Estudiante ingresarDatosEstudiante ()
{
Estudiante nuevoEstudiante = new Estudiante();
String nombre = "";
String apellido = "";
int edad = 0;
double peso = 0.0;
double nota = 0.0;
double acumulador = 0.0;
//Datos del estudiante
nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante");
numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias");
//Obtenemos las notas
for (int i=0;i<numeroMaterias;i++){
    nota = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nota de la materia"));
    acumulador+=nota;
}

//calculamos el promedio
promedioNotas = calcularPromedio(acumulador,numeroMaterias);
//Definimos los datos para el constructor
nuevoEstudiante.setNombre(nombre);
nuevoEstudiante.setApellido(apellido);
nuevoEstudiante.setEdad(edad);
nuevoEstudiante.setPeso(peso);
nuevoEstudiante.setCarnet(carnet);
nuevoEstudiante.setNumeroMaterias(numeroMaterias);
nuevoEstudiante.setPromedioNotas(promedioNotas);
//Retornamos el objeto
return (nuevoEstudiante);
}

public void imprimirReporteEstudiante()
{
//Usamos nuevamente la herencia para llamar los métodos
//que imprimen los datos del estudiante
imprimirDatosPersona();
//Ahora imprimimos los datos propios del estudiante
JOptionPane.showMessageDialog(null,"El carnet del estudiante es: " + carnet);
JOptionPane.showMessageDialog(null,"El numero de materias es: " + numeroMaterias);
//Asignación del promedio
imprimirPromedio(nombre, apellido, promedioNotas);
}    
}
