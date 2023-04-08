/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author carlos
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String id;
    private String genero;
    private String telefono;
    private String correo;
    private String salario;
    private String tipo;

    public Empleado(String nombre, int edad, String id, String genero, String telefono, String correo, String salario, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;
        this.tipo = tipo;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", genero=" + genero + ", telefono=" + telefono + ", correo=" + correo + ", salario=" + salario + ", tipo=" + tipo + '}';
    }
    
}
