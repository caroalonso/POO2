package PatronesEjercicio15;

//CONTEXT - strategy
//CLIENT - adapter
public class Mensajero {
    private Cifrado cifrado;

    public Mensajero (Cifrado cifrado){
        this.cifrado=cifrado;
    }

    public void setCifrado (Cifrado cifrado){
        this.cifrado=cifrado;
    }

    public String enviar (String mensaje){
       return this.cifrado.encriptar(mensaje);
    }

    public String recibir (String mensaje){
        return this.cifrado.desencriptar(mensaje);
    }

}
