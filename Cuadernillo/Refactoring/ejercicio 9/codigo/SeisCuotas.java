package RefactoringEjercicio9;

public class SeisCuotas implements Pago {
    private final static double SEIS_CUOTAS = 0.2;

    public SeisCuotas() {}

    @Override
    public double extraPago() {
        return SEIS_CUOTAS;
    }

}
