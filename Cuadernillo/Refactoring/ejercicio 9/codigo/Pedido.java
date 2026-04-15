package RefactoringEjercicio9;

import java.util.List;

public class Pedido {
    private final static double DESCUENTO_CLIENTE_ANTIGUO = 0.9;
    private Cliente cliente;
    private List<Producto> productos;
    private Pago formaPago;

    public Pedido(Cliente cliente, List<Producto> productos, Pago formaPago) {
        this.cliente = cliente;
        this.productos = productos;
        this.formaPago = formaPago;
    }

    public void setFormaDePago(Pago pago){
        this.formaPago=pago;
    }

    public Pago getFormaDePago(){
        return this.formaPago;
    }

    public double getCostoTotal() {
        return this.productos.stream()
                .mapToDouble(productos -> productos.getPrecio())
                .sum();
    }

    private double calcularCostoSinDescuento() {
        return this.getCostoTotal() + this.formaPago.extraPago();
    }

    public double calcularTotalAPagar() {
        if (this.cliente.mayorAcinco())
            return this.calcularCostoSinDescuento() * DESCUENTO_CLIENTE_ANTIGUO;
        return this.calcularCostoSinDescuento();
    }
}
