package laboratoriofinal;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar objetos básicos
        Categoria cat1 = new Categoria(1, "Electrónica");
        Producto prod1 = new Producto(101, "Laptop", 500.00, 800.00, cat1);
        Cliente cli1 = new Cliente(1, "Juan Perez", "Sonzacate", "7000-0000");
        Empleado emp1 = new Empleado(1, "Ana Lopez", "Vendedor");

        // 2. Crear instancia de la Venta
        Venta miVenta = new Venta(1, "2026-06-12", cli1, emp1);

        // 3. Crear detalles y agregarlos
        DetalleVenta det1 = new DetalleVenta(1, 2, prod1); // 2 Laptops
        miVenta.agregarDetalle(det1);

        // 4. Mostrar resultados para verificar funcionamiento
        System.out.println("--- Reporte de Venta ---");
        System.out.println("Vendedor: " + miVenta.getEmpleado().getNombre());
        System.out.println("Cliente: " + miVenta.getCliente().getNombre());
        System.out.println("Total de la venta: $" + miVenta.calcularTotal());
        
        // Verificación de los métodos obligatorios
        System.out.println("Detalle técnico: " + det1.toString());
    }
}