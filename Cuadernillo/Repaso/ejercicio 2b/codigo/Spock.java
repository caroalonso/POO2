package ejercicio2b;

public class Spock extends Jugada{
    public Spock() {}

    @Override
    public boolean leGanaA(Jugada jugada) {
        return jugada.pierdeContraSpock();
    }

    @Override
    public boolean pierdeContraPapel() {
        return true;
    }

    @Override
    public boolean pierdeContraLagarto() {
        return true;
    }



}
