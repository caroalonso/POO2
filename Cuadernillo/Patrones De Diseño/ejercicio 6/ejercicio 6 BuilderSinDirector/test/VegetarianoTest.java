package PatronesEjercicio6BuilderSinDirector;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class VegetarianoTest {
    private Vegetariano vegetariano;

    @Test
    void precioTotalSandwichVegetarianoConDirector() {
        vegetariano= new Vegetariano();
        vegetariano.reset();
        vegetariano.agregarPan();;
        vegetariano.agregarAderezo();
        vegetariano.agregarPrincipal();
        vegetariano.agregarAdicional();
        assertEquals(420, vegetariano.getResultado().getPrecioTotalSandwich(), 0.0001);
    }

}
