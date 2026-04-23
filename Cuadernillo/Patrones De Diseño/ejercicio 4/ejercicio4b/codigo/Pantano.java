package PatronesEjercicio4bComposite;

//LEAF
public class Pantano extends Topografia {

    private double proporcion = 0.7;

    public Pantano(){}

    @Override
    public double calcularProporcion() {
        return this.proporcion;
    }

    @Override
    public boolean esIgual(Topografia topografia) {
        return topografia.esIgualPantano(this);
    }

    @Override
    public boolean esIgualAgua(Agua agua) {
        return false;
    }

    @Override
    public boolean esIgualTierra(Tierra tierra) {
        return false;
    }

    @Override
    public boolean esIgualMixta(Mixta mixta) {
        return false;
    }

    @Override
    public boolean esIgualPantano(Pantano pantano) {
        return true;
    }
}
