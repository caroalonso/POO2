package PatronesEjercicio12Strategy;

import java.time.LocalDate;

//CONCRETE STRATEGY B
public class Moderada implements PoliticaCancelacion{
    private final static double CINCUENTA_POR_CIENTO = 0.5;

    public Moderada(){}

    @Override
    public double cancelacion(LocalDate fechaDeCancelacion,Reserva reserva) {
        if(reserva.fechaDeCancelacionUnaSemanaAntesDeInicioDeReserva(fechaDeCancelacion))
            return reserva.montoApagar();
        if (reserva.fechaDesde6Hasta2DiasAntesDeInicioDeReserva(fechaDeCancelacion))
            return reserva.montoApagar()/CINCUENTA_POR_CIENTO;
        return 0;
    }
}
