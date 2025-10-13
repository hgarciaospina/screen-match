public class Main {
    public static void main(String[] args) {

       Pelicula miPelicula1 = new Pelicula();

       miPelicula1.nombre = "Encanto";
       miPelicula1.fechaDeLanzamiento = 2021;
       miPelicula1.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula1.nombre);
        System.out.println("Fecha de lanzamiento: " + miPelicula1.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + miPelicula1.duracionEnMinutos);

        Pelicula miPelicula2 = new Pelicula();

        miPelicula2.nombre = "Matrix";
        miPelicula2.fechaDeLanzamiento = 1998;
        miPelicula2.duracionEnMinutos = 180;

        System.out.println("Mi pelicula es: " + miPelicula2.nombre);
        System.out.println("Fecha de lanzamiento: " + miPelicula2.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + miPelicula2.duracionEnMinutos);
    }
}