package PatronesEjercicio11;

import PatronesEjercicio11Composite.Archivo;
import PatronesEjercicio11Composite.FileSystem;
import org.junit.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.Assert.*;

public class ArchivoTest {

    @Test
    public void testTamanoTotalOcupado() {
        Archivo arc1 = new Archivo("arc1", LocalDate.now(), 10);
        assertEquals(10, arc1.tamanoTotalOcupado(),0.0001);
    }

    @Test
    public void testArchivoMasGrande() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        assertEquals(arc1, arc1.archivoMasGrande());
    }

    @Test
    public void testArchivoMasNuevo() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        assertEquals(arc1, arc1.archivoMasNuevo());
    }

    @Test
    public void testBuscarNombreExistente() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        assertEquals(arc1, arc1.buscar("arc1"));
    }

    @Test
    public void testBuscarNombreInexistente() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        assertNull(arc1.buscar("arch2"));
    }

    @Test
    public void testBuscarTodosLosNombresExistente() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        List<FileSystem> resultado = arc1.buscarTodos("arc1");
        assertEquals(1, resultado.size());
        assertTrue(resultado.contains(arc1));
    }

    @Test
    public void testBuscarTodosInexistente() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        List<FileSystem> resultado = arc1.buscarTodos("arc2");
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testListadoDeContenido() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now(), 10);
        assertEquals("/arc1", arc1.listadoDeContenido(""));
    }
}
