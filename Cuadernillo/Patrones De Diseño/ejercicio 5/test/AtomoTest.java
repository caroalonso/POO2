package PatronesEjercicio5Composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AtomoTest {

    private TablaPeriodica tablaPeriodica;

    @BeforeEach
    void setUp() {
        tablaPeriodica = new TablaPeriodica();
    }

    @Test
    void formulaAtomo() {
        assertEquals("H", tablaPeriodica.hidrogeno().formula());
    }

    @Test
    void pesoMolecularAtomo() {
        assertEquals(35, tablaPeriodica.cloro().pesoMolecular());
    }

    @Test
    void cargaPositiva() {
        assertEquals(1, tablaPeriodica.sodio().carga());
    }

    @Test
    void cargaNegativa() {
        assertEquals(-2, tablaPeriodica.oxigeno().carga());
    }

    @Test
    void atomosCompatibles() {
        Atomo oxigeno = (Atomo) tablaPeriodica.oxigeno();
        assertTrue(tablaPeriodica.oxigeno().compatibleConAtomo(oxigeno));
    }

    @Test
    void atomosNoCompatibles() {
        Atomo calcio = (Atomo) tablaPeriodica.calsio();
        assertTrue(tablaPeriodica.oxigeno().compatibleConAtomo(calcio));
    }
}

