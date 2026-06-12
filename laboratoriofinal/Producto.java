public class Producto {
    private int idProducto;
    private String nombre;
    private double precioCompra, precioVenta;
    private int cantidadMax, cantidadMin;
    private Categoria categoria;

    public Producto(int id, String nombre, double pC, double pV, Categoria cat) {
        this.idProducto = id;
        this.nombre = nombre;
        this.precioCompra = pC;
        this.precioVenta = pV;
        this.categoria = cat;
    }
    // Getters y Setters necesarios (ejemplo rápido)
    public double getPrecioVenta() { return precioVenta; }
    // ... agrega el resto de getters y setters según el diagrama [cite: 86-99]
}