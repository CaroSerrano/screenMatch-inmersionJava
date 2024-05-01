import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ a ScreenMatch");

        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin de milenio
                
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnPlanBasico);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        }  else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la evaluación de la pelicula Matrix es: "
                + mediaEvaluacionUsuario/3);




    }
}