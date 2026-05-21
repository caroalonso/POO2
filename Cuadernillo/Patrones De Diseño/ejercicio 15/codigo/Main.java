package PatronesEjercicio15;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        AdapterFeistelCipher adapterFeistelCipher = new AdapterFeistelCipher("123");
        Mensajero mensajero = new Mensajero(adapterFeistelCipher);

        String mensaje = "Hola";
        String mensajeEncriptado = mensajero.enviar(mensaje);
        System.out.println( "Mensaje " + mensaje + " encriptado por FeistelCipher: " + mensajeEncriptado);
        String mensajeDesencriptado = mensajero.recibir(mensajeEncriptado);
        System.out.println("Mensaje "+ mensajeEncriptado + " desencriptado con FeistelCipher: " +mensajeDesencriptado);

        System.out.println();
        AdapterRC4 adapterRC4 = new AdapterRC4("123");
        mensajero.setCifrado(adapterRC4);

        String mensajeEncriptado2 = mensajero.enviar(mensaje);
        System.out.println( "Mensaje " + mensaje + " encriptado por RC4: " + mensajeEncriptado2);
        String mensajeDesencriptado2 = mensajero.recibir(mensajeEncriptado2);
        System.out.println("Mensaje " + mensajeEncriptado2 + " desencriptado con RC4: " + mensajeDesencriptado2);

    }
}
