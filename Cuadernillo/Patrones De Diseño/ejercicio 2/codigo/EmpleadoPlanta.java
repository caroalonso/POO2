package PatronesEjercicio2Template;

public class EmpleadoPlanta extends Empleado{
    public static final double TOTAL_DEL_BASICO=50000;
    protected static final double ADICIONAL_POR_ANTIGUEDAD=2000;
    private int anioAntiguedad;

    public EmpleadoPlanta(boolean casado,int cantidadHijos,int anioAntiguedad){
        super(casado,cantidadHijos);
        this.anioAntiguedad=anioAntiguedad;
    }

    @Override
    public double basico(){
        return TOTAL_DEL_BASICO;
    }

    @Override
    double adicional() {
        return this.adicionalPorFamilia() + (this.anioAntiguedad * ADICIONAL_POR_ANTIGUEDAD);
    }
}
