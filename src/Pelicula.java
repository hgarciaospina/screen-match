public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaEvaluaciones;

    int totalEvaluaciones;

    void mostrarFichaTecnica() {
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    void evaluar(double nota) {
        totalEvaluaciones++;
        sumaEvaluaciones += nota;
    }

    double calcularMediaEvaluaciones() {
        return sumaEvaluaciones / totalEvaluaciones;
    }
}