package PatronesEjercicio6FactoryMethod;

//CONCRETE CREATOR
public class CreadorClasico  implements  CreadorSandwich{

    @Override
    public Sandwich crear() {
        Sandwich s = new Sandwich();
        s.agregarIngrediente(new Ingrediente("Brioche", 100));
        s.agregarIngrediente(new Ingrediente("Mayonesa", 20));
        s.agregarIngrediente(new Ingrediente("Carne De Ternera", 300));
        s.agregarIngrediente(new Ingrediente("Tomate", 80));
        return s;
    }
}
