package PatronesEjercicio16StateYTemplateMethod;

//CONCRETE STATE C - state
public class ExcursionEnEspera extends State{

    public ExcursionEnEspera(){}

    @Override
    public void inscribir(Usuario unUsuario, Excursion excursion) {
         excursion.agregarUsuarioAlistaEspera(unUsuario);
    }

    @Override
    public String adicional(Excursion excursion) {
        return "";
    }

}
