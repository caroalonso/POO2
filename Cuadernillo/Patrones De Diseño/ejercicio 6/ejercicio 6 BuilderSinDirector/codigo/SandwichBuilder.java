package PatronesEjercicio6BuilderSinDirector;

//BUILDER
public abstract class SandwichBuilder {

    protected Sandwich sandwich;

    public void reset(){
        this.sandwich = new Sandwich();
    }

    public Sandwich getResultado(){
        return this.sandwich;
    }

    abstract void agregarPan();
    abstract void agregarAderezo();
    abstract void agregarPrincipal();
    abstract void agregarAdicional();
}
