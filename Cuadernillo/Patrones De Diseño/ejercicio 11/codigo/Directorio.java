package PatronesEjercicio11Composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//COMPOSITE
public class Directorio extends FileSystem {
    private final static double TAMANIO = 32;
    private List<FileSystem> fileSystem;

    public Directorio(String nombre,LocalDate fechaCreacion) {
        super(nombre,fechaCreacion);
        this.fileSystem = new ArrayList<>();
    }

    public void agregarFileSystem(FileSystem fileSystem) {
        this.fileSystem.add(fileSystem);
    }

    @Override
    public double tamanoTotalOcupado() {
        return this.fileSystem.stream()
                .mapToDouble(f -> f.tamanoTotalOcupado())
                .sum() + TAMANIO;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.fileSystem.stream()
                .map(f -> f.archivoMasGrande())
                .filter(f->f != null)
                .max((f1, f2) -> Double.compare(f1.tamanoTotalOcupado(), f2.tamanoTotalOcupado()))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.fileSystem.stream()
                .map(f -> f.archivoMasNuevo())
                .sorted((f1, f2) -> f2.getFechaCreacion().compareTo(f1.getFechaCreacion()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public FileSystem buscar(String nombre) {
        if (this.mismoNombre(nombre))
            return this;
        return this.fileSystem.stream()
                .map(f -> f.buscar(nombre))
                .filter(f -> f != null)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<FileSystem> buscarTodos(String nombre) {

        List<FileSystem> resultado = this.fileSystem.stream()
                .flatMap(f->f.buscarTodos(nombre).stream())
                .collect(Collectors.toList());

        if(this.mismoNombre(nombre))
            resultado.add(this);

        return resultado;
    }

    @Override
    public String listadoDeContenido(String padhPadre) {

        String padhActual = padhPadre + "/" + this.getNombre();

         return padhActual + "\n" +
                 this.fileSystem.stream()
                .map(f->f.listadoDeContenido(padhActual))
                .collect(Collectors.joining("\n"));
    }

    public int cantidadDeElementos(){
        return this.fileSystem.size();
    }

}
