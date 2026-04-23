package PatronesEjercicio5Composite;

//LEAF
public class Atomo implements SustanciaQuimica {
    private String nombre;
    private String simbolo;
    private int pesoAtomico;
    private int carga;
    private boolean metal;

    public Atomo(String nombre, String simbolo, int pesoAtomico, int carga, boolean metal) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.pesoAtomico = pesoAtomico;
        this.carga = carga;
        this.metal = metal;
    }

    public String formula() {
        return this.simbolo;
    }

    @Override
    public int pesoMolecular() {
        return this.pesoAtomico;
    }

    @Override
    public int carga() {
        return this.carga;
    }

    @Override
    public boolean esValida(SustanciaQuimica sustancia) {
        return sustancia.compatibleConAtomo(this);
    }

    @Override
    public boolean compatibleConAtomo(Atomo atomo) {
        return !(this.metal && atomo.metal);
    }

    @Override
    public Union add(SustanciaQuimica otro) {
        Union union = new Union();
        union.agregarSustancia(this);
        union.agregarSustancia(otro);
        return union;
    }

}
