package laboratoriofinal;

public class DetalleVenta {
    private int idDetalle, cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int id, int cant, Producto prod) {
        this.idDetalle = id;
        this.cantidad = cant;
        this.producto = prod;
        this.subtotal = cantidad * prod.getPrecioVenta();
    }
    public double getSubtotal() { return subtotal; }
}