package PatronesEjercicio4aComposite;

//COMPONENT
public abstract class Topografia {
    public abstract double calcularProporcion();
    public abstract boolean esIgual(Topografia topografia);
    public abstract boolean esIgualAgua(Agua agua);
    public  abstract  boolean esIgualTierra(Tierra tierra);
    public abstract boolean esIgualMixta (Mixta mixta);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) //misma referencia.
            return true;
        if (obj == null) //obj null.
            return false;
        if (!(obj instanceof Topografia)) //obj no es una instancia de Topografia
            return false;
        Topografia topografia = (Topografia) obj; //cast de obj a Topografia
        return this.esIgual(topografia);
    }
}
