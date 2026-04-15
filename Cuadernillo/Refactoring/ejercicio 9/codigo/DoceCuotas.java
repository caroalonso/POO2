package RefactoringEjercicio9;

public class DoceCuotas implements Pago {
    private final static double DOCE_CUOTAS = 0.5;

    public DoceCuotas() {}

    @Override
    public double extraPago() {
        return DOCE_CUOTAS;
    }
}
