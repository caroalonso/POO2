package PatronesEjercicio9Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//CONTEXT
public class Decodificador {

    private List<Pelicula> grillaDePeliculas;
    private List<Pelicula> peliculasReproducidas;
    private Configuracion  configuracionSugerencia;

    public Decodificador(Configuracion configuracionSugerencia) {
        this.grillaDePeliculas = new ArrayList<>();
        this.peliculasReproducidas = new ArrayList<>();
        this.configuracionSugerencia = configuracionSugerencia;
    }

    public void agregarPeliculaAGrilla(Pelicula pelicula) {
        this.grillaDePeliculas.add(pelicula);
    }

    public void agregarPeliculasReproducidad(Pelicula pelicula) {
        this.peliculasReproducidas.add(pelicula);
    }

    public List<Pelicula> getPeliculasReproducidas(){
        return this.peliculasReproducidas;
    }

    public void setConfiguracionSugerencia(Configuracion configuracionSugerencia) {
        this.configuracionSugerencia = configuracionSugerencia;
    }

    public List<Pelicula> peliculasSugeridas() {
        return this.configuracionSugerencia.sugerenciasDePeliculas(this);
    }

    public List<Pelicula> peliculasSinReproducirDeLaGrilla(){
        return this.grillaDePeliculas.stream()
                .filter(p->!this.peliculasReproducidas.contains(p))
                .collect(Collectors.toList());
    }
}
