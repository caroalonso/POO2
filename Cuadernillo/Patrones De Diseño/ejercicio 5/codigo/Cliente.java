package PatronesEjercicio5Composite;

public class Cliente {

    private TablaPeriodica tabla= new TablaPeriodica();

    public Cliente(){}

    public Union agua(){
        return (tabla.oxigeno().add(tabla.hidrogeno()).add(tabla.hidrogeno()));
    }

}
