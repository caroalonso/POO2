package PatronesEjercicio6BuilderSinDirector;

//CONCRETE BUILDER
public class Vegetariano extends SandwichBuilder {
    @Override
    void agregarPan() {
        this.sandwich.agregarComponente(new Ingrediente("Semillas", 120));
    }

    @Override
    void agregarAderezo() {
        //sin Aderezo
    }

    @Override
    void agregarPrincipal() {
        this.sandwich.agregarComponente(new Ingrediente("Provoleta Grillada", 200));
    }

    @Override
    void agregarAdicional() {
       this.sandwich.agregarComponente(new Ingrediente("Berenjenas Al Escabeche",100));
    }
}
