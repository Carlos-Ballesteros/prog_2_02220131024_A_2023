/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.Date;

/**
 *
 * @author xcarl
 */
public class Producto {
    int codigo;
    String nombre;
    double precio;
    String marca;
    Date fechaVencimineto;

    public Producto(int codigo, String nombre, double precio, String marca, Date fechaVencimineto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaVencimineto = fechaVencimineto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaVencimineto() {
        return fechaVencimineto;
    }

    public void setFechaVencimineto(Date fechaVencimineto) {
        this.fechaVencimineto = fechaVencimineto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", fechaVencimineto=" + fechaVencimineto + '}';
    }
    
    
            
}
