package PatronesEjercicio6BuilderConDirector;

//CONCRETE BUILDER
public class SinTACC extends SandwichBuilder{

    public SinTACC(){}

    @Override
    void agregarPan() {
        this.sandwich.agregarIngrediente(new Ingrediente("Chipa",150));
    }

    @Override
    void agregarAderezo() {
        this.sandwich.agregarIngrediente(new Ingrediente("Salsa Tartara",18));
    }

    @Override
    void agregarPrincipal() {
       this.sandwich.agregarIngrediente(new Ingrediente("Carne DeP Pollo",250));
    }

    @Override
    void agregarAdicional() {
        this.sandwich.agregarIngrediente(new Ingrediente("Verduras Grilladas", 200));
    }
}
