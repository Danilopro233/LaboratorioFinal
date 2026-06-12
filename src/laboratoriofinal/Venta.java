package laboratoriofinal;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private String fecha;
    private double total;
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
    public int getIdVenta() { return idVenta; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cli) { this.cliente = cli; }
    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado emp) { this.empleado = emp; }
    public void agregarDetalle(DetalleVenta det) { detalles.add(det); }
    public double calcularTotal() {
        double suma = 0;
        for (DetalleVenta d : detalles) { suma += d.getSubtotal(); }
        return suma;
    }
    public ArrayList<DetalleVenta> getDetalles() { return detalles; }
    @Override
    public String toString() { return "Venta ID: " + idVenta + " Total: " + calcularTotal(); }
}