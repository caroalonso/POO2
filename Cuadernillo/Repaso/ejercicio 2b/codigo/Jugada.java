package ejercicio2b;

public abstract class Jugada {

   public boolean pierdeContraPapel() {
      return false;
   }

   public boolean pierdeContraPiedra() {
      return false;
   }

   public boolean pierdeContraTijera() {
      return false;
   }

   public boolean pierdeContraLagarto() {
      return false;
   }

   public boolean pierdeContraSpock() {
      return false;
   }

   abstract boolean leGanaA(Jugada jugada);


}
