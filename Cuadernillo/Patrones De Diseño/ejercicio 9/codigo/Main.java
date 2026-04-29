package PatronesEjercicio9Strategy;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Thor",2007 ,7.9);

        Pelicula pelicula2= new Pelicula("Capitan America",2016,7.8);
        Pelicula pelicula3= new Pelicula("Iron man",2010,7.9);

        pelicula1.agregarPeliculaSimilar(pelicula2);
        pelicula1.agregarPeliculaSimilar(pelicula3);

        Pelicula pelicula4=new Pelicula("Dunkirk", 2017,7.9);

        Pelicula pelicula5= new Pelicula("Rocky", 1976,8.1);
        Pelicula pelicula6= new Pelicula("Rambo",  1979 ,7.8);

        pelicula5.agregarPeliculaSimilar(pelicula6);

        Decodificador decodificador=new Decodificador(new Novedad());
        decodificador.agregarPeliculasReproducidad(pelicula1);
        decodificador.agregarPeliculasReproducidad(pelicula5);

        decodificador.agregarPeliculaAGrilla(pelicula1);
        decodificador.agregarPeliculaAGrilla(pelicula2);
        decodificador.agregarPeliculaAGrilla(pelicula3);
        decodificador.agregarPeliculaAGrilla(pelicula4);
        decodificador.agregarPeliculaAGrilla(pelicula5);
        decodificador.agregarPeliculaAGrilla(pelicula6);

        System.out.println("<<CONFIGURACION NOVEDAD>>");
        System.out.println(decodificador.peliculasSugeridas());
        System.out.println();

        decodificador.setConfiguracionSugerencia(new Similaridad());
        System.out.println("<<CONFIGURACION SIMILARIDAD>>");
        System.out.println(decodificador.peliculasSugeridas());
        System.out.println();

        decodificador.setConfiguracionSugerencia(new Puntaje());
        System.out.println("<<CONFIGURACION PUNTAJE>>");
        System.out.println(decodificador.peliculasSugeridas());
    }
}
