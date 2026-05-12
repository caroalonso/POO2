package PatronesEjercicio12Strategy;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Reserva> reservasDeAutos;

   public Usuario(String nombre){
       this.nombre= nombre;
       this.reservasDeAutos= new ArrayList<>();
   }

   public void agregarReserva(Reserva reserva){
       this.reservasDeAutos.add(reserva);
   }

}
