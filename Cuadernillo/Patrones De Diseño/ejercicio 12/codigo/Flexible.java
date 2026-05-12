package PatronesEjercicio12Strategy;

import java.time.LocalDate;

//CONCRETE STRATEGY A
public class Flexible implements PoliticaCancelacion {
    private final static double CERO=0;

    public Flexible(){}

    @Override
    public double cancelacion(LocalDate fechaDeCancelacion,Reserva reserva) {
        if(reserva.fechaDeCancelacionAnteriorAFechaDeInicioDeReserva(fechaDeCancelacion))
             return reserva.montoApagar();
        return CERO;
    }
}
