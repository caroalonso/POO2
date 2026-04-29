package PatronesEjercicio8State;

import java.time.Duration;

// CONCRETE STATE A
public class Pending extends State {

    public Pending(){}

    @Override
    public void star(ToDoItem item) {
        item.setFechaInicio();
        item.setState(new InProgress());
    }

    @Override
    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("La tarea no fue iniciada.");
    }

}
