package PatronesEjercicio11Composite;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Archivo arc1 = new Archivo("arc1",LocalDate.now(),10);
        Archivo arc2= new Archivo("arc2",LocalDate.now(),20);

        Directorio dir1 = new Directorio("dir1",LocalDate.now());
        dir1.agregarFileSystem(arc1);

        //test tamanoTotalOcupado()
        System.out.println("tamaño total ocupado de archivo: " + arc1.tamanoTotalOcupado()); //10
        System.out.println("tamaño total ocupado de directorio: " + dir1.tamanoTotalOcupado()); //42

        System.out.println();

        Directorio dir2 = new Directorio("dir2",LocalDate.now());
        dir1.agregarFileSystem(arc2);
        dir1.agregarFileSystem(dir2);

        //test archivoMasGrande()
        System.out.println("archivo mas grande : " + arc1.archivoMasGrande().getNombre()); //arc1
        Archivo resultado1 = dir1.archivoMasGrande();
        System.out.println( resultado1 != null ? "archivo mas grande : " + resultado1.getNombre() : "No existe ningun Archivo");

        System.out.println();

        Archivo arc3 = new Archivo("arc3",LocalDate.now().minusDays(5),10);
        Archivo arc4 = new Archivo("arc4",LocalDate.now().minusDays(10),10);
        Directorio dir3 = new Directorio("dir3",LocalDate.now());
        dir3.agregarFileSystem(arc3);
        dir3.agregarFileSystem(arc4);

        //test archivoMasNuevo()
        System.out.println("archivo mas nuevo : " + arc3.archivoMasNuevo().getNombre());//arc3
        System.out.println("archivo mas nuevo de todo el directorio : " + dir3.archivoMasGrande().getNombre());//arc3

        System.out.println();

        //test buscar(String nombre)
        String nombreAbuscar = "arc3";
        FileSystem resultado = dir1.buscar(nombreAbuscar);
        System.out.println( resultado != null ? "Existe el nombre : " + resultado.getNombre() : "No existe el nombre: " + nombreAbuscar);//no existe

        System.out.println();

        Archivo arc5= new Archivo("dir3",LocalDate.now(),10);
        dir3.agregarFileSystem(arc5);
        nombreAbuscar ="dir3";
        List<FileSystem> resultado2 = dir3.buscarTodos(nombreAbuscar);
        if(!resultado2.isEmpty()){
            System.out.print ("lista de nombres " + nombreAbuscar + " existentes: ");
            for (FileSystem r : resultado2)
                System.out.print( r.getNombre()+" , ");
        }else{
            System.out.println ("No existe el nombre: " + nombreAbuscar);
        }

        System.out.println();
        System.out.println();

        //test listadoDeContenido(String padhPadre)
        System.out.println(dir1.listadoDeContenido(""));

    }
}

