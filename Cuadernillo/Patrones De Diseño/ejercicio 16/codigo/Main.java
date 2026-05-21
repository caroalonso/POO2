package PatronesEjercicio16StateYTemplateMethod;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                LocalDate.of(2026, 6, 10),
                LocalDate.of(2026, 6, 12),
                "Puerto de San Pedro",
                25000,
                1,
                2);

        Usuario usuario1 = new Usuario("Juan", "Alvarez","juan@mail.com");
        Usuario usuario2 = new Usuario("Ana","Perez" ,"ana@mail.com");
        Usuario usuario3 = new Usuario("Pedro","Gomez" ,"pedro@mail.com");

        System.out.println();
        System.out.println("<<INFO SIN CUPO MINIMO (0 USUARIOS)>>");
        System.out.println(excursion.obtenerInformacion());
        System.out.println();

        System.out.println();
        System.out.println("<<INFO CON CUPO MINIMO (1 USUARIOS)>>");
        excursion.inscribir(usuario1);
        System.out.println(excursion.obtenerInformacion());
        System.out.println();

        System.out.println();
        System.out.println("<<INFO CON MAXIMO (2 USUARIOS)>>");
        excursion.inscribir(usuario2);
        System.out.println(excursion.obtenerInformacion());

        System.out.println();
        System.out.println("<<INFO CUPO MAYOR AL MAXIMO , USUARIO EN ESPERA (3 USUARIOS)>>");
        excursion.inscribir(usuario3);
        System.out.println(excursion.obtenerInformacion());

    }
}
