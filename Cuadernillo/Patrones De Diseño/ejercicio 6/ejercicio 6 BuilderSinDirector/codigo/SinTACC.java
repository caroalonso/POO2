package PatronesEjercicio6BuilderSinDirector;

//CONCRETE BUILDER
public class SinTACC extends SandwichBuilder {

    @Override
    void agregarPan() {
        this.sandwich.agregarComponente(new Ingrediente("Chipa",150));
    }

    @Override
    void agregarAderezo() {
        this.sandwich.agregarComponente(new Ingrediente("Salsa Tartara",18));
    }

    @Override
    void agregarPrincipal() {
       this.sandwich.agregarComponente(new Ingrediente("Carne DeP Pollo",250));
    }

    @Override
    void agregarAdicional() {
       this.sandwich.agregarComponente(new Ingrediente("Verduras Grilladas",200));
    }
}
