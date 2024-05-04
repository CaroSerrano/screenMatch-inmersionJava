import java.util.Scanner;

import modelo.Pelicula;
import modelo.Serie;
import modelo.Titulo;

public class Vista{
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 4){
            String menu = """
                    Bienvenid@ a ScreenMatch!
                    1) Registrar nueva película
                    2) Registrar una serie
                    3) Calculadora de tiempo
                    4) Salir
                    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("*** Registrando una nueva película ***");
                    System.out.println();

                    Pelicula peliculaUsuario= new Pelicula();

                    System.out.println("Ingrese el nombre de la película: ");
                    String nombrePeliculaUsuario = teclado.nextLine();
                    peliculaUsuario.setNombre(nombrePeliculaUsuario);

                    System.out.println("Ingrese el año de lanzamiento de la película: ");
                    int fechaLanzamientoUsuario = teclado.nextInt();
                    peliculaUsuario.setFechaDeLanzamiento(fechaLanzamientoUsuario);

                    System.out.println("Ingrese la duración en minutos de la película: ");
                    int duracionUsuario = teclado.nextInt();
                    peliculaUsuario.setDuracionEnMinutos(duracionUsuario);

                    System.out.println("Ingrese la sinopsis de la película: ");
                    String sinopsisUsuario = teclado.nextLine();
                    peliculaUsuario.setSinopsis(sinopsisUsuario);

                    System.out.println("Ingrese el director de la película: ");
                    String directorUsuario = teclado.nextLine();
                    peliculaUsuario.setDirector(directorUsuario);
                    System.out.println();

                    peliculaUsuario.muestraFichaTecnica();

                case 2:
                    System.out.println("*** Registrando una nueva serie ***");
                    System.out.println();

                    Serie serieUsuario = new Serie();
                    System.out.println("Ingrese el nombre de la serie: ");
                    String nombreSerieUsuario = teclado.nextLine();
                    serieUsuario.setNombre(nombreSerieUsuario);

                    System.out.println("Ingrese el año de lanzamiento de la serie: ");
                    fechaLanzamientoUsuario = teclado.nextInt();
                    serieUsuario.setFechaDeLanzamiento(fechaLanzamientoUsuario);

                    System.out.println("Ingrese la sinopsis de la serie: ");
                    sinopsisUsuario = teclado.nextLine();
                    serieUsuario.setSinopsis(sinopsisUsuario);

                    System.out.println("Ingrese el número de temporadas de la serie: ");
                    int numeroTemporadasUsuario = teclado.nextInt();
                    serieUsuario.setTemporadas(numeroTemporadasUsuario);

                    System.out.println("Ingrese el número de episodios por temporada de la serie: ");
                    int episodiosPorTemporadaUsuario = teclado.nextInt();
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporadaUsuario);

                    System.out.println("Ingrese 1 si la serie está incluida en el plan básico, de lo contrario ingrese 0: ");
                    int incluidaEnPlanBasicoUsuario = teclado.nextInt();
                    boolean incluidaEnPlanBasicoUsuarioBoolean;
                    if (incluidaEnPlanBasicoUsuario == 1){
                        incluidaEnPlanBasicoUsuarioBoolean = true;
                        serieUsuario.setIncluidoEnPlanBasico(incluidaEnPlanBasicoUsuarioBoolean);
                    } else if (incluidaEnPlanBasicoUsuario ==0) {
                        incluidaEnPlanBasicoUsuarioBoolean = false;
                        serieUsuario.setIncluidoEnPlanBasico(incluidaEnPlanBasicoUsuarioBoolean);

                    } else {
                        System.out.println("Opción inválida.");
                        muestraElMenu();
                    }
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar ScreenMatch. Esperamos vuelva pronto!");
                    break;
                default:
                    throw new IllegalStateException("Opción incorrecta: " + opcion);

            }

        }
    }
}
