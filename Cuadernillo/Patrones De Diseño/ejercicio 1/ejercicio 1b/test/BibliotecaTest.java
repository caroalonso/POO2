package PatronesEjercicio1b;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Test
    public void testExportarSocios() throws ParseException {
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));
        // biblioteca.setExporter(new AdapterJackson());
        // biblioteca.setExporter(new AdapterJson());
        JSONParser parseo = new JSONParser();
        assertEquals(parseo.parse(this.salidaEsperada()),parseo.parse(this.biblioteca.exportarSocios()));
    }

    @Test
    public void testExportarSociosVacio() throws ParseException {
        biblioteca = new Biblioteca();
        JSONParser parseo = new JSONParser();
        assertEquals(parseo.parse("[]"),parseo.parse(this.biblioteca.exportarSocios()));
    }

    private String salidaEsperada() {
        return "[\n"
                + "  {\n"
                + "    \"nombre\": \"Arya Stark\",\n"
                + "    \"email\": \"needle@stark.com\",\n"
                + "    \"legajo\": \"5234-5\"\n"
                + "  },\n"
                + "  {\n"
                + "    \"nombre\": \"Tyron Lannister\",\n"
                + "    \"email\": \"tyron@thelannisters.com\",\n"
                + "    \"legajo\": \"2345-2\"\n"
                + "  }\n"
                + "]";
    }
}
