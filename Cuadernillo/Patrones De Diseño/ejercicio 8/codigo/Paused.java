package PatronesEjercicio8State;

// CONCRETE STATE C
public class Paused extends State{

    public Paused(){}

    @Override
    public void togglePause(ToDoItem item) {
      item.setState(new InProgress());
    }

    @Override
    public void finish(ToDoItem item) {
      item.setFechaFin();
      item.setState(new Finished());
    }

}
