package PatronesEjercicio6FactoryMethod;

//CONCRETE CREATOR
public class CreadorVegano implements CreadorSandwich{

    @Override
    public Sandwich crear() {
        Sandwich s = new Sandwich();
        s.agregarIngrediente(new Ingrediente("Integral", 100));
        s.agregarIngrediente(new Ingrediente("Salsa Criolla", 20));
        s.agregarIngrediente(new Ingrediente("Milanesa De Dirgolas", 500));
        return s;
    }
}
