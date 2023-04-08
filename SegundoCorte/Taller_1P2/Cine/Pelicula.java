/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

import java.util.Date;

/**
 *
 * @author LabSispc02
 */
public class Pelicula {
    private String nombre;
    private String genero;
    private String funcion;
    private Date fechaEstreno;
    private String sinopsis;
    private String director;
    private String actores;

    public Pelicula(String nombre, String genero, String funcion, Date fechaEstreno, String sinopsis, String director, String actores) {
        this.nombre = nombre;
        this.genero = genero;
        this.funcion = funcion;
        this.fechaEstreno = fechaEstreno;
        this.sinopsis = sinopsis;
        this.director = director;
        this.actores = actores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", funcion=" + funcion + ", fechaEstreno=" + fechaEstreno + ", sinopsis=" + sinopsis + ", director=" + director + ", actores=" + actores + '}';
    }
    
}
