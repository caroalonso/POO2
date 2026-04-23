package PatronesEjercicio6BuilderConDirector;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ClasicoTest {
private Director director;
private Clasico clasico;

@Test
void precioTotalSandwichClasicoConDirector() {
    director = new Director();
    clasico = new Clasico();
    assertEquals(500, director.construir(clasico).precioTotalDeSandwich(), 0.0001);
 }
}
