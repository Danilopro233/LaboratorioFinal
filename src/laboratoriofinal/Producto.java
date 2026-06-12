package laboratoriofinal;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precioVenta;
    private Categoria categoria;

    public Producto(int id, String nombre, double pV, Categoria cat) {
        this.idProducto = id;
        this.nombre = nombre;
        this.precioVenta = pV;
        this.categoria = cat;
    }
    public double getPrecioVenta() { return precioVenta; }
}