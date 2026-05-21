package PatronesEjercicio5Composite;

public class Main {
    public static void main(String[] args) {

        TablaPeriodica t= new TablaPeriodica();

        System.out.println(t.calsio().formula());

        Union u = new Union();
        u.add(t.hidrogeno());
        u.add(t.hidrogeno());
        u.add(t.oxigeno());
        System.out.println(u.formula());
        System.out.println("peso molecular de la union: H20 H+O+0/1+1+16 : 18 : "+ u.pesoMolecular());

        System.out.println("-----------");
        Union u2 = new Union();
        u2.add(t.hidrogeno());
        u2.add(t.oxigeno());
        u2.add(t.hidrogeno());
        System.out.println(u2.formula());
        System.out.println("peso molecular de la union: Na+[H,H,O]+Cl/23+(18)+35 : 76 : "+ u2.pesoMolecular());

        Union u3 = new Union();
        u3.add(t.hidrogeno());
        u3.add(t.hidrogeno());
        u3.add(t.oxigeno());
        System.out.println("carga de union H+H+0 = 1+1-2 = 0 : " + u3.carga());

        Union u4 = new Union();
        u4.add(t.hidrogeno());
        u4.add(t.oxigeno());
        u4.agregarSustancia(u3);
        System.out.println("carga de union H+0 = +1-2 = -1 : " + u4.carga());
        System.out.println("formula:" + u4.formula());


        Cliente cliente = new Cliente();
        System.out.println("formula de agua: " + cliente.agua().formula());
    }
}
