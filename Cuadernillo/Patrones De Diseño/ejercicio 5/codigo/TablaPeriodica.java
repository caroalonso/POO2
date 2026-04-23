package PatronesEjercicio5Composite;

public class TablaPeriodica {

    public TablaPeriodica(){}

    public SustanciaQuimica hidrogeno (){
        return new Atomo("Hidrogeno", "H",1 ,1, false);
    }

    public SustanciaQuimica oxigeno(){
        return new Atomo("Oxigeno","O", 16, -2, false);
    }

    public SustanciaQuimica cloro(){
        return new Atomo("Cloro","Cl", 35, -1, false);
    }

    public SustanciaQuimica sodio(){
        return new Atomo("Sodio","Na", 23, 1, true);
    }

    public SustanciaQuimica calsio(){
        return new Atomo("Calsio", "Ca",40 ,2, true);
    }

    //... otros Elementos
}
