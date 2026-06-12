package laboratoriofinal;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<DetalleVenta> detalles;

    public Venta(int id, String fecha, Cliente cli, Empleado emp) {
        this.idVenta = id;
        this.fecha = fecha;
        this.cliente = cli;
        this.empleado = emp;
        this.detalles = new ArrayList<>();
    }
    public void agregarDetalle(DetalleVenta det) { detalles.add(det); }
    
    public double calcularTotal() {
        double suma = 0;
        for (DetalleVenta d : detalles) {
            suma += d.getSubtotal();
        }
        return suma;
    }
    public Empleado getEmpleado() { return empleado; }
}