package PatronesEjercicio6FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CreadorSinTACCTest {
    private CreadorSandwich cs;
    private Sandwich s;

    @Test
    void precioTotalSandwichSinTACC() {
        cs = new CreadorSinTACC();
        s = cs.crear();
        assertEquals(618, s.pecioTotalDeSandwich(), 0.0001);
    }
}
