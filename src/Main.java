public class Main {
    public static void main(String[] args) {

       Pelicula miPelicula1 = new Pelicula();
       miPelicula1.nombre = "Encanto";
       miPelicula1.fechaDeLanzamiento = 2021;
       miPelicula1.duracionEnMinutos = 120;
       miPelicula1.mostrarFichaTecnica();
       miPelicula1.evaluar(7.80);
       miPelicula1.evaluar(10.00);
       System.out.println(miPelicula1.totalEvaluaciones);
       System.out.println(miPelicula1.sumaEvaluaciones);
       System.out.println(miPelicula1.calcularMediaEvaluaciones());

       Pelicula miPelicula2 = new Pelicula();
       miPelicula2.nombre = "Matrix";
       miPelicula2.fechaDeLanzamiento = 1998;
       miPelicula2.duracionEnMinutos = 180;
       miPelicula2.mostrarFichaTecnica();
    }
}