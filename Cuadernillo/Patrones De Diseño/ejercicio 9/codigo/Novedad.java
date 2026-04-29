package PatronesEjercicio9Strategy;

import java.util.List;
import java.util.stream.Collectors;

//CONCRETE STRATEGY A
public class Novedad extends Configuracion{
    @Override
    public List<Pelicula> sugerenciasDePeliculas(Decodificador decodificador) {
        return this.masRecientes(decodificador.peliculasSinReproducirDeLaGrilla()).stream()
               .limit(CANTIDAD_DE_PELICULAS)
               .collect(Collectors.toList());
    }
}
