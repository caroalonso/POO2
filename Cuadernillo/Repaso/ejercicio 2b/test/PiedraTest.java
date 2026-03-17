package RepasoEjercicio2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PiedraTest {

    private Jugada piedra;
    private Jugada piedra2;
    private Jugada tijera;
    private Jugada papel;
    private Jugada lagarto;
    private Jugada spock;

    @BeforeEach
    public void setUp() {
        piedra = new Piedra();
        piedra2 = new Piedra();
        tijera = new Tijera();
        papel = new Papel();
        lagarto = new Lagarto();
        spock = new Spock();
    }

    @Test
    public void piedraGanaContraTijera() {
        assertTrue(piedra.leGanaA(tijera));
        assertTrue(tijera.pierdeContraPiedra());
    }

    @Test
    public void piedraPierdeContraPapel() {
        assertFalse(piedra.leGanaA(papel));
        assertFalse(papel.pierdeContraPiedra());
    }

    @Test
    public void piedraPierdeContraSpock() {
        assertFalse(piedra.leGanaA(spock));
        assertFalse(spock.pierdeContraPiedra());
    }

    @Test
    public void piedraGanaContraLagarto() {
        assertTrue(piedra.leGanaA(lagarto));
        assertTrue(lagarto.pierdeContraPiedra());
    }


    @Test
    public void piedraEmpataConPiedra() {
        assertFalse(piedra.leGanaA(piedra2));
        assertFalse(piedra2.leGanaA(piedra));
    }
}

