package PatronesEjercicio16StateYTemplateMethod;

//STATE - state
public abstract class State {

    public abstract String adicional(Excursion excursion);

    //Template Method
    public String informacion(Excursion excursion){
        return excursion.infoExcursion() + "\n"
                + adicional(excursion);
    }

    abstract public void inscribir(Usuario unUsuario,Excursion excursion);

}
