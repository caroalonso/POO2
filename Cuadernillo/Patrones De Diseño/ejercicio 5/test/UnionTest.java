package PatronesEjercicio5Composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class UnionTest {
    private TablaPeriodica tablaPeriodica;
    private Union union1;
    private Union union2;
    private Union union3;

    @BeforeEach
    void setUp() {
        tablaPeriodica = new TablaPeriodica();

        union1 = new Union();
        union1.add(tablaPeriodica.hidrogeno());
        union1.add(tablaPeriodica.oxigeno());
        union1.add(tablaPeriodica.hidrogeno());

        union2 = new Union();
        union2.add(tablaPeriodica.hidrogeno());
        union2.add(tablaPeriodica.oxigeno());
        union2.add(union1);

        union3 = new Union();
        union3.add(tablaPeriodica.oxigeno());
    }

    @Test
    void formulaDeUnion() {
        assertEquals("[H, O, [H, O, H]]", union2.formula());
    }

    @Test
    void pesoMolecularUnion() {
        assertEquals(18, union1.pesoMolecular());
    }

    @Test
    void cargaNegativaDeUnion() {
        assertEquals(-1, union2.carga());
    }

    @Test
    void cargaPositivaDeUnion() {
        assertEquals(-2, union3.carga());
    }

    @Test
    void unionCompatibleConAtomo() {
        assertTrue(union1.esValida(tablaPeriodica.hidrogeno()));
    }

    @Test
    void unionIncompatibleConAtomo() {
        Union u = new Union();
        u.add(tablaPeriodica.calsio());
        assertFalse(u.esValida(tablaPeriodica.sodio()));
    }

}
