package PatronesEjercicio6BuilderConDirector;

import java.util.ArrayList;
import java.util.List;

//PRODUCT
public class Sandwich {

    private List<Ingrediente> ingredientes;

    public Sandwich() {
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public double precioTotalDeSandwich() {
        return this.ingredientes.stream()
                .mapToDouble(c -> c.precioDeIngrediente())
                .sum();
    }

}
