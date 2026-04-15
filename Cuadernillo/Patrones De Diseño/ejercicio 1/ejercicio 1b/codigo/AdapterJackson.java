package PatronesEjercicio1b;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

//ADAPTER
public class AdapterJackson implements Exporter {
    //ADAPTEE
    private ObjectMapper mapper= new ObjectMapper();

    @Override
    public String exportar(List<Socio> socios) {
        try{
            return mapper.writeValueAsString(socios);
        }catch (Exception e) {
            throw new RuntimeException("Error exportando con Jackson", e);
        }
    }
}
