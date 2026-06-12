package laboratoriofinal;

public class Main {
    public static void main(String[] args) {
        Categoria cat1 = new Categoria(1, "Electrónica");
        Producto prod1 = new Producto(101, "Laptop", 800.00, cat1);
        Cliente cli1 = new Cliente(1, "Juan Perez", "San Salvador", "7000-0000");
        Empleado emp1 = new Empleado(1, "Ana Lopez", "Vendedor");

        Venta miVenta = new Venta(1, "2026-06-12", cli1, emp1);
        miVenta.agregarDetalle(new DetalleVenta(1, 2, prod1));

        System.out.println("Vendedor: " + miVenta.getEmpleado().getNombre());
        System.out.println("Total a pagar: $" + miVenta.calcularTotal());
    }
}