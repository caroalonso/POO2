package PatronesEjercicio6BuilderConDirector;

public class Ingrediente {

    private String nombre;
    private double precio;

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double precioDeIngrediente() {
        return this.precio;
    }
}

