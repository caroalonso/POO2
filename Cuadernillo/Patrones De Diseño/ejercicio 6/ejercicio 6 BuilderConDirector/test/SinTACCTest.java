package PatronesEjercicio6BuilderConDirector;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class SinTACCTest {
    private Director director;
    private SinTACC sinTACC;

    @Test
    void precioTotalSandwichSinTACCConDirector() {
        director = new Director();
        sinTACC = new SinTACC();
        assertEquals(618, director.construir(sinTACC).precioTotalDeSandwich(), 0.0001);
    }
}

