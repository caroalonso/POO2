package PatronesEjercicio6FactoryMethod;

//CONCRETE CREATOR
public class CreadorVegetariano implements CreadorSandwich{

    @Override
    public Sandwich crear() {
        Sandwich s = new Sandwich();
        s.agregarIngrediente(new Ingrediente("Semillas", 120));
        s.agregarIngrediente(new Ingrediente("Provoleta Grillada", 200));
        s.agregarIngrediente(new Ingrediente("Berenguena Al Escabeche", 100));
        return s;
    }
}
