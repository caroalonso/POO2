package PatronesEjercicio15;

//STRATEGY - strategy
//TARGET - adapter
public interface Cifrado {
    abstract String encriptar(String menssege);
    abstract String desencriptar(String menssege);
}

