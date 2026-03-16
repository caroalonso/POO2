package ejercicio2a;

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

   public abstract boolean leGanaA(Jugada jugada);
}
