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
public class Modelo {
    String mensaje;
    String encriptado;

    public Modelo() {
    }

    public Modelo(String mensaje, String encriptado) {
        this.mensaje = mensaje;
        this.encriptado = encriptado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEncriptado() {
        return encriptado;
    }

    public void setEncriptado(String encriptado) {
        this.encriptado = encriptado;
    }
    
    
}
