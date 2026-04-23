package PatronesEjercicio6BuilderSinDirector;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ClasicoTest {
    private Clasico clasico;

    @Test
    void precioTotalSandwichClasicoConDirector() {
        Clasico clasico = new Clasico();
        clasico.reset();
        clasico.agregarPan();
        clasico.agregarAderezo();
        clasico.agregarPrincipal();
        clasico.agregarAdicional();
        assertEquals(500, clasico.getResultado().getPrecioTotalSandwich(), 0.0001);
    }
}


