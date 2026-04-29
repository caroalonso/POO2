package PatronesEjercicio8State;

import java.time.Duration;
import java.time.LocalDateTime;

//STATE
public abstract class State {
    public void star(ToDoItem item) {
        //no hace nada.
    }

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress.");
    }

    public void finish(ToDoItem item) {
        // no hace nada.
    }

    public Duration workedTime(ToDoItem item) {
        return Duration.between(item.getInicio(), LocalDateTime.now());
    }

    public void addComment(ToDoItem item,String comment){
         item.agregarComentario(comment);
    }

}
