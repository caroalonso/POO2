package RefactoringEjercicio3PrimeraParte;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class IntRingTest {

    private IntRing intRing;

    @Test
    void vectorVacio() {
        IntRing intRing = new IntRing(new int[]{});
        assertArrayEquals(new int[]{}, intRing.getSource());
        assertEquals(0, intRing.getIdx());
    }

    @Test
    void vectorConUnNumero() {
        IntRing intRing = new IntRing(new int[]{1});
        assertArrayEquals(new int[]{1}, intRing.getSource());
        assertEquals(0, intRing.getIdx());
    }

    @Test
    void vectorConMasDeUnNumero() {
        IntRing intRing = new IntRing(new int[]{1,2,3});
        assertArrayEquals(new int[]{1,2,3}, intRing.getSource());
        assertEquals(0, intRing.getIdx());
    }

    @Test
    void cicloBasico(){
        IntRing intRing = new IntRing(new int[]{1,2,3});

        assertEquals(1, intRing.next());
        assertEquals(2, intRing.next());
        assertEquals(3, intRing.next());
        assertEquals(1, intRing.next());
    }

    @Test
    void cicloMultiple(){
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


