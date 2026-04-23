package PatronesEjercicio6FactoryMethod;

//CONCRETE CREATOR
public class CreadorSinTACC implements CreadorSandwich {

    @Override
    public Sandwich crear() {
        Sandwich s = new Sandwich();
        s.agregarIngrediente(new Ingrediente("Chipa", 150));
        s.agregarIngrediente(new Ingrediente("Salsa Tartara", 18));
        s.agregarIngrediente(new Ingrediente("Carne DeP Pollo", 250));
        s.agregarIngrediente(new Ingrediente("Verduras Grilladas", 200));
        return s;
    }
}
