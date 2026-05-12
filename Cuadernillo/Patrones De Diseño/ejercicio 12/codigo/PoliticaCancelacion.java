package PatronesEjercicio12Strategy;

import java.time.LocalDate;

//STRATEGY
public interface PoliticaCancelacion {
    double cancelacion(LocalDate fecha,Reserva reserva);
}
