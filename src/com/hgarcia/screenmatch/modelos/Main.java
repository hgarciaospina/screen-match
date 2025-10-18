package com.hgarcia.screenmatch.modelos;

public class Main {
    public static void main(String[] args) {

       Pelicula miPelicula1 = new Pelicula();
       System.out.println("*******************************************************");
       miPelicula1.nombre = "Encanto";
       miPelicula1.fechaDeLanzamiento = 2021;
       miPelicula1.duracionEnMinutos = 120;

       miPelicula1.mostrarFichaTecnica();

       miPelicula1.evaluar(7.80);
       miPelicula1.evaluar(8.00);
       miPelicula1.evaluar(9.50);

       System.out.println("*******************************************************");
       System.out.printf("Cantidad evaluaciones hechas por el público: %10.2f%n", (float)miPelicula1.getTotalEvaluaciones());
       System.out.printf("Suma evaluaciones hechas por el público    : %10.2f%n", miPelicula1.getSumaEvaluaciones());
       System.out.printf("Cálculo de la media de las evaluaciones    : %10.2f%n", miPelicula1.calcularMediaEvaluaciones());
       System.out.println("*******************************************************");
    }
}