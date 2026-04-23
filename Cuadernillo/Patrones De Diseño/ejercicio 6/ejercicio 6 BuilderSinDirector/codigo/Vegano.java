package PatronesEjercicio6BuilderSinDirector;

//CONCRETE BUILDER
public class Vegano extends SandwichBuilder {

    @Override
    void agregarPan() {
        this.sandwich.agregarComponente(new Ingrediente("Integral",100));
    }

    @Override
    void agregarAderezo() {
       this.sandwich.agregarComponente(new Ingrediente("Salsa Criolla",20));
    }

    @Override
    void agregarPrincipal() {
      this.sandwich.agregarComponente(new Ingrediente("Milanesa De Dirgolas",500));
    }

    @Override
    void agregarAdicional() {
        //sin Adicional
    }
}
