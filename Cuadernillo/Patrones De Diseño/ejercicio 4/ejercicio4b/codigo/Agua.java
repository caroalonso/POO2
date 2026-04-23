package PatronesEjercicio4bComposite;

//LEAF
public class Agua extends Topografia {

    private double proporcion = 1;

    public Agua(){}

    @Override
    public double calcularProporcion(){
        return this.proporcion;
    }
    @Override
    public boolean esIgual(Topografia topografia){
        return topografia.esIgualAgua(this);
    }
    @Override
    public boolean esIgualAgua(Agua agua){
        return true;
    }
    @Override
    public boolean esIgualTierra(Tierra tierra){
        return false;
    }
    @Override
    public boolean esIgualMixta(Mixta mixta){
        return false;
    }

    @Override
    public boolean esIgualPantano(Pantano pantano) {
        return false;
    }
}
