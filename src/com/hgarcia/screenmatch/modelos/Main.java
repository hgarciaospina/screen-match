package com.hgarcia.screenmatch.modelos;

public class Main {
    public static void main(String[] args) {

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
       System.out.println("*******************************************************");
    }
}