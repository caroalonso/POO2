package PatronesEjercicio16StateYTemplateMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoDeEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private List<Usuario> inscriptos;
    private List<Usuario> listaEspera;
    private State stateExcursion;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoDeEncuentro = puntoDeEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.inscriptos = new ArrayList<>();
        this.listaEspera= new ArrayList<>();
        this.stateExcursion = new ExcursionProvisoria();
    }

    public void setState(State estadoExcursion) {
        this.stateExcursion = estadoExcursion;
    }

    public void inscribir(Usuario unUsuario){
        this.stateExcursion.inscribir(unUsuario,this);
    }

    public String obtenerInformacion(){
        return this.stateExcursion.informacion(this);
    }

    public boolean cupoMinimo(){
        return this.inscriptos.size() == this.cupoMinimo;
    }

    public boolean cupoCompleto(){
        return this.inscriptos.size() == this.cupoMaximo;
    }

    public void agregarUsuarioAInscriptos(Usuario unUsuario){
        this.inscriptos.add(unUsuario);
    }

    public void agregarUsuarioAlistaEspera(Usuario unUsuario){
        this.inscriptos.add(unUsuario);
    }
    public int cantidadFaltanteParaCupoMinimo() {
        return Math.max(0, this.cupoMinimo - this.inscriptos.size());
    }

    public int cantidadFaltanteParaCupoMaximo() {
        return Math.max(0, this.cupoMaximo - this.inscriptos.size());
    }

    public String infoExcursion(){
        return "NOMBRE EXCURSION: " +this.nombre + "\n"
             + "COSTO EXCURSION: $" + String.format("%.0f", this.costo) + "\n"
             + "FECHA INICIO EXCURSION: " + this.fechaInicio + "\n"
             + "FECHA FIN: " + this.fechaFin + "\n"
             + "PUNTO DE ENCUENTRO: " + this.puntoDeEncuentro;
    }

    public String infoEmailsUsuarios() {
        return  "\n" + this.inscriptos.stream()
                .map(Usuario::getEmail)
                .collect(Collectors.joining(
                        "\n    ",
                        "MAILS:\n    ",
                        ""
                ));
    }

}
