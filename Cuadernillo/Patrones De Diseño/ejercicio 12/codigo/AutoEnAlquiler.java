package PatronesEjercicio12Strategy;

import java.time.LocalDate;

public class AutoEnAlquiler {

    private double precioPorDia;
    private int cantidadPlazas;
    private String marca;
    private PoliticaCancelacion politicaCancelacion;

    public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca,PoliticaCancelacion politicaCancelacion) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
        this.politicaCancelacion=politicaCancelacion;
    }

    public void setPoliticaCancelacion(PoliticaCancelacion politicaCancelacion) {
        this.politicaCancelacion = politicaCancelacion;
    }

    public double getPrecioPorDia(){
       return this.precioPorDia;
    }

    public double cancelacionSegunPolitica(LocalDate fecha,Reserva reserva){
     return this.politicaCancelacion.cancelacion(fecha,reserva);
    }

}
