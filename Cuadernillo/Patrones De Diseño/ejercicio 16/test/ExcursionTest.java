package PatronesEjercicio16StateYTemplateMethod;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ExcursionTest {

    private Excursion excursion;
    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    @BeforeEach
    public void setUp() {

        excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                LocalDate.of(2026, 6, 10),
                LocalDate.of(2026, 6, 12),
                "Puerto de San Pedro",
                25000,
                1,
                2
        );

        usuario1 = new Usuario("Juan", "Alvarez", "juan@mail.com");
        usuario2 = new Usuario("Ana", "Perez", "ana@mail.com");
        usuario3 = new Usuario("Pedro", "Gomez", "pedro@mail.com");
    }

    @Test
    public void testSinInscriptos() {

        String esperado =
                "NOMBRE EXCURSION: Dos días en kayak bajando el Paraná\n"
                        + "COSTO EXCURSION: $25000\n"
                        + "FECHA INICIO EXCURSION: 2026-06-10\n"
                        + "FECHA FIN: 2026-06-12\n"
                        + "PUNTO DE ENCUENTRO: Puerto de San Pedro\n"
                        + "CANTIDAD PARA LLEGAR A CUPO MINIMO : 1";

        assertEquals(esperado, excursion.obtenerInformacion());
    }

    @Test
    public void testAlcanzarCupoMinimo() {

        excursion.inscribir(usuario1);
        String esperado =
                "NOMBRE EXCURSION: Dos días en kayak bajando el Paraná\n"
                        + "COSTO EXCURSION: $25000\n"
                        + "FECHA INICIO EXCURSION: 2026-06-10\n"
                        + "FECHA FIN: 2026-06-12\n"
                        + "PUNTO DE ENCUENTRO: Puerto de San Pedro\n"
                        + "CANTIDAD PARA LLEGAR A CUPO MAXIMO : 1\n"
                        + "MAILS:\n"
                        + "    juan@mail.com";

        assertEquals(esperado, excursion.obtenerInformacion());

    }

    @Test
    public void testCupoMaximo() {

        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);
        String esperado =
                "NOMBRE EXCURSION: Dos días en kayak bajando el Paraná\n"
                        + "COSTO EXCURSION: $25000\n"
                        + "FECHA INICIO EXCURSION: 2026-06-10\n"
                        + "FECHA FIN: 2026-06-12\n"
                        + "PUNTO DE ENCUENTRO: Puerto de San Pedro\n";

        assertEquals(esperado, excursion.obtenerInformacion());
    }

    @Test
    public void testListaEspera() {

        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);
        excursion.inscribir(usuario3);

        String esperado =
                "NOMBRE EXCURSION: Dos días en kayak bajando el Paraná\n"
                        + "COSTO EXCURSION: $25000\n"
                        + "FECHA INICIO EXCURSION: 2026-06-10\n"
                        + "FECHA FIN: 2026-06-12\n"
                        + "PUNTO DE ENCUENTRO: Puerto de San Pedro\n";

        assertEquals(esperado, excursion.obtenerInformacion());
    }
}
