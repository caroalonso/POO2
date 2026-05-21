package PatronesEjercicio16StateYTemplateMethod;

//CONCRETE STATE A - state
public class ExcursionProvisoria extends State{

    public ExcursionProvisoria(){}

    @Override
    public void inscribir(Usuario unUsuario, Excursion excursion) {
        excursion.agregarUsuarioAInscriptos(unUsuario);
        if(excursion.cupoMinimo())
            excursion.setState(new ExcursionDefinitiva());
    }

    @Override
    public String adicional(Excursion excursion){
        return "CANTIDAD PARA LLEGAR A CUPO MINIMO : " + excursion.cantidadFaltanteParaCupoMinimo();
    }

}
