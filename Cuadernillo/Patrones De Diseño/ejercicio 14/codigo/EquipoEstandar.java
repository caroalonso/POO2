package PatronesEjercicio14Builder;

import java.time.LocalDate;

//CONCRETE BUILDER
public class EquipoEstandar extends EquipoBuilder {

    public EquipoEstandar(Catalogo catalogo, String nombre, LocalDate fecha){
        super(catalogo,nombre,fecha);
    }

    @Override
    void agregarProcesador() {
        this.equipo.agregarComponente(this.catalogo.getComponente("Procesador Básico"));
    }

    @Override
    void agregarMemoriaRam() {
        this.equipo.agregarComponente(this.catalogo.getComponente("8 GB"));
    }

    @Override
    void agregarDisco() {
        this.equipo.agregarComponente(this.catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    void agregarTarjetaGrafica() {
        //sin tarjeta grafica
    }

    @Override
    void agregarGabinete() {
        this.equipo.agregarComponente(this.catalogo.getComponente("Gabinete Estándar"));
    }
}
