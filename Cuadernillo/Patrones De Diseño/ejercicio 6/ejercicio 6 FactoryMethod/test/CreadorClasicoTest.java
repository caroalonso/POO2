package PatronesEjercicio6FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CreadorClasicoTest {
    private CreadorSandwich cs;
    private Sandwich s;

    @Test
    void precioTotalSandwichClasico() {
        cs = new CreadorClasico();
        s = cs.crear();
        assertEquals(500, s.pecioTotalDeSandwich(), 0.0001);
    }
}
