package ejercicio2a;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TestTijera {

    private Jugada piedra;
    private Jugada tijera;
    private Jugada tijera2;
    private Jugada papel;

    @BeforeEach
    public void setUp(){
        piedra= new Piedra();
        tijera= new Tijera();
        tijera2= new Tijera();
        papel= new Papel();
    }

    @Test
    public void testTijeraGanaContraPapel(){
        assertTrue(tijera.leGanaA(papel));
        assertTrue(papel.pierdeContraTijera());
    }

    @Test
    public void testTijeraPierdeContraPiedra(){
        assertFalse(tijera.leGanaA(piedra));
        assertFalse(piedra.pierdeContraTijera());
    }


    @Test
    public void testTijeraEmpataConTijera(){
      assertFalse(tijera.leGanaA(tijera2));
      assertFalse(tijera2.leGanaA(tijera));
    }

}
