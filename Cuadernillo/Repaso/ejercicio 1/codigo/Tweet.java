package RepasoEjercicio1;

import java.util.ArrayList;
import java.util.List;

public class Tweet extends Publicacion {

    private String texto;
    private List <Retweet> retweetsDeMisTweets;

    public Tweet(String texto){
        if (this.longitudInvalida(texto))
            throw new IllegalArgumentException("Largo de tweet invalido");
        this.texto = texto;
        this.retweetsDeMisTweets=new ArrayList<>();
    }

    public void agregarRetweet(Retweet reTweet){
        this.retweetsDeMisTweets.add(reTweet);
    }

    private boolean longitudInvalida(String texto){
        return texto.length() < 1 || texto.length() > 280;
    }

    @Override
    public String getTexto() {
        return this.texto;
    }

    @Override
    public void eliminarLasReferenciasDeRetweets() {
        for (Retweet retweet : retweetsDeMisTweets)
            retweet.eliminar(); //cada re-tweet borra la refencia al tweet original.

        this.retweetsDeMisTweets.clear(); // vacio coleccion de re-tweets
    }

}
