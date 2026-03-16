package ejercicio2b;

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

    @Override
    public boolean pierdeContraSpock() {
        return true;
    }


}
