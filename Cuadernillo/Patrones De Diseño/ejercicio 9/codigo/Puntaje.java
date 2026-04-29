package PatronesEjercicio9Strategy;

import java.util.List;
import java.util.stream.Collectors;

//CONCRETE STRATEGY B
public class Puntaje extends Configuracion {

    @Override
    public List<Pelicula> sugerenciasDePeliculas(Decodificador decodificador) {
        return decodificador.peliculasSinReproducirDeLaGrilla().stream()
               .sorted((p1, p2) ->
               { if(Double.compare( p2.getPuntaje(), p1.getPuntaje()) == 0)
                    return Integer.compare( p2.getAnioEstreno(), p1.getAnioEstreno());
                 return Double.compare(p2.getPuntaje(), p1.getPuntaje());
                })
               .limit(CANTIDAD_DE_PELICULAS)
               .collect(Collectors.toList());
    }
}

// Valor retorno de compare:
// = 0  p1 y p2 mismo puntaje.
// < 0  p1 mayor puntaje que p2.
// > 0  p1 menor puntaje que p2.
