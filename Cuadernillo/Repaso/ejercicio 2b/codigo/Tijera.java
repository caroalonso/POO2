package ejercicio2b;

public class Tijera  extends Jugada {

    public Tijera(){}

    @Override
    public boolean leGanaA(Jugada jugada) {
        return jugada.pierdeContraTijera();
    }

    @Override
    public boolean pierdeContraPiedra() {
        return true;
    }

    @Override
    public boolean pierdeContraSpock() {
        return true;
    }

}
