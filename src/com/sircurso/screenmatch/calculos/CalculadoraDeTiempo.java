package com.sircurso.screenmatch.calculos;

import com.sircurso.screenmatch.models.Pelicula;
import com.sircurso.screenmatch.models.Serie;
import com.sircurso.screenmatch.models.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
//        System.out.println("Agregando duracion n minutos de " + titulo);
         this.tiempoTotal += titulo.getDuracionEnMinutos();

    }
    
}
