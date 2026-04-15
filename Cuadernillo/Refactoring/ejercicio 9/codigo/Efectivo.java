package RefactoringEjercicio9;

public class Efectivo implements Pago {
    private final static double CERO = 0;

    public Efectivo() {}

    @Override
    public double extraPago() {
        return CERO;
    }
}
