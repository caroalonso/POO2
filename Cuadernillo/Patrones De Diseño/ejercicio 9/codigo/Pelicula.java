package PatronesEjercicio9Strategy;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String titulo;
    private int anioEstreno;
    private double puntaje;
    private List<Pelicula> peliculasSimilares;

    public Pelicula (String titulo,int anioEstreno, double puntaje){
        this.peliculasSimilares=new ArrayList<>();
        this.titulo=titulo;
        this.anioEstreno=anioEstreno;
        this.puntaje=puntaje;
    }

    public void agregarPeliculaSimilar(Pelicula pelicula){
        this.peliculasSimilares.add(pelicula);
        pelicula.agregarSimilar2(this);
    }

    public void agregarSimilar2(Pelicula pelicula){
        this.peliculasSimilares.add(pelicula);
    }

    public List<Pelicula> getPeliculasSimilares(){
        return this.peliculasSimilares;
    }

    public int getAnioEstreno(){
        return this.anioEstreno;
    }

    public double getPuntaje(){
        return this.puntaje;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

}
