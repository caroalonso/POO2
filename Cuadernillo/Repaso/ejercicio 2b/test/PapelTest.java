package RepasoEjercicio2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PapelTest {

    private Jugada piedra;
    private Jugada tijera;
    private Jugada papel;
    private Jugada papel2;
    private Jugada lagarto;
    private Jugada spock;

    @BeforeEach
    public void setUp(){
        piedra= new Piedra();
        tijera= new Tijera();
        papel= new Papel();
        papel2= new Papel();
        lagarto= new Lagarto();
        spock=new Spock();
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
    public void testPapelPierdeContraLagarto(){
        assertFalse(papel.leGanaA(lagarto));
        assertFalse(lagarto.pierdeContraPapel());
    }

    @Test
    public void testPapelGanaContraSpock(){
        assertTrue(papel.leGanaA(spock));
        assertTrue(spock.pierdeContraPapel());
    }

    @Test
    public void testPapelEmpataConPapel(){
        assertFalse(papel.leGanaA(papel2));
        assertFalse(papel2.leGanaA(papel));
    }


}
