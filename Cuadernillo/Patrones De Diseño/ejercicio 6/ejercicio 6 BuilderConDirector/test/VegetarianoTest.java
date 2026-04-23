package PatronesEjercicio6BuilderConDirector;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class VegetarianoTest {
    private Director director;
    private Vegetariano vegetariano;

    @Test
    void precioTotalSandwichVegatarianoConDirector() {
        director = new Director();
        vegetariano= new Vegetariano();
        assertEquals(420, director.construir(vegetariano).precioTotalDeSandwich(), 0.0001);
    }

}
