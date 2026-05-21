package PatronesEjercicio15;

//ADAPTER - adapter
//CONCRETE STRATEGY A - strategy
public class AdapterRC4 implements Cifrado {

    private RC4 rc4 = new RC4();;
    private String key;

    public AdapterRC4 (String key){
        this.key=key;
    }

    @Override
    public String encriptar(String menssege) {
        return this.rc4.encriptar(menssege,this.key);
    }

    @Override
    public String desencriptar(String menssege) {
      return this.rc4.desencriptar(menssege,this.key);
    }
}
