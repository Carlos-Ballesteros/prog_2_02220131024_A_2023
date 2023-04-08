/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

/**
 *
 * @author LabSispc02
 */
public class Inventario {
    private int cantidad;
    private double ingresos;

    public Inventario() {
    }

    public Inventario(int cantidad, double ingresos) {
        this.cantidad = cantidad;
        this.ingresos = ingresos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "cantidad=" + cantidad + ", ingresos=" + ingresos + '}';
    }
    
}
