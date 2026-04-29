package PatronesEjercicio8State;

import java.time.Duration;

// CONCRETE STATE D
public class Finished extends State {

    public Finished(){}

    @Override
    public void addComment(ToDoItem item, String comment) {
        // no hace nada.
    }

    @Override
    public Duration workedTime(ToDoItem item) {
        return Duration.between(item.getInicio(), item.getFin());
    }

}
