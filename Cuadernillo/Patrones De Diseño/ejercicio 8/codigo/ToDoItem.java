package PatronesEjercicio8State;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//CONTEXT
public class ToDoItem {
    private String name;
    private State state;
    private List<String> comentarios;
    private LocalDateTime inicio;
    private LocalDateTime fin;

    public ToDoItem(String name) {
        this.name = name;
        this.comentarios = new ArrayList<>();
        this.state = new Pending();
    }

    public void agregarComentario(String comentario){
        this.comentarios.add(comentario);
    }

    public void setState(State estado) {
        this.state = estado;
    }

    public void setFechaInicio(){
        this.inicio=LocalDateTime.now();
    }

    public void setFechaFin (){
        this.fin= LocalDateTime.now();
    }

    public LocalDateTime getInicio(){
        return this.inicio;
    }

    public LocalDateTime getFin(){
        return this.fin;
    }

    public void start() {
        this.state.star(this);
    }

    public void togglePause() {
        this.state.togglePause(this);
    }

    public void finish() {
        this.state.finish(this);
    }

    public Duration workedTime() {
       return this.state.workedTime(this);
    }

    public void addComment(String comment) {
        this.state.addComment(this,comment);
    }
}
