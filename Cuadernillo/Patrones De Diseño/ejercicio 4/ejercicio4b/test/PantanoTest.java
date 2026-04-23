package PatronesEjercicio4bComposite;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PantanoTest {
    private Pantano pantano;
    private Pantano pantano2;
    private Agua agua;
    private Mixta mixta;
    private Tierra tierra;

    @Test
    void pantanoIgualPantano(){
        pantano =new Pantano();
        pantano2 =new Pantano();
        assertTrue(pantano.esIgual(pantano2));
    }

    @Test
    void pantanoDiferenteDeAgua(){
        pantano =new Pantano();
        agua = new Agua();
        assertFalse(pantano.esIgual(agua));
    }

    @Test
    void pantanoDiferenteDeMixta(){
        pantano =new Pantano();
        mixta= new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua());
        assertFalse(pantano.esIgual(mixta));
    }

    @Test
    void tierraDiferenteDePantano(){
        pantano= new Pantano();
        tierra=new Tierra();
        assertFalse(pantano.esIgual(tierra));
    }

    @Test
    void proporcionPantano(){
        pantano =new Pantano();
        assertEquals(0.7, pantano.calcularProporcion(),0.0001);
    }
}
