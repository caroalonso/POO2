package RefactoringEjercicio3PrimeraParte;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CharRingTest {

    private CharRing charRing;

    @Test
    void testVectorVacio() {
        CharRing charRing = new CharRing("");
        assertArrayEquals(new char[]{}, charRing.getSource());
        assertEquals(0, charRing.getIdx());
    }

    @Test
    void testVectorConUnCaracter() {
        CharRing charRing = new CharRing("x");
        assertArrayEquals(new char[]{'x'}, charRing.getSource());
        assertEquals(0, charRing.getIdx());
    }

    @Test
    void testVectorConMasDeUnCaracter() {
        CharRing charRing = new CharRing("caro");
        assertArrayEquals(new char[]{'c','a','r','o'}, charRing.getSource());
        assertEquals(0, charRing.getIdx());
    }

    @Test
    void testCicloBasico(){
        CharRing charRing = new CharRing("caro");

        assertEquals('c', charRing.next());
        assertEquals('a', charRing.next());
        assertEquals('r', charRing.next());
        assertEquals('o', charRing.next());
        assertEquals('c', charRing.next());
    }

    @Test
    void cicloMultiple(){
        CharRing charRing = new CharRing("caro");

        assertEquals('c', charRing.next());
        assertEquals('a', charRing.next());
        assertEquals('r', charRing.next());
        assertEquals('o', charRing.next());
        assertEquals('c', charRing.next());

        assertEquals('a', charRing.next());
        assertEquals('r', charRing.next());
        assertEquals('o', charRing.next());
        assertEquals('c', charRing.next());
    }
}
