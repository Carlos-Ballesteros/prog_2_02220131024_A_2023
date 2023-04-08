/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author xcarl
 */
public class Cliente {
    String nombre;
    int edad;
    String id;
    String compras;
    String genero;
    String telefono;
    String correo;
    
    public Cliente() {
    }
    public Cliente(String nombre, int edad, String id, String compras, String genero, String telefono, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.compras = compras;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", compras=" + compras + ", genero=" + genero + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
}
