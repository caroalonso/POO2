package PatronesEjercicio4aComposite;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TierraTest {
    private Tierra tierra;
    private Tierra tierra2;
    private Agua agua;
    private Mixta mixta;

    @Test
    void tierraIgualTierra(){
        tierra =new Tierra();
        tierra2 =new Tierra();
        assertTrue(tierra.esIgual(tierra2));
    }

    @Test
    void tierraDiferenteDeAgua(){
        tierra =new Tierra();
        agua = new Agua();
        assertFalse(tierra.esIgual(agua));
    }

    @Test
    void tierraDiferenteDeMixta(){
        tierra =new Tierra();
        mixta= new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua());
        assertFalse(tierra.esIgual(mixta));
    }

    @Test
    void proporcionTierra(){
        tierra =new Tierra();
        assertEquals(0, tierra.calcularProporcion(),0.0001);
    }
}
