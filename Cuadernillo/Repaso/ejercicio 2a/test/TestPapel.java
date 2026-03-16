package ejercicio2a;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TestPapel {

    private Jugada piedra;
    private Jugada tijera;
    private Jugada papel;
    private Jugada papel2;

    @BeforeEach
    public void setUp(){
        piedra= new Piedra();
        tijera= new Tijera();
        papel= new Papel();
        papel2= new Papel();
    }

    @Test
    public void testPapelGanaContraPiedra(){
      assertTrue(papel.leGanaA(piedra));
      assertTrue(piedra.pierdeContraPapel());
    }

    @Test
    public void testPapelPierdeContraTijera(){
      assertFalse(papel.leGanaA(tijera));
      assertFalse(tijera.pierdeContraPapel());
    }

    @Test
    public void testPapelEmpataConPapel(){
      assertFalse(papel.leGanaA(papel2));
      assertFalse(papel2.leGanaA(papel));
    }

}
