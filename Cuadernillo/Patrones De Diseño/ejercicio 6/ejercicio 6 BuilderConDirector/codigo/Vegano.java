package PatronesEjercicio6BuilderConDirector;

//CONCRETE BUILDER
public class Vegano extends SandwichBuilder {

    public Vegano(){}

    @Override
    void agregarPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("Integral", 100));
    }

    @Override
    void agregarAderezo() {
        this.sandwich.agregarIngrediente(new Ingrediente("Salsa Criolla", 20));
    }

    @Override
    void agregarPrincipal() {
        this.sandwich.agregarIngrediente(new Ingrediente("Milanesa De Dirgolas", 500));
    }

    @Override
    void agregarAdicional() {
        //sin Adicional
    }
}
