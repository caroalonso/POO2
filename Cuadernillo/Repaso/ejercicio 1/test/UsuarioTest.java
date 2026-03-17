package RepasoEjercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;
    private Tweet tweet;
    private Retweet retweet;

    @BeforeEach
    public void setUp(){
        usuario= new Usuario("caro");
        tweet= new Tweet("hola");
        retweet= new Retweet(tweet);
    }

    @Test
    public void agregarPublicacion(){
        assertEquals(0,usuario.cantidadPublicaciones());
        usuario.agregarPublicacion(tweet);
        assertEquals(1,usuario.cantidadPublicaciones());
    }


    @Test
    public void agregarDiferentesPublicaciones(){
        usuario.agregarPublicacion(tweet);
        usuario.agregarPublicacion(retweet);
        assertEquals(2, usuario.cantidadPublicaciones());
    }


    @Test
    public void eliminarPublicaciones(){
        usuario.agregarPublicacion(tweet);
        usuario.agregarPublicacion(retweet);
        assertEquals(2,usuario.cantidadPublicaciones());
        usuario.eliminarPublicaciones();
        assertEquals(0,usuario.cantidadPublicaciones());
    }


    @Test
    public void eliminarPublicacionesSinPublicaciones(){
        assertEquals(0, usuario.cantidadPublicaciones());
        usuario.eliminarPublicaciones();
        assertEquals(0, usuario.cantidadPublicaciones());
    }

}