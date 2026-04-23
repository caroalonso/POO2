package PatronesEjercicio6FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CreadorVeganoTest {
    private CreadorSandwich cs;
    private Sandwich s;

    @Test
    void precioTotalSandwichVegano() {
        cs = new CreadorVegano();
        s = cs.crear();
        assertEquals(620, s.pecioTotalDeSandwich(), 0.0001);
    }
}
