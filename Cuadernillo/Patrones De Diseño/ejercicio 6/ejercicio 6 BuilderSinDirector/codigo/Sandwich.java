package PatronesEjercicio6BuilderSinDirector;

import java.util.ArrayList;
import java.util.List;

//PRODUCT
public class Sandwich {
    private List<Ingrediente>componentes;

    public Sandwich(){
        this.componentes= new ArrayList<>();
    }

    public void agregarComponente(Ingrediente componente){
        this.componentes.add(componente);
    }

    public double getPrecioTotalSandwich(){
        return this.componentes.stream()
                .mapToDouble(c->c.getPrecio())
                .sum();
    }

}
