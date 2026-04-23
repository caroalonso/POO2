package PatronesEjercicio6BuilderConDirector;

//CONCRETE BUILDER
public class Vegetariano extends SandwichBuilder {

    public Vegetariano(){}

    @Override
    void agregarPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("Semillas", 120));
    }

    @Override
    void agregarAderezo() {
        //sin Aderezo
    }

    @Override
    void agregarPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("Provoleta Grillada", 200));
    }

    @Override
    void agregarAdicional() {
        this.sandwich.agregarIngrediente(new Ingrediente("Berenjenas Al Escabeche", 100));
    }
}
