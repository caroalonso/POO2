package PatronesEjercicio2;
public abstract class Empleado {
    private static final double PORCENTAJE_BASICO=0.13;
    private static final double PORCENTAJE_ADICIONAL=0.5;
    public static final double CASADO_ADICIONAL=5000;
    public static final double SOLTERO_ADICIONAL=0;
    protected static final double DOS_MIL=2000;
    protected boolean casado;
    protected int cantidadhHijos;

    public Empleado(boolean casado,int cantidadhHijos){
        this.casado=casado;
        this.cantidadhHijos=cantidadhHijos;
    }

    protected double adicionalPorFamilia() {
        return (this.casado ? CASADO_ADICIONAL : SOLTERO_ADICIONAL)
                + (this.cantidadhHijos * DOS_MIL);
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
