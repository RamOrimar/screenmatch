package com.sircurso.screenmatch.principal;

import com.sircurso.screenmatch.calculos.CalculadoraDeTiempo;
import com.sircurso.screenmatch.calculos.FiltroRecomendacion;
import com.sircurso.screenmatch.models.Episodio;
import com.sircurso.screenmatch.models.Pelicula;
import com.sircurso.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        //miPelicula.setNombre("Encanto");
        //miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon",2022);
//        casaDragon.setNombre("La casa del dragon");
//        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPortemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        //otraPelicula.setNombre("Matrix");
//        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);



        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);

        peliculaDeBruno.setDuracionEnMinutos(180);
//        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDepelicula = new ArrayList<>();
        listaDepelicula.add(peliculaDeBruno);
        listaDepelicula.add(miPelicula);
        listaDepelicula.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDepelicula.size());
        System.out.println("La primera pelicula es: " + listaDepelicula.get(0).getNombre());

        System.out.println(listaDepelicula);
        System.out.println("toString de la pelicula: " + listaDepelicula.get(0).toString());



    }
}
