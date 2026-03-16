package ejercicio2a;

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


}
