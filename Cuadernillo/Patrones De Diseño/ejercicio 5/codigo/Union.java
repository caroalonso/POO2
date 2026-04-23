package PatronesEjercicio5Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//COMPOSITE
public class Union implements SustanciaQuimica {

    private List<SustanciaQuimica> sustancias;

    public Union() {
        this.sustancias = new ArrayList<>();
    }

    public void agregarSustancia(SustanciaQuimica sustancia) {
        if (!this.esValida(sustancia))
            throw new RuntimeException("Convinacion Invalida");
        this.sustancias.add(sustancia);
    }

    @Override
    public String formula() {
        return this.sustancias.stream()
                .map(s -> s.formula())
                .collect(Collectors.joining(", ", "[", "]"));
    }

    @Override
    public int pesoMolecular() {
        return this.sustancias.stream()
                .mapToInt(s -> s.pesoMolecular())
                .sum();
    }

    @Override
    public int carga() {
        return this.sustancias.stream()
                .mapToInt(s -> s.carga())
                .sum();
    }

    @Override
    public boolean esValida(SustanciaQuimica otra) {
        return this.sustancias.stream()
                .allMatch(s -> s.esValida(otra));
    }

    @Override
    public boolean compatibleConAtomo(Atomo atomo) {
        return this.sustancias.stream()
                .allMatch(s -> s.compatibleConAtomo(atomo));
    }

    @Override
    public Union add (SustanciaQuimica otro) {
        this.agregarSustancia(otro); //valida primero
        return this;
    }
}
