package PatronesEjercicio2;

public class EmpleadoPasante extends Empleado{
    public static final double TOTAL_DEL_BASICO=20.000;
    private int cantidadExamenes;

    public EmpleadoPasante(boolean casado,int cantidadHijos,int cantidadExamenes){
        super(casado,cantidadHijos);
        this.cantidadExamenes=cantidadExamenes;
    }

    @Override
    public double basico(){
        return TOTAL_DEL_BASICO;
    }

    @Override
    double adicional() {
        return DOS_MIL;
    }
}
