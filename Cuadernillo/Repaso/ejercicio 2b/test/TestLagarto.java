package ejercicio2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLagarto {

    private Jugada piedra;
    private Jugada tijera;
    private Jugada papel;
    private Jugada lagarto;
    private Jugada lagarto2;
    private Jugada spock;

    @BeforeEach
    public void setUp() {
        piedra = new Piedra();
        tijera = new Tijera();
        papel = new Papel();
        lagarto = new Lagarto();
        lagarto2 = new Lagarto();
        spock = new Spock();
    }

    @Test
    public void lagartoPierdeContraPiedra(){
        assertFalse(lagarto.leGanaA(piedra));
        assertFalse(piedra.pierdeContraLagarto());
    }

    @Test
    public void lagartoPierdeContraTijera(){
        assertFalse(lagarto.leGanaA(tijera));
        assertFalse(tijera.pierdeContraLagarto());
    }

    @Test
    public void lagartoGanaContraPapel(){
        assertTrue(lagarto.leGanaA(papel));
        assertTrue(papel.pierdeContraLagarto());
    }

    @Test
    public void lagartoGanaContraSpock(){
        assertTrue(lagarto.leGanaA(spock));
        assertTrue(spock.pierdeContraLagarto());
    }

    @Test
    public void lagartoEmpataContraLagarto(){
        assertFalse(lagarto.leGanaA(lagarto2));
        assertFalse(lagarto2.leGanaA(lagarto));
    }
}
