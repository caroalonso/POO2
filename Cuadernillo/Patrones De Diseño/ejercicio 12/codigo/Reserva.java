package PatronesEjercicio12Strategy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//CONTEXT
public class Reserva {

    private Usuario usuario;
    private AutoEnAlquiler autoEnAlquiler;
    private int cantidadDias;
    private LocalDate fechaInicioDeReserva;

    public Reserva(Usuario usuario, AutoEnAlquiler autoEnAlquiler, int cantidadDias, LocalDate fecha) {
        this.usuario = usuario;
        this.autoEnAlquiler = autoEnAlquiler;
        this.cantidadDias = cantidadDias;
        this.fechaInicioDeReserva = fecha;
    }

    public boolean fechaDeCancelacionAnteriorAFechaDeInicioDeReserva(LocalDate fechaCancelacion){
        return  fechaCancelacion.isBefore(this.fechaInicioDeReserva);
    }

    public boolean fechaDeCancelacionUnaSemanaAntesDeInicioDeReserva(LocalDate fechaCancelacion){
        return ChronoUnit.DAYS.between(fechaCancelacion,this.fechaInicioDeReserva) >=7;
    }

    public boolean fechaDesde6Hasta2DiasAntesDeInicioDeReserva(LocalDate fechaCancelacion){
        Long dias = ChronoUnit.DAYS.between(fechaCancelacion,this.fechaInicioDeReserva);
        return dias >=2 && dias <7;
    }

    public double montoApagar() {
        return this.cantidadDias * this.autoEnAlquiler.getPrecioPorDia();
    }

    public double montoAreembolsar(LocalDate fechaDeCancelacion){
        return this.autoEnAlquiler.cancelacionSegunPolitica(fechaDeCancelacion,this);
    }

}
