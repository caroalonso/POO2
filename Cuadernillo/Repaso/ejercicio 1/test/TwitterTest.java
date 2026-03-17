package RepasoEjercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwitterTest {

    private Twitter twitter;
    private String userName;

    @BeforeEach
    public void setUp(){
        twitter= new Twitter();
        userName="caro";
    }


    @Test
    public void agregarUsuarioValido() {
        twitter.agregarUsuario(userName);
        assertTrue(twitter.existeUsuario(userName));
     }


     @Test
    public void agregarUsuarioInvalido(){
         twitter.agregarUsuario(userName); // 1° vez
         IllegalArgumentException exception= assertThrows(IllegalArgumentException.class, () -> twitter.agregarUsuario(userName)); // 2° vez
         assertEquals("El usuario " + userName + " ya existe", exception.getMessage());
     }


    @Test
    public void noExisteUsuario() {
        assertFalse(twitter.existeUsuario(userName));
    }


    @Test
    public void existeUsuario() {
        twitter.agregarUsuario(userName);
        twitter.existeUsuario(userName);
        assertTrue(twitter.existeUsuario(userName));
    }


    @Test
    public void eliminacionDeUsuarioValido(){
        twitter.agregarUsuario(userName);
        assertTrue(twitter.existeUsuario(userName));
        twitter.eliminarUsuario(userName);
        assertFalse(twitter.existeUsuario(userName));
    }


    @Test
    public void eliminacionDeUsuarioInvalido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> twitter.eliminarUsuario(userName));
        assertEquals("El usuario " + userName + " no existe", exception.getMessage());
    }

}

