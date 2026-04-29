package PatronesEjercicio8State;

// CONCRETE STATE B
public class InProgress extends State {

    public InProgress(){}

    @Override
    public void togglePause(ToDoItem item) {
        item.setState(new Paused());
    }

    @Override
    public void finish(ToDoItem item) {
        item.setFechaFin();
        item.setState(new Finished());
    }

}
