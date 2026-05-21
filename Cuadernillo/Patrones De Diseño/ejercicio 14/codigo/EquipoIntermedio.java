package PatronesEjercicio14Builder;

import java.time.LocalDate;

//CONCRETE BUILDER
public class EquipoIntermedio extends EquipoBuilder{

    public EquipoIntermedio(Catalogo catalogo, String nombre, LocalDate fecha) {
        super(catalogo,nombre,fecha);
    }

    @Override
    void agregarProcesador() {
        this.equipo.agregarComponente(this.catalogo.getComponente("Procesador Intermedio"));
    }

    @Override
    void agregarMemoriaRam() {
        this.equipo.agregarComponente(this.catalogo.getComponente("16 GB"));
    }

    @Override
    void agregarDisco() {
        this.equipo.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
    }

    @Override
    void agregarTarjetaGrafica() {
        this.equipo.agregarComponente(this.catalogo.getComponente("GTX 1650 "));
    }

    @Override
    void agregarGabinete() {
        this.equipo.agregarComponente(this.catalogo.getComponente("Gabinete Intermedio"));
        this.equipo.agregarComponente(this.catalogo.getComponente("Fuente 800"));
     }
}


