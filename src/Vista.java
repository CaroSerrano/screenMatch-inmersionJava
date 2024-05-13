import java.util.Scanner;

import modelo.Pelicula;
import modelo.Serie;
import modelo.Titulo;
import modelo.CalculadoraDeTiempo;

public class Vista{
    int tiempo = 0;
    private void crearPelicula(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** Registrando una nueva película ***");
        System.out.println();

        Pelicula peliculaUsuario= new Pelicula();
        setearDatosEnComun(peliculaUsuario);

        System.out.println("Ingrese la duración en minutos de la película: ");
        int duracionUsuario = teclado.nextInt();
        teclado.nextLine();
        peliculaUsuario.setDuracionEnMinutos(duracionUsuario);
        tiempo = tiempo + duracionUsuario;


        System.out.println("Ingrese el director de la película: ");
        String directorUsuario = teclado.nextLine();
        peliculaUsuario.setDirector(directorUsuario);
        System.out.println();

        peliculaUsuario.setEvaluacion();

        peliculaUsuario.muestraFichaTecnica();
    }
    private void crearSerie(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** Registrando una nueva serie ***");
        System.out.println();

        Serie serieUsuario = new Serie();
        setearDatosEnComun(serieUsuario);

        System.out.println("Ingrese el número de temporadas de la serie: ");
        int numeroTemporadasUsuario = teclado.nextInt();
        teclado.nextLine();
        serieUsuario.setTemporadas(numeroTemporadasUsuario);

        System.out.println("Ingrese el número de episodios por temporada de la serie: ");
        int episodiosPorTemporadaUsuario = teclado.nextInt();
        teclado.nextLine();
        serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporadaUsuario);

        System.out.println("Ingrese la duración en minutos de cada episodio (puede ser un promedio): ");
        int duracionEpisodioMinutosUsuario = teclado.nextInt();
        teclado.nextLine();
        serieUsuario.setDuracionEpisodioEnMinutos(duracionEpisodioMinutosUsuario);
        tiempo = tiempo + serieUsuario.getDuracionEnMinutos();

        serieUsuario.setEvaluacion();

        serieUsuario.muestraFichaTecnica();
    }
    private void setearDatosEnComun(Titulo titulo){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del título: ");
        String nombreTituloUsuario = teclado.nextLine();

        System.out.println("Ingrese el año de lanzamiento del título: ");
        int fechaLanzamientoUsuario = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingrese la sinopsis del título: ");
        String sinopsisUsuario = teclado.nextLine();

        System.out.println("Ingrese 1 si el título está incluido en el plan básico, de lo contrario ingrese 0: ");
        int incluidaEnPlanBasicoUsuario = teclado.nextInt();
        teclado.nextLine();
        boolean incluidaEnPlanBasicoUsuarioBoolean;
        if (incluidaEnPlanBasicoUsuario == 1){
            incluidaEnPlanBasicoUsuarioBoolean = true;
            titulo.setIncluidoEnPlanBasico(incluidaEnPlanBasicoUsuarioBoolean);
        } else if (incluidaEnPlanBasicoUsuario ==0) {
            incluidaEnPlanBasicoUsuarioBoolean = false;
            titulo.setIncluidoEnPlanBasico(incluidaEnPlanBasicoUsuarioBoolean);

        } else {
            System.out.println("Opción inválida.");
            muestraElMenu();
        }

        titulo.setNombre(nombreTituloUsuario);
        titulo.setFechaDeLanzamiento(fechaLanzamientoUsuario);
        titulo.setSinopsis(sinopsisUsuario);

    }
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
                    crearPelicula();
                    break;

                case 2:
                   crearSerie();
                    break;

                case 3:
                    CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
                    calculadora.calculaElTiempo(tiempo);
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
