package PatronesEjercicio14Builder;

import java.util.List;

//PRODUCT
public class Equipo {

    private List<Componente>componentes;

    public void agregarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public double presupuestoEquipo() {
        return this.componentes.stream()
                .mapToDouble(c -> c.getPrecio())
                .sum();
    }

    public double consumoEquipo() {
        return this.componentes.stream()
                .mapToDouble(c -> c.getConsumo())
                .sum();
    }
}
