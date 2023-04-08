/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author carlos
 */
public class Establecimineto {
    private String direccion;
    private int Area;

    public Establecimineto(String direccion, int Area) {
        this.direccion = direccion;
        this.Area = Area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    @Override
    public String toString() {
        return "Establecimineto{" + "direccion=" + direccion + ", Area=" + Area + '}';
    }
    
}
