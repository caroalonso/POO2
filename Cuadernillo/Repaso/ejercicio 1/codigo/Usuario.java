package RepasoEjercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String userName;
    private List<Publicacion> publicaciones;

    public Usuario(String userName) {
        this.publicaciones = new ArrayList<>();
        this.userName = userName;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    public String getUserName() {
        return this.userName;
    }

    public void eliminarPublicaciones() {
        for (Publicacion p : publicaciones)
            p.eliminarLasReferenciasDeRetweets(); //1

        this.publicaciones.clear(); //2
    }

    // -------- < METODO UTIL PARA TEST > -----------

    public int cantidadPublicaciones() {
        return this.publicaciones.size();
    }
}
