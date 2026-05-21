package PatronesEjercicio14Builder;

import java.time.LocalDate;

//BUILDER
public abstract class EquipoBuilder {

    protected Catalogo catalogo;
    protected Equipo equipo;

    public EquipoBuilder(Catalogo catalogo, String nombre, LocalDate fecha) {
        this.catalogo = catalogo;
    }

    public void reset() {
        this.equipo = new Equipo();
    }

    abstract void agregarProcesador();

    abstract void agregarMemoriaRam();

    abstract void agregarTarjetaGrafica();

    abstract  void agregarDisco();

    abstract void agregarGabinete();

    public Equipo getResultado() {
        return this.equipo;
    }
}
