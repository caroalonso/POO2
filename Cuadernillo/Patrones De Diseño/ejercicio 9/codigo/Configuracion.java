package PatronesEjercicio9Strategy;

import java.util.List;
import java.util.stream.Collectors;

//STRATEGY
public abstract class Configuracion {

    protected final static int CANTIDAD_DE_PELICULAS = 3;

    public List<Pelicula> masRecientes(List<Pelicula> peliculas) {
        return peliculas.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
                .collect(Collectors.toList());
    }

    abstract List<Pelicula> sugerenciasDePeliculas(Decodificador decodificador);
}
