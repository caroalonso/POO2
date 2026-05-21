package PatronesEjercicio15;

//ADAPTER - adapter
//CONCRETE STRATEGY B - strategy
public class AdapterFeistelCipher implements Cifrado {

    private FeistelCipher feistelCipher;

    public AdapterFeistelCipher(String key){
        this.feistelCipher = new FeistelCipher(key);
    }

    @Override
    public String encriptar(String menssege) {
        return this.feistelCipher.encode(menssege);
    }

    @Override
    public String desencriptar(String menssege) {
        return this.feistelCipher.decode(menssege);
    }
}
