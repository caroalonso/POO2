package PatronesEjercicio1b;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;

//ADAPTER
public class AdapterJson implements Exporter {

    //ADAPTEE
    private JSONArray jsonArray=new JSONArray();

    private Object crearJSONSocio (Socio socio){
        JSONObject objectJSON = new JSONObject();
        objectJSON.put("nombre",socio.getNombre());
        objectJSON.put("email",socio.getEmail());
        objectJSON.put("legajo",socio.getLegajo());
        return objectJSON;
    }

    @Override
    public String exportar (List<Socio> socios) {
        socios.stream().forEach(socio -> jsonArray.add(this.crearJSONSocio(socio)));
        return jsonArray.toJSONString();
    }

}
