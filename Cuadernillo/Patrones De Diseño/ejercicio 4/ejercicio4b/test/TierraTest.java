package PatronesEjercicio4bComposite;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TierraTest {
    private Tierra tierra;
    private Tierra tierra2;
    private Agua agua;
    private Mixta mixta;
    private Pantano pantano;

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
        assertTrue(tierra.esIgual(mixta));
    }

    @Test
    void tierraDiferenteDePantano(){
        tierra=new Tierra();
        pantano= new Pantano();
        assertFalse(tierra.esIgual(pantano));
    }

    @Test
    void proporcionTierra(){
        tierra =new Tierra();
        assertEquals(0, tierra.calcularProporcion(),0.0001);
    }
}
