/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

/**
 *
 * @author Nixon12
 */
public class Caja {
    
    private double dinero;
    private int numCaja;
    private int transacciones;
    
    private void Caja(){
    }
    public Caja(double dinero, int numCaja, int transacciones) {
        this.dinero = dinero;
        this.numCaja = numCaja;
        this.transacciones = transacciones;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }
    
        public String toString() {
        return "Carro{" + "modelo=" + dinero + ", marca=" + numCaja + ", nombre=" + transacciones + '}';
    }
    
}
