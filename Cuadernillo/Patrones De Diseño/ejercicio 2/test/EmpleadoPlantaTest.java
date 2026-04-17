package PatronesEjercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class EmpleadoPlantaTest {
    private EmpleadoPlanta empleadoPlanta;

    @Test
    void casadoHijos0() {
        empleadoPlanta = new EmpleadoPlanta(true, 0, 0);
        assertEquals(46000, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void casadoHijos1() {
        empleadoPlanta = new EmpleadoPlanta(true, 1, 0);
        assertEquals(47000, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void casadoHijos2() {
        empleadoPlanta = new EmpleadoPlanta(true, 2, 0);
        assertEquals(48000, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void solteroHijos0() {
        empleadoPlanta = new EmpleadoPlanta(false, 0, 0);
        assertEquals(43500, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void solteroHijos1() {
        empleadoPlanta = new EmpleadoPlanta(false, 1, 0);
        assertEquals(44500, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void solteroHijos2() {
       empleadoPlanta = new EmpleadoPlanta(false, 2, 0);
        assertEquals(45500, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void casadoAntiguedad1() {
        EmpleadoPlanta e = new EmpleadoPlanta(true, 1, 1);
        assertEquals(48000, e.sueldo(), 0.0001);
    }

    @Test
    void casadoAntiguedad10() {
        empleadoPlanta = new EmpleadoPlanta(true, 1, 10);
        assertEquals(57000, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void solteroAntiguedad1() {
        empleadoPlanta= new EmpleadoPlanta(false, 1, 1);
        assertEquals(45500, empleadoPlanta.sueldo(), 0.0001);
    }

    @Test
    void solteroAntiguedad10() {
        empleadoPlanta= new EmpleadoPlanta(false, 1, 10);
        assertEquals(54500, empleadoPlanta.sueldo(), 0.0001);
    }
}
