package PatronesEjercicio12Strategy;

import java.time.LocalDate;

//CONCRETE STRATEGY C
public class Estricta implements PoliticaCancelacion{
    private final static double CERO=0;

    public Estricta(){}

    @Override
    public double cancelacion(LocalDate fechaDeCancelacion,Reserva reserva) {
        return CERO;
    }
}
