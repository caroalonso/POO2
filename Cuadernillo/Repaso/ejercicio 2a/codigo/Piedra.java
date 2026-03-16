package ejercicio2a;

public class Piedra extends Jugada {

    public Piedra(){}

    @Override
    public boolean leGanaA(Jugada jugada) {
        return jugada.pierdeContraPiedra();
    }

    @Override
    public boolean pierdeContraPapel() {
        return true;
    }
}
