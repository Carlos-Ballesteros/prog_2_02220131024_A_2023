/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

/**
 *
 * @author LabSispc02
 */
public class Boleto {
    private String comprador;
    private String sala;
    private String asiento;
    private String funcion;
    private double precio;

    public Boleto(String comprador, String sala, String asiento, String funcion, double precio) {
        this.comprador = comprador;
        this.sala = sala;
        this.asiento = asiento;
        this.funcion = funcion;
        this.precio = precio;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Boleto{" + "comprador=" + comprador + ", sala=" + sala + ", asiento=" + asiento + ", funcion=" + funcion + ", precio=" + precio + '}';
    }
    
    
}
