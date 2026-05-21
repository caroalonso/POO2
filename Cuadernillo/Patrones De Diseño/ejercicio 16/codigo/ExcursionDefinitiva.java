package PatronesEjercicio16StateYTemplateMethod;

//CONCRETE STATE B - state
public class ExcursionDefinitiva extends State{

    public ExcursionDefinitiva(){}

    @Override
    public void inscribir(Usuario unUsuario, Excursion excursion) {
        excursion.agregarUsuarioAInscriptos(unUsuario);
        if(excursion.cupoCompleto())
            excursion.setState(new ExcursionEnEspera());
    }

    @Override
    public String adicional(Excursion excursion){
        return "CANTIDAD PARA LLEGAR A CUPO MAXIMO : " + excursion.cantidadFaltanteParaCupoMaximo() + excursion.infoEmailsUsuarios();
    }

}
