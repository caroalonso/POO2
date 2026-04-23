package PatronesEjercicio2Template;
public abstract class Empleado {
    private static final double PORCENTAJE_BASICO=0.13;
    private static final double PORCENTAJE_ADICIONAL=0.5;
    public static final double CASADO_ADICIONAL=5000;
    private static final double ADICIONAL_POR_HIJO=2000;
    public static final double SOLTERO_ADICIONAL=0;
    protected boolean casado;
    protected int cantidadhHijos;

    public Empleado(boolean casado,int cantidadhHijos){
        this.casado=casado;
        this.cantidadhHijos=cantidadhHijos;
    }

    protected double adicionalPorFamilia() {
        return (this.casado ? CASADO_ADICIONAL : SOLTERO_ADICIONAL)
                + (this.cantidadhHijos * ADICIONAL_POR_HIJO);
    }

    private  double descuento(){
        return (this.basico() * PORCENTAJE_BASICO) + (this.adicional() * PORCENTAJE_ADICIONAL );
    }

    public double sueldo(){
        return basico() + adicional() - this.descuento();
    }

    abstract double basico();
    abstract double adicional();
}
