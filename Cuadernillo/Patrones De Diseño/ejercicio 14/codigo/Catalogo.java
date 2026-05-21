package PatronesEjercicio14Builder;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List <Componente> componentes;

    public Catalogo (){
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente (Componente componente){
        this.componentes.add(componente);
    }

    public Componente getComponente (String descripcion) {
        return this.componentes.stream()
                .filter(c -> c.getDescripcion().equals(descripcion))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Componente no encontrado: " + descripcion));

    }

}
