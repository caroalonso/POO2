package PatronesEjercicio4bComposite;

import java.util.ArrayList;
import java.util.List;

//COMPOSITE
public class Mixta extends Topografia {
    private List<Topografia> superficies;

    public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
        this.superficies = new ArrayList<>();
        this.superficies.add(t1);
        this.superficies.add(t2);
        this.superficies.add(t3);
        this.superficies.add(t4);
    }

    @Override
    public double calcularProporcion() {
        return this.superficies.stream()
                .mapToDouble(s -> s.calcularProporcion())
                .sum() / this.superficies.size();
    }

    @Override
    public boolean esIgual(Topografia topografia) {
        return topografia.esIgualMixta(this);
    }

    @Override
    public boolean esIgualAgua(Agua agua){
        return false;
    }

    @Override
    public boolean esIgualTierra(Tierra tierra){
        return false;
    }

    @Override
    public boolean esIgualMixta(Mixta mixta){
    return this.superficies.equals(mixta.superficies);

    }

    @Override
    public boolean esIgualPantano(Pantano pantano) {
        return false;
    }

}
