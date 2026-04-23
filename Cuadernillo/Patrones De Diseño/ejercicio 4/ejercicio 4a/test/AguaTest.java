package PatronesEjercicio4aComposite;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AguaTest {
    private Agua agua;
    private Agua agua2;
    private Tierra tierra;
    private Mixta mixta;

    @Test
    void aguaIgualAgua(){
        agua=new Agua();
        agua2=new Agua();
        assertTrue(agua.esIgual(agua2));
    }

    @Test
    void aguaDiferenteDeTierra(){
        agua=new Agua();
        tierra= new Tierra();
        assertFalse(agua.esIgual(tierra));
    }

    @Test
    void aguaDiferenteDeMixta(){
        agua=new Agua();
        mixta= new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua());
        assertFalse(agua.esIgual(mixta));
    }

    @Test
    void proporcionAgua(){
        agua=new Agua();
        assertEquals(1,agua.calcularProporcion(),0.0001);
    }
}
