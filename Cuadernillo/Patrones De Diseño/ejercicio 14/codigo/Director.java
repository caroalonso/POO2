package PatronesEjercicio14Builder;

//DIRECTOR
public class Director {

    public Director(){}

    public Equipo construir (EquipoBuilder builder){
        builder.reset();
        builder.agregarProcesador();
        builder.agregarMemoriaRam();
        builder.agregarDisco();
        builder.agregarTarjetaGrafica();
        builder.agregarGabinete();
        return builder.getResultado();
    }
}
