package PatronesEjercicio2Template;

public class EmpleadoPasante extends Empleado{
    public static final double TOTAL_DEL_BASICO=20000;
    private static final double ADICIONAL_POR_EXAMEN=2000;
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
        return ADICIONAL_POR_EXAMEN * this.cantidadExamenes;
    }
}
