package PatronesEjercicio1b;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
    //------------------ VOORHEES EXPORTER ----------------------//

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",
                "2345-2"));
        System.out.println("<<USO DE VOORHEES EXPORTER>>");
        System.out.println(biblioteca.exportarSocios());

    //------------------ LIBRERIA JSON ----------------------//

        System.out.println("<<USO DE LIBRERIA JSON>>");
        AdapterJson adapterJson = new AdapterJson();
        biblioteca.setExporter(adapterJson);
        System.out.println(biblioteca.exportarSocios());

    //------------------ LIBRERIA JACKSON ----------------------//

        System.out.println("<<USO DE LIBRERIA JACKSON>>");
        AdapterJackson adapterJackson = new AdapterJackson();
        biblioteca.setExporter(adapterJackson);
        System.out.println(biblioteca.exportarSocios());

    }
}
