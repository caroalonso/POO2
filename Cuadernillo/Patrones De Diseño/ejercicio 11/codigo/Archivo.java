package PatronesEjercicio11Composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//LEAF
public class Archivo extends FileSystem{
    private double tamanio;

    public Archivo(String nombre,LocalDate fechaCreacion,double tamanio){
        super(nombre,fechaCreacion);
        this.tamanio=tamanio;
    }

    @Override
    public double tamanoTotalOcupado(){
        return this.tamanio;
    }

    @Override
    public Archivo archivoMasGrande(){
        return this;
    }

    @Override
    public Archivo archivoMasNuevo(){
        return this;
    }

    @Override
    public FileSystem  buscar(String nombre){
        if(this.mismoNombre(nombre))
            return this;
        return null;
    }

    @Override
    public List<FileSystem> buscarTodos(String nombre) {
        List<FileSystem> resultado = new ArrayList<>();
        if(this.mismoNombre(nombre))
            resultado.add(this);
        return resultado;
    }

    @Override
    public String listadoDeContenido(String pathPadre){
        return pathPadre + "/" + this.getNombre();
    }

}
