package PatronesEjercicio11;

import PatronesEjercicio11Composite.Archivo;
import PatronesEjercicio11Composite.Directorio;
import PatronesEjercicio11Composite.FileSystem;
import org.junit.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.Assert.*;

public class DirectorioTest {

    @Test
    public void conElementosExistentesEnFileSystem(){
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        Directorio dir2 = new Directorio("dir2", LocalDate.now());
        Archivo arc1= new Archivo("arc1",LocalDate.now(),10);
        dir1.agregarFileSystem(dir2);
        dir1.agregarFileSystem(arc1);
        assertEquals(2,dir1.cantidadDeElementos());
    }

    @Test
    public void sinElementosExistentesEnFileSystem(){
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        assertEquals(0,dir1.cantidadDeElementos());
    }

    @Test
    public void testTamanoTotalOcupadoDeDirectorioSinElementos() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        assertEquals(32, dir1.tamanoTotalOcupado(),0.0001);

    }

    @Test
    public void testTamanoTotalOcupadoDirectorioConUnElemento() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        Archivo arc1 = new Archivo("arc1",LocalDate.now(),10);
        dir1.agregarFileSystem(arc1);
        assertEquals(42, dir1.tamanoTotalOcupado(),0.0001);

    }

    @Test
    public void testArchivoMasNuevoExistente() {
        Archivo arc1 = new Archivo("arc1",LocalDate.now().minusDays(5), 10);
        Archivo arc2 = new Archivo("arc2",LocalDate.now().minusDays(10), 10);
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        dir1.agregarFileSystem(arc1);
        dir1.agregarFileSystem(arc2);
        assertEquals(arc1, arc1.archivoMasNuevo());
    }

    @Test
    public void testArchivoMasNuevoInexistente() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        assertNull( dir1.archivoMasNuevo());
    }

    @Test
    public void testBuscarNombreExistente() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        Archivo arc1 = new Archivo("arc1", LocalDate.now(), 10);
        Archivo arc2 = new Archivo("arc2", LocalDate.now(), 20);
        dir1.agregarFileSystem(arc1);
        dir1.agregarFileSystem(arc2);
        assertEquals(arc2, dir1.buscar("arc2"));
    }

    @Test
    public void testBuscarNombreInexistente() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        Archivo arc1 = new Archivo("arc1", LocalDate.now(), 10);
        dir1.agregarFileSystem(arc1);
        assertNull(dir1.buscar("arc3"));
    }

    @Test
    public void testBuscarNombresExistente() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        Archivo arc1 = new Archivo("arc1", LocalDate.now(), 10);
        Archivo arc2 = new Archivo("arc1", LocalDate.now(), 20);
        dir1.agregarFileSystem(arc1);
        dir1.agregarFileSystem(arc2);
        List<FileSystem> resultado = dir1.buscarTodos("arc1");
        assertEquals(2, resultado.size());
        assertTrue(resultado.contains(arc1));
        assertTrue(resultado.contains(arc2));
    }

    @Test
    public void testBuscarNombresInexistente() {
        Directorio dir1 = new Directorio("dir1", LocalDate.now());
        Archivo arc1 = new Archivo("arc1", LocalDate.now(), 10);
        dir1.agregarFileSystem(arc1);
        List<FileSystem> resultado = dir1.buscarTodos("arc3");
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testListadoDeContenido() {
        String path ="/dir1\n" +
                "/dir1/arc1\n" +
                "/dir1/arc2\n" +
                "/dir1/dir2\n";

        Archivo arc1 = new Archivo("arc1",LocalDate.now(),10);
        Archivo arc2 = new Archivo("arc2",LocalDate.now(),20);
        Directorio dir1 = new Directorio("dir1",LocalDate.now());
        Directorio dir2 = new Directorio("dir2",LocalDate.now());
        dir1.agregarFileSystem(arc1);
        dir1.agregarFileSystem(arc2);
        dir1.agregarFileSystem(dir2);

        assertEquals(path,dir1.listadoDeContenido(""));
    }

}
