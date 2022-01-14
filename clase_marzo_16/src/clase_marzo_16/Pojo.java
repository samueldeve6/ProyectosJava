/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_marzo_16;

/**
 *
 * @author Usuario
 */
public class Pojo {

    public Pojo() {
    }

    public Pojo(String tipoInst, double costo, int cantidad) {
        this.tipoInst = tipoInst;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    public Pojo(String tipoInst) {
        this.tipoInst = tipoInst;
        this.costo = 0;
        this.cantidad = 0;
    }

    public String getTipoInst() {
        return tipoInst;
    }

    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
 

  

    
     
    private String tipoInst;
    private double costo ;
    private int cantidad;

   
}
