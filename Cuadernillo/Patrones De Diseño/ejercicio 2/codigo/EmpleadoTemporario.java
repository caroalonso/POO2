package PatronesEjercicio2;

public class EmpleadoTemporario extends Empleado{
    private static final double PARTE_DEL_BASICO=20.000;
    private static final double VALOR_POR_HORA=300;
    private int cantidadHorasLaborales;

    public EmpleadoTemporario(boolean casado,int cantidadHijos,int cantidadHorasLaborales){
        super(casado,cantidadHijos);
        this.cantidadHorasLaborales=cantidadHorasLaborales;
    }

    @Override
    public double basico(){
        return PARTE_DEL_BASICO + (this.cantidadHorasLaborales * VALOR_POR_HORA);
    }

    @Override
    double adicional() {
        return this.adicionalPorFamilia() + (this.cantidadhHijos * DOS_MIL);
    }
}
