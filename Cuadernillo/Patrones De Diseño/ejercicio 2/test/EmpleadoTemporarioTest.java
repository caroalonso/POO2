package PatronesEjercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class EmpleadoTemporarioTest {
    private  EmpleadoTemporario empleadoTemporario;

    @Test
    void casadoHijos0Horas0() {
        empleadoTemporario = new EmpleadoTemporario(true, 0, 0);
        assertEquals(19900, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void casadoHijos1Horas0() {
        empleadoTemporario = new EmpleadoTemporario(true, 1, 0);
        assertEquals(20900, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void casadoHijos2Horas0() {
        empleadoTemporario = new EmpleadoTemporario(true, 2, 0);
        assertEquals(21900, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void solteroHijos0Horas0() {
        empleadoTemporario = new EmpleadoTemporario(false, 0, 0);
        assertEquals(17400, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void solteroHijos1Horas0() {
        empleadoTemporario = new EmpleadoTemporario(false, 1, 0);
        assertEquals(18400, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void solteroHijos2Horas0() {
        empleadoTemporario = new EmpleadoTemporario(false, 2, 0);
        assertEquals(19400, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void casadoHoras1() {
        empleadoTemporario = new EmpleadoTemporario(true, 1, 1);
        assertEquals(21161, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void casadoHoras10() {
        empleadoTemporario= new EmpleadoTemporario(true, 1, 10);
        assertEquals(23510, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void solteroHoras1() {
        empleadoTemporario = new EmpleadoTemporario(false, 1, 1);
        assertEquals(18661, empleadoTemporario.sueldo(), 0.0001);
    }

    @Test
    void solteroHoras10() {
        empleadoTemporario = new EmpleadoTemporario(false, 1, 10);
        assertEquals(21010, empleadoTemporario.sueldo(), 0.0001);
    }
}

