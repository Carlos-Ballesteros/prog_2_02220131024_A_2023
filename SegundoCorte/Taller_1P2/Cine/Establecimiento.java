/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

/**
 *
 * @author LabSispc02
 */
public class Establecimiento {
    private String direccion;
    private int tamaño;

    public Establecimiento(String direccion, int tamaño) {
        this.direccion = direccion;
        this.tamaño = tamaño;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Establecimiento{" + "direccion=" + direccion + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
