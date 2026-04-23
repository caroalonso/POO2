package PatronesEjercicio6BuilderConDirector;

//CONCRETE BUILDER
public class Clasico extends SandwichBuilder {

    public Clasico(){}

    @Override
    void agregarPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("Brioche", 100));
    }

    @Override
    void agregarAderezo() {
        this.sandwich.agregarIngrediente(new Ingrediente("Mayonesa", 20));
    }

    @Override
    void agregarPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("Carne De Ternera", 300));
    }

    @Override
    void agregarAdicional() {
        this.sandwich.agregarIngrediente(new Ingrediente("Tomate", 80));
    }
}
