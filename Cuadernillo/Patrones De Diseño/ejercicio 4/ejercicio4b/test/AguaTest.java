package PatronesEjercicio4bComposite;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AguaTest {
    private Agua agua;
    private Agua agua2;
    private Tierra tierra;
    private Mixta mixta;
    private Pantano pantano;

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
    void aguaDiferenteDePantano(){
        agua=new Agua();
        pantano= new Pantano();
        assertFalse(agua.esIgual(pantano));
    }

    @Test
    void proporcionAgua(){
        agua=new Agua();
        assertEquals(1,agua.calcularProporcion(),0.0001);
    }

}
