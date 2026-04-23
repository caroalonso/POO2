package PatronesEjercicio4aComposite;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class MixtaTest {
    private Mixta mixta;
    private Mixta mixta2;
    private Tierra tierra;
    private Agua agua;

    @Test
    void mixtaIgualMixta(){
        mixta= new Mixta(new Agua(),new Tierra(), new Tierra(),new Agua());
        mixta2= new Mixta(new Agua(),new Tierra(), new Tierra(),new Agua());
        assertTrue(mixta.esIgual(mixta2));
    }

    @Test
    void mixtaDiferenteDeTierra(){
        mixta=new Mixta(new Agua(),new Tierra(), new Tierra(),new Agua());
        tierra= new Tierra();
        assertFalse(mixta.esIgual(tierra));
    }

    @Test
    void mixtaDiferenteDeAgua(){
        mixta= new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua());
        agua=new Agua();
        assertFalse(mixta.esIgual(agua));
    }

    @Test
    void proporcionMixta(){
        mixta= new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua());
        assertEquals(0.5,mixta.calcularProporcion(),0.0001);
    }
}
