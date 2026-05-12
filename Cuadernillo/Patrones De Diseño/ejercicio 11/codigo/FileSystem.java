package PatronesEjercicio11Composite;

import java.time.LocalDate;
import java.util.List;

//COMPONENT
public abstract class FileSystem {
    private String nombre;
    private LocalDate fechaCreacion;

    public FileSystem(String nombre,LocalDate fechaCreacion){
        this.nombre=nombre;
        this.fechaCreacion=fechaCreacion;
    }
    public  String getNombre(){
        return this.nombre;
    }

    public LocalDate getFechaCreacion(){
        return this.fechaCreacion;
    }
    public boolean mismoNombre(String nombre){
       return this.nombre.equals(nombre);
    }
    abstract double tamanoTotalOcupado();
    abstract Archivo archivoMasGrande();
    abstract Archivo archivoMasNuevo();
    abstract FileSystem buscar(String nombre);
    abstract List<FileSystem> buscarTodos(String nombre);
    abstract String listadoDeContenido(String padhPadre);

}
