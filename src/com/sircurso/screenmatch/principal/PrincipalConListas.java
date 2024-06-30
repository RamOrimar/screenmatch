package com.sircurso.screenmatch.principal;

import com.sircurso.screenmatch.models.Pelicula;
import com.sircurso.screenmatch.models.Serie;
import com.sircurso.screenmatch.models.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(9);

        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.evalua(10);

        Serie casaDragon = new Serie("La casa del dragon",2022);

        Pelicula p1 = peliculaDeBruno;

        List<Titulo> lista = new LinkedList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darian");
        listaDeArtistas.add("Hugh Jackman");

        System.out.println(listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada:" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de titulos:" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada en fechas:" + lista);


    }
}
