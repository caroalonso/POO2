package RefactoringEjercicio3SegundaParte;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CharRingTest {

    @Test
    void vectorVacio() {
        CharRing charRing = new CharRing("");
        assertArrayEquals(new char[]{}, charRing.getSource());
        assertEquals(0, charRing.getIdx());
    }

    @Test
    void vectorConUnCaracter() {
        CharRing charRing = new CharRing("x");
        assertArrayEquals(new char[]{'x'}, charRing.getSource());
        assertEquals(0, charRing.getIdx());
    }

    @Test
    void vectorConMasDeUnCaracter() {
        CharRing charRing = new CharRing("caro");
        assertArrayEquals(new char[]{'c','a','r','o'}, charRing.getSource());
        assertEquals(0, charRing.getIdx());
    }

    @Test
    void cicloBasico(){
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
