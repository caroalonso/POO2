package PatronesEjercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class EmpleadoPasanteTest {
    private EmpleadoPasante empleadoPasante;

    @Test
    void casadoSinExamenes() {
         empleadoPasante = new EmpleadoPasante(true, 1, 0);
        assertEquals(17400, empleadoPasante.sueldo(), 0.0001);
    }

    @Test
    void casadoUnExamen() {
         empleadoPasante = new EmpleadoPasante(true, 1, 1);
        assertEquals(18400, empleadoPasante.sueldo(), 0.0001);
    }

    @Test
    void casadoDosExamenes() {
         empleadoPasante = new EmpleadoPasante(true, 1, 2);
        assertEquals(19400, empleadoPasante.sueldo(), 0.0001);
    }

    @Test
    void solteroSinExamenes() {
         empleadoPasante = new EmpleadoPasante(false, 1, 0);
        assertEquals(17400, empleadoPasante.sueldo(), 0.0001);
    }

    @Test
    void solteroUnExamen() {
         empleadoPasante = new EmpleadoPasante(false, 1, 1);
        assertEquals(18400, empleadoPasante.sueldo(), 0.0001);
    }

    @Test
    void solteroDosExamenes() {
         empleadoPasante = new EmpleadoPasante(false, 1, 2);
        assertEquals(19400, empleadoPasante.sueldo(), 0.0001);
    }

}


