package PatronesEjercicio6BuilderSinDirector;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class VeganoTest {
    private Vegano vegano;

    @Test
    void precioTotalSandwichVeganoConDirector() {
        vegano= new Vegano();
        vegano.reset();
        vegano.agregarPan();;
        vegano.agregarAderezo();
        vegano.agregarPrincipal();
        vegano.agregarAdicional();
        assertEquals(620, vegano.getResultado().getPrecioTotalSandwich(), 0.0001);
    }

}
