package PatronesEjercicio12Strategy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Flexible flexible =new Flexible();
        AutoEnAlquiler autoEnAlquiler= new AutoEnAlquiler(5000,4,"Ford",flexible);

        Usuario usuario= new Usuario("Juan");
        Reserva reserva =new Reserva(usuario,autoEnAlquiler,4, LocalDate.now().plusDays(2));
        usuario.agregarReserva(reserva);

        System.out.println( "Monto de reembolso para politica Flexible : $ " + reserva.montoAreembolsar(LocalDate.now()));

        Moderada moderada = new Moderada();
        autoEnAlquiler.setPoliticaCancelacion(moderada);

        System.out.println( "Monto de reembolso para politica Moderada : $ " + reserva.montoAreembolsar(LocalDate.now()));

    }
}
