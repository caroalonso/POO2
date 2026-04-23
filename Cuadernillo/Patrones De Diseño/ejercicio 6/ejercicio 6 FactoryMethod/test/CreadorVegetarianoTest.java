package PatronesEjercicio6FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CreadorVegetarianoTest {

    private CreadorSandwich cs;
    private Sandwich s;

    @Test
    void precioTotalSandwichVegetariano(){
        cs = new CreadorVegetariano();
        s = cs.crear();
        assertEquals(420,s.pecioTotalDeSandwich(),0.0001);
    }
}

