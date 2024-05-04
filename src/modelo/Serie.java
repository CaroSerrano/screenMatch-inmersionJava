package modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEpisodioEnMinutos;

    @Override
    public int getDuracionEnMinutos() {
        return duracionEpisodioEnMinutos * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEpisodioEnMinutos() {
        return duracionEpisodioEnMinutos;
    }

    public void setDuracionEpisodioEnMinutos(int duracionEpisodioEnMinutos) {
        this.duracionEpisodioEnMinutos = duracionEpisodioEnMinutos;
    }

    @Override
    public void muestraFichaTecnica() {
        System.out.println("**** FICHA TÉCNICA ****");
        System.out.println("Nombre del título: " + this.getNombre());
        System.out.println("Fecha de lanzamiento: " + this.getFechaDeLanzamiento());
        System.out.println("Número de temporadas: " + this.getTemporadas());
        System.out.println("Número de episodios por temporada: " + this.getEpisodiosPorTemporada());
        System.out.println("Tiempo de duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Sinopsis: " + this.getSinopsis());
        if(isIncluidoEnPlanBasico()){
            System.out.println("Incluido en plan básico");
        }else {
            System.out.println("No incluido en plan básico");
        }
        System.out.println("Evaluación: " + this.getEvaluacion());
    }
}
