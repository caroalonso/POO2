package PatronesEjercicio5Composite;

//COMPONENT
public interface SustanciaQuimica {
    abstract String formula();

    abstract int pesoMolecular();

    abstract int carga();

    abstract boolean esValida(SustanciaQuimica sustancia);

    abstract boolean compatibleConAtomo(Atomo otro);

    //necesario para que Atomo pueda retornar una Union.
    abstract Union add (SustanciaQuimica sustancia);
}
