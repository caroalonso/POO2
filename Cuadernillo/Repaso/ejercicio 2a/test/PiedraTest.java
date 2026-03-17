package RepasoEjercicio2a;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PiedraTest {

    private Jugada piedra;
    private Jugada piedra2;
    private Jugada tijera;
    private Jugada papel;

    @BeforeEach
    public void setUp(){
        piedra= new Piedra();
        piedra2= new Piedra();
        tijera= new Tijera();
        papel= new Papel();
    }

    @Test
    public void piedraGanaContraTijera(){
        assertTrue(piedra.leGanaA(tijera));
        assertTrue(tijera.pierdeContraPiedra());

    }

    @Test
    public void piedraPierdeContraPapel(){
        assertFalse(piedra.leGanaA(papel));
        assertFalse(papel.pierdeContraPiedra());
    }

    @Test
    public void piedraEmpataConPiedra(){
        assertFalse(piedra.leGanaA(piedra2));
        assertFalse(piedra2.leGanaA(piedra));
    }
}

