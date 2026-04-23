package PatronesEjercicio6BuilderSinDirector;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class SinTACCTest {
private SinTACC sinTACC;

    @Test
    void precioTotalSandwichSinTACCConDirector() {
        SinTACC sinTACC= new SinTACC();
        sinTACC.reset();
        sinTACC.agregarPan();;
        sinTACC.agregarAderezo();
        sinTACC.agregarPrincipal();
        sinTACC.agregarAdicional();
        assertEquals(618, sinTACC.getResultado().getPrecioTotalSandwich(), 0.0001);
    }
}
