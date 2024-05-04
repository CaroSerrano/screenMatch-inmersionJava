package modelo;

public class CalculadoraDeTiempo {

    public void calculaElTiempo(int tiempoEnMinutos){
        int horasNecesarias =  tiempoEnMinutos/60;
        int diasNecesarios =  tiempoEnMinutos /1440;

        System.out.println("Para maratonear los títulos ingresados necesitas " +
                tiempoEnMinutos + " minutos, " + horasNecesarias + " horas y " + diasNecesarios +
                " días.");
    }
}
