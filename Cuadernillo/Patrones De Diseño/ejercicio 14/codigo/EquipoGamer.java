package PatronesEjercicio14Builder;

import java.time.LocalDate;

//CONCRETE BUILDER
public class EquipoGamer extends EquipoBuilder{
    private static final  double PORCETAJE_EXTRA= 0.50;
    private static final  double VALOR_UNO= 1;

    public EquipoGamer(Catalogo catalogo, String nombre, LocalDate fecha) {
        super(catalogo,nombre,fecha);
    }

    @Override
    void agregarProcesador() {
        this.equipo.agregarComponente(this.catalogo.getComponente("Procesador Gamer"));
        this.equipo.agregarComponente(this.catalogo.getComponente("Pad termico"));
        this.equipo.agregarComponente(this.catalogo.getComponente("Cooler"));
    }

    @Override
    void agregarMemoriaRam() {
        this.equipo.agregarComponente(this.catalogo.getComponente("32 GB"));
        this.equipo.agregarComponente(this.catalogo.getComponente("32 GB"));
    }

    @Override
    void agregarDisco() {
        this.equipo.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
        this.equipo.agregarComponente(this.catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    void agregarTarjetaGrafica() {
        this.equipo.agregarComponente(this.catalogo.getComponente("RTX 4090"));
    }

    @Override
    void agregarGabinete() {
        this.equipo.agregarComponente(this.catalogo.getComponente("Gabinete Gamer"));
        double consumo = this.equipo.consumoEquipo() * (VALOR_UNO + PORCETAJE_EXTRA);
        this.equipo.agregarComponente(this.catalogo.getComponente("fuente " + consumo + " consumo w"));
    }
}
