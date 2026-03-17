package RepasoEjercicio1;

public class Retweet extends Publicacion {

    private Tweet tweet;

    public Retweet(Tweet tweet) {
        this.tweet = tweet; // guarda la referencia del tweet original dentro del objeto Retweet nuevo.
        tweet.agregarRetweet(this); // el tweet original agregá el nuevo retweet a su colección de retweets.
    }

    public void eliminar(){
        this.tweet= null; // eliminacion de referencia del tweet.
    }

    @Override
    public String getTexto(){
        return this.tweet.getTexto();
    }

    @Override
    public void eliminarLasReferenciasDeRetweets(){}

}
