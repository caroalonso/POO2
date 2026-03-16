package ejercicio2a;

public class Papel extends Jugada {

    public Papel(){}

    @Override
    public boolean leGanaA(Jugada jugada) {
        return jugada.pierdeContraPapel();
    }

    @Override
    public boolean pierdeContraTijera() {
        return true;
    }


}
