package RepasoEjercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TweetTest {

    private Tweet tweet;
    private Retweet retweet;

    @Test
    public void tweetLonguitudLimiteInferiorInvalido(){
        String texto = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Tweet(texto));
        assertEquals("Largo de tweet invalido", exception.getMessage());
    }

    @Test
    public void tweetLonguitudInferiorValida(){
        String texto = "a";
        Tweet tweet = new Tweet(texto);
        assertEquals(texto, tweet.getTexto());
    }

   @Test
   public void tweetLonguitudSuperiorValida(){
       String texto = "a".repeat(280);
       Tweet tweet = new Tweet(texto);
       assertEquals(texto, tweet.getTexto());
   }


    @Test
    public void tweetLonguitudSuperiorInvalido(){
        String texto = "a".repeat(281);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Tweet(texto));
        assertEquals("Largo de tweet invalido", exception.getMessage());
    }


   @Test
    public void agregarReTweet(){
       Tweet tweet = new Tweet("hola");
       Retweet retweet= new Retweet(tweet); // se instancia retweet y se agrega a colecicon de tweet(retweetsDeMisTweets).
       assertEquals(1,tweet.cantidadDeRetweets());
   }

    @Test
    public void agregarMasDeUnReTweet(){
        Tweet tweet = new Tweet("hola");
        Retweet retweet= new Retweet(tweet);
        Retweet retweet2 = new Retweet(tweet);
        assertEquals(2,tweet.cantidadDeRetweets());
    }

    @Test
    public void eliminarReferenciasDeRetweets(){
        Tweet tweet = new Tweet("hola");
        Retweet retweet1 = new Retweet(tweet);
        Retweet retweet2 = new Retweet(tweet);
        assertEquals(2, tweet.cantidadDeRetweets());
        tweet.eliminarLasReferenciasDeRetweets();
        assertEquals(0, tweet.cantidadDeRetweets());
    }

}