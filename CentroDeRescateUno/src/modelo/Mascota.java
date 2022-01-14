/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Mascota {
    private String tipo;
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private String toxoplasmosis;

    public Mascota() {
    }

    public Mascota(String tipo, String nombre, String raza, String color, int edad, String toxoplasmosis) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    
}
