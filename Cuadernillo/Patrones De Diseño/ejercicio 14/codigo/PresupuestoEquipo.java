package PatronesEjercicio14Builder;

import java.time.LocalDate;

public class PresupuestoEquipo {

    private Equipo equipo;
    private final double IVA = 0.21;
    private String nombreCliente;
    private LocalDate fecha;

    public PresupuestoEquipo(String nombreCliente,LocalDate fecha, Equipo equipo) {
        this.nombreCliente=nombreCliente;
        this.fecha=fecha;
        this.equipo = equipo;
    }

    public double presupuestoEquipo() {
        return this.equipo.presupuestoEquipo();
    }

    public double consumoEquipo() {
        return this.equipo.consumoEquipo();
    }

    public double precioFinalEquipo() {
        return this.presupuestoEquipo() * (1 + IVA);
    }
}
