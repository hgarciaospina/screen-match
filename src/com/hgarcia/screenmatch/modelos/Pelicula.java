package com.hgarcia.screenmatch.modelos;

import com.hgarcia.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getClasificacion() {
        return (int) (calcularMediaEvaluaciones() / 2);
    }
}