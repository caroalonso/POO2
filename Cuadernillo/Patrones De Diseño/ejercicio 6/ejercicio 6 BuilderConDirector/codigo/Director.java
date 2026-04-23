package PatronesEjercicio6BuilderConDirector;

//DIRECTOR
public class Director {

    public Director(){};

    public Sandwich construir (SandwichBuilder builder) {
        builder.reset();
        builder.agregarPan();
        builder.agregarAderezo();
        builder.agregarPrincipal();
        builder.agregarAdicional();
        return builder.getResultado();
    }
}
