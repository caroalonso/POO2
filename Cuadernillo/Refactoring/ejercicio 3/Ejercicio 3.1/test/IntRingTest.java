package RefactoringEjercicio3PrimeraParte;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class IntRingTest {

    private IntRing intRing;

    @Test
    void testVectorVacio() {
        IntRing intRing = new IntRing(new int[]{});
        assertArrayEquals(new int[]{}, intRing.getSource());
        assertEquals(0, intRing.getIdx());
    }

    @Test
    void testVectorConUnNumero() {
        IntRing intRing = new IntRing(new int[]{1});
        assertArrayEquals(new int[]{1}, intRing.getSource());
        assertEquals(0, intRing.getIdx());
    }

    @Test
    void testVectorConMasDeUnNumero() {
        IntRing intRing = new IntRing(new int[]{1,2,3});
        assertArrayEquals(new int[]{1,2,3}, intRing.getSource());
        assertEquals(0, intRing.getIdx());
    }

    @Test
    void testCicloBasico(){
        IntRing intRing = new IntRing(new int[]{1,2,3});

        assertEquals(1, intRing.next());
        assertEquals(2, intRing.next());
        assertEquals(3, intRing.next());
        assertEquals(1, intRing.next());
    }

    @Test
    void testCicloMultiple(){
        IntRing intRing = new IntRing(new int[]{1,2,3});

        assertEquals(1, intRing.next());
        assertEquals(2, intRing.next());
        assertEquals(3, intRing.next());
        assertEquals(1, intRing.next());

        assertEquals(2, intRing.next());
        assertEquals(3, intRing.next());
        assertEquals(1, intRing.next());
    }

}


