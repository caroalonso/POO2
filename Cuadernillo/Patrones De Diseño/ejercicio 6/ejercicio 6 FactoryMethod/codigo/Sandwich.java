package PatronesEjercicio6FactoryMethod;

import java.util.ArrayList;
import java.util.List;

//PRODUCT
public  class Sandwich {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public double pecioTotalDeSandwich() {
        return this.ingredientes.stream()
                .mapToDouble(c -> c.precioDeIngrediente())
                .sum();
    }

}
