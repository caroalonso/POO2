package RepasoEjercicio2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TijeraTest {

    private Jugada piedra;
    private Jugada tijera;
    private Tijera tijera2;
    private Jugada papel;
    private Jugada lagarto;
    private Jugada spock;

    @BeforeEach
    public void setUp() {
        piedra = new Piedra();
        tijera = new Tijera();
        tijera2= new Tijera();
        papel = new Papel();
        lagarto = new Lagarto();
        spock = new Spock();
    }

    @Test
    public void testTijeraGanaContraPapel() {
        assertTrue(tijera.leGanaA(papel));
        assertTrue(papel.pierdeContraTijera());
    }

    @Test
    public void testTijeraPierdeContraPiedra() {
        assertFalse(tijera.leGanaA(piedra));
        assertFalse(piedra.pierdeContraTijera());
    }

    @Test
    public void testTijeraPierdeContraSpock() {
        assertFalse(tijera.leGanaA(spock));
        assertFalse(spock.pierdeContraTijera());
    }

    @Test
    public void testTijeraGanaContraLagarto() {
        assertTrue(tijera.leGanaA(lagarto));
        assertTrue(lagarto.pierdeContraTijera());
    }

    @Test
    public void testTijeraEmpataConTijera() {
        assertFalse(tijera.leGanaA(tijera2));
        assertFalse(tijera2.leGanaA(tijera));
    }

}
