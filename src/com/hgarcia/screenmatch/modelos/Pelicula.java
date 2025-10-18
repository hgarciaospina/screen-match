package com.hgarcia.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

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