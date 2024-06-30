package com.sircurso.screenmatch.models;

import com.google.gson.annotations.SerializedName;
import com.sircurso.screenmatch.exception.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;

    private boolean incluidoEnelPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDelasEvaluaciones;

// CONSTRUCTOR

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmbd miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("Noo pude convertir la duracion," +
                    "porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));
    }


//******************************************

    public String getNombre() {
        return nombre;
    }
    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
    public boolean isIncluidoEnelPlan() {
        return incluidoEnelPlan;
    }

    // OBTENCION DE DATOS CON UN METODO DE SET (Ya que son variables privadas se genera un metodo para no alterar el dato)

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public void setIncluidoEnelPlan(boolean incluidoEnelPlan) {
        this.incluidoEnelPlan = incluidoEnelPlan;
    }
// *************************************************************

    public int getTotalDelasEvaluaciones(){
        return totalDelasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos() + " min");
    }
    public void evalua (double nota){
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;

    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDelasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion="+duracionEnMinutos+") ";
    }
}
