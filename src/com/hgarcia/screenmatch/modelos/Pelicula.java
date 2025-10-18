package com.hgarcia.screenmatch.modelos;

public class Pelicula {
    public String nombre;
    public int fechaDeLanzamiento;
    public int duracionEnMinutos;
    public boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    public void setSumaEvaluaciones(double sumaEvaluaciones) {
        this.sumaEvaluaciones = sumaEvaluaciones;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void setTotalEvaluaciones(int totalEvaluaciones) {
        this.totalEvaluaciones = totalEvaluaciones;
    }

    public void mostrarFichaTecnica() {
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    public void evaluar(double nota) {
        totalEvaluaciones++;
        sumaEvaluaciones += nota;
    }

    public double calcularMediaEvaluaciones() {
        return sumaEvaluaciones / totalEvaluaciones;
    }
}