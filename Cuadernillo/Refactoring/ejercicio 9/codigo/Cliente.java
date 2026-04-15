package RefactoringEjercicio9;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private static final int CINCO = 5;
    private LocalDate fechaAlta;
    private Pago pago;

    public Cliente(LocalDate fechaAlta){
        this.fechaAlta=fechaAlta;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public int aniosDesdeFechaAlta() {
        return Period.between(this.getFechaAlta(), LocalDate.now()).getYears();
    }

    public boolean mayorAcinco() {
        return this.aniosDesdeFechaAlta() > CINCO;
    }
}
