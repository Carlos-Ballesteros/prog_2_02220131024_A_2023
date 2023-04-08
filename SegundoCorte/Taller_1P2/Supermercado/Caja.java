/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author carlos
 */
public class Caja {
    private double dinero;
    private int numeroCaja;
    private int transacciones;

    public Caja(double dinero, int numeroCaja, int transacciones) {
        this.dinero = dinero;
        this.numeroCaja = numeroCaja;
        this.transacciones = transacciones;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Caja{" + "dinero=" + dinero + ", numeroCaja=" + numeroCaja + ", transacciones=" + transacciones + '}';
    }
    
}
