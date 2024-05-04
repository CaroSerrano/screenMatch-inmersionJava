package modelo;

public class CalculadoraDeTiempo {
    private double horasNecesarias;
    private double diasNecesarios;


    public void calculaElTiempo(int tiempoEnMinutos){
        horasNecesarias = (double) tiempoEnMinutos/60;
        diasNecesarios = (double) tiempoEnMinutos /1440;

        System.out.println("Para maratonear los títulos ingresados necesitas " +
                tiempoEnMinutos + " minutos, " + horasNecesarias + " horas y " + diasNecesarios +
                " días.");
    }
}
