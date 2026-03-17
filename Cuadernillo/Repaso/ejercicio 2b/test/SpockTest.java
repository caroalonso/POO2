package RepasoEjercicio2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpockTest {

    private Jugada piedra;
    private Jugada tijera;
    private Jugada papel;
    private Jugada lagarto;
    private Jugada spock;
    private Jugada spock2;

    @BeforeEach
    public void setUp() {
        piedra = new Piedra();
        tijera = new Tijera();
        papel = new Papel();
        lagarto = new Lagarto();
        spock = new Spock();
        spock2 = new Spock();
    }

   @Test
   public void spockPierdeContraPapel(){
        assertFalse(spock.leGanaA(papel));
        assertFalse(papel.pierdeContraSpock());
   }

   @Test
   public void spockPierdeContraLagarto(){
        assertFalse(spock.leGanaA(lagarto));
        assertFalse(lagarto.pierdeContraSpock());
   }

    @Test
    public void spockGanaContraPiedra(){
        assertTrue(spock.leGanaA(piedra));
        assertTrue(piedra.pierdeContraSpock());
    }

    @Test
    public void spockGanaContraTijera(){
        assertTrue(spock.leGanaA(tijera));
        assertTrue(tijera.pierdeContraSpock());
    }

   @Test
   public void spockEmpataContraSpock (){
        assertFalse(spock.leGanaA(spock2));
        assertFalse(spock2.leGanaA(spock));
    }

}


