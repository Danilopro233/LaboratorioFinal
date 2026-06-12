
public class DetalleVenta {
    private int idDetalle, cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int id, int cant, Producto prod) {
        this.idDetalle = id;
        this.cantidad = cant;
        this.producto = prod;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal() {
        return this.cantidad * producto.getPrecioVenta();
    }
    // Getters y Setters [cite: 108-112]
}