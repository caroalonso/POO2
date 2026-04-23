package PatronesEjercicio6BuilderSinDirector;

//CONCRETE BUILDER
public class Clasico extends SandwichBuilder {

    @Override
    void agregarPan() {
        this.sandwich.agregarComponente(new Ingrediente("Brioche", 100));
    }

    @Override
    void agregarAderezo() {
        this.sandwich.agregarComponente(new Ingrediente("Mayonesa", 20));
    }

    @Override
    void agregarPrincipal() {
        this.sandwich.agregarComponente(new Ingrediente("Carne De Ternera", 300));
    }

    @Override
    void agregarAdicional() {
        this.sandwich.agregarComponente(new Ingrediente("Tomate", 80));
    }
}
