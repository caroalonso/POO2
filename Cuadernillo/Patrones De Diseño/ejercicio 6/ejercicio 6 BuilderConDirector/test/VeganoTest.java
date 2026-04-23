package PatronesEjercicio6BuilderConDirector;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class VeganoTest {
    private Director director;
    private Vegano vegano;

    @Test
    void precioTotalSandwichVeganoConDirector() {
        director = new Director();
        vegano= new Vegano();
        assertEquals(620, director.construir(vegano).precioTotalDeSandwich(), 0.0001);
    }

}
