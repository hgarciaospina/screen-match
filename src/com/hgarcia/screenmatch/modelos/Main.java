package com.hgarcia.screenmatch.modelos;

import com.hgarcia.screenmatch.calculos.CalculadoraDeTiempo;

public class Main {
    public static void main(String[] args) {

       /* Objetos de Peliculas */

       Pelicula miPelicula1 = new Pelicula();
       System.out.println("*******************************************************");
       miPelicula1.setNombre("Encanto");
       miPelicula1.setFechaDeLanzamiento(2021);
       miPelicula1.setDuracionEnMinutos(120);
       miPelicula1.setIncluidoEnElPlan(true);
       String seIncluyeEnElPlan = miPelicula1.isIncluidoEnElPlan() ? "Incluida en el plan" : "No incluída en el plan";
       miPelicula1.mostrarFichaTecnica();
       System.out.println(seIncluyeEnElPlan);

       miPelicula1.evaluar(7.80);
       miPelicula1.evaluar(8.00);
       miPelicula1.evaluar(9.50);

       System.out.println("*******************************************************");
       System.out.printf("Cantidad evaluaciones hechas por el público: %10.2f%n", (float)miPelicula1.getTotalEvaluaciones());
       System.out.printf("Suma evaluaciones hechas por el público    : %10.2f%n", miPelicula1.getSumaEvaluaciones());
       System.out.printf("Cálculo de la media de las evaluaciones    : %10.2f%n", miPelicula1.calcularMediaEvaluaciones());
       System.out.println("******************************************************* \n");

       Pelicula miPelicula2 = new Pelicula();
       miPelicula2.setNombre("Matriz");
       miPelicula2.setFechaDeLanzamiento(1998);
       miPelicula2.setDuracionEnMinutos(180);
       miPelicula2.mostrarFichaTecnica();


   /* Objetos de Series */

       Serie casaDragon = new Serie();
       casaDragon.setNombre("La Casa del Dragón");
       casaDragon.setFechaDeLanzamiento(2022);
       casaDragon.setTemporadas(1);
       casaDragon.setMinutosPorEpisodio(50);
       casaDragon.setEpisodiosPorTemporada(10);
       System.out.println("\n");
       casaDragon.mostrarFichaTecnica();

    /* Calculadora de tiempo */

       CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
       calculadoraDeTiempo.incluye(miPelicula1);
       calculadoraDeTiempo.incluye(miPelicula2);
       calculadoraDeTiempo.incluye(casaDragon);
       System.out.println("\n");
       System.out.println("Tiempo necesario  para ver todos los programas en estas vacaciones: "
               + calculadoraDeTiempo.getTiempoTotal() + " minutos");
    }
}