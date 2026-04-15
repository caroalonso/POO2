package PatronesEjercicio2;

public class EmpleadoPlanta extends Empleado{
    public static final double TOTAL_DEL_BASICO=50.000;
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
        return this.adicionalPorFamilia() + (this.cantidadhHijos * DOS_MIL) + (this.anioAntiguedad * DOS_MIL);
    }
}
