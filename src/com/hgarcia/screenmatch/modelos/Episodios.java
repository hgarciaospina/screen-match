package com.hgarcia.screenmatch.modelos;

import com.hgarcia.screenmatch.calculos.Clasificacion;

public class Episodios implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    @Override
    public double getClasificacion() {
        if(totalVisualizaciones >= 5000) {
            return 5;
        } else {
            if(totalVisualizaciones >= 4000)  {
                return 4;

            } else {
                if(totalVisualizaciones >= 3000){
                    return 3;
                } else {
                    if(totalVisualizaciones >= 2000){
                        return 2;
                    } else {
                        return 1;
                    }
                }
            }
        }
    }
}
