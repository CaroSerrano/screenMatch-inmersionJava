package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnPlanBasico;
    private String sinopsis;
    private int duracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public double getEvaluacion() {
        return evaluacion;
    }



    public void muestraFichaTecnica(){
        System.out.println("**** FICHA TÉCNICA ****");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Sinopsis: " + sinopsis);
        if(incluidoEnPlanBasico){
            System.out.println("Incluido en plan básico");
        }else {
            System.out.println("No incluido en plan básico");
        }
        System.out.println("Evaluación: " + evaluacion);
    }
}
