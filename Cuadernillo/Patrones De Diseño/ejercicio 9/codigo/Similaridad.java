package PatronesEjercicio9Strategy;

import java.util.List;
import java.util.stream.Collectors;

//CONCRETE STRATEGY C
public class Similaridad extends Configuracion {
    @Override
    public List<Pelicula> sugerenciasDePeliculas(Decodificador decodificador) {
        return this.masRecientes(
                decodificador.getPeliculasReproducidas().stream()
                .flatMap(p->p.getPeliculasSimilares().stream())
                .collect(Collectors.toList())
                 ).stream()
                .limit(CANTIDAD_DE_PELICULAS)
                .collect(Collectors.toList());
    }
}
