package com.sircurso.screenmatch.models;

import com.sircurso.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    ///Para ser heredada la clase se ocupa *Extends* al inicio de creacion de la clase

    private String director;


    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() /2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }


}
