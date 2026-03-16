package ejercicio2b;

public class Lagarto extends Jugada {

    public Lagarto() {}

    @Override
    public boolean leGanaA(Jugada jugada) {
        return jugada.pierdeContraLagarto();
    }

    @Override
    public boolean pierdeContraPiedra() {
        return true;
    }

    @Override
    public boolean pierdeContraTijera() {
        return true;
    }

}
