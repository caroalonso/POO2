package RepasoEjercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RetweetTest {

    private Tweet tweet;
    private Retweet retweet;

    @Test
    public void testConstructorGuardaTweetOriginal() {
        Tweet tweet = new Tweet("Hola");
        Retweet retweet = new Retweet(tweet);
        assertTrue(retweet.tieneTweetOriginal());
    }

    @Test
    public void testQuitaReferenciaAlTweet() {
        Tweet tweet = new Tweet("Hola");
        Retweet retweet = new Retweet(tweet);
        assertTrue(retweet.tieneTweetOriginal());
        retweet.eliminar();
        assertFalse(retweet.tieneTweetOriginal());
    }
}