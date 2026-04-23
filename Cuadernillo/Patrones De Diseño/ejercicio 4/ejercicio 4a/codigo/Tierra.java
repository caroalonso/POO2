package PatronesEjercicio4aComposite;

//LEAF
public class Tierra extends Topografia {

    private double proporcion = 0;

    public Tierra(){}

    @Override
    public double calcularProporcion(){
        return this.proporcion;
    }
    @Override
    public boolean esIgual(Topografia topografia){
        return topografia.esIgualTierra(this);
    }

    @Override
    public boolean esIgualTierra(Tierra tierra){
        return true;
    }

    @Override
    public boolean esIgualAgua(Agua agua){
        return false;
    }

    @Override
    public boolean esIgualMixta(Mixta mixta){
        return false;
    }
}
