package laboratoriofinal;

public class Main {
    public static void main(String[] args) {
        // 1. Configuración de datos (Modelado del sistema)
        Categoria cat1 = new Categoria(1, "Electrónica");
        Producto prod1 = new Producto(101, "Laptop Gamer", 600.00, 1200.00, cat1);
        Producto prod2 = new Producto(102, "Mouse Inalámbrico", 15.00, 35.00, cat1);
        
        Cliente cli1 = new Cliente(1, "Juan Pérez", "Calle Principal #123", "7000-0000");
        Empleado emp1 = new Empleado(1, "Ana López", "Gerente de Ventas");

        // 2. Proceso de Venta
        Venta miVenta = new Venta(5001, "2026-06-12", cli1, emp1);
        miVenta.agregarDetalle(new DetalleVenta(1, 1, prod1)); // 1 Laptop
        miVenta.agregarDetalle(new DetalleVenta(2, 2, prod2)); // 2 Mouses

        // 3. Impresión Profesional en Consola
        System.out.println("**************************************************");
        System.out.println("              FACTURA DE VENTA # " + miVenta.getIdVenta());
        System.out.println("**************************************************");
        System.out.println("FECHA: " + miVenta.getFecha());
        System.out.println("CLIENTE: " + miVenta.getCliente().getNombre());
        System.out.println("ATENDIDO POR: " + miVenta.getEmpleado().getNombre());
        System.out.println("--------------------------------------------------");
        
        // Encabezado de la tabla
        System.out.printf("%-20s %-10s %-10s %-10s%n", "PRODUCTO", "CANT.", "PRECIO", "SUBTOTAL");
        System.out.println("--------------------------------------------------");
        
        // Cuerpo de la tabla (Recorrido detallado)
        for (DetalleVenta d : miVenta.getDetalles()) {
            System.out.printf("%-20s %-10d $%-9.2f $%-9.2f%n", 
                d.getProducto().getNombre(), 
                d.getCantidad(), 
                d.getProducto().getPrecioVenta(), 
                d.getSubtotal());
        }
        
        System.out.println("--------------------------------------------------");
        System.out.printf("TOTAL FINAL A PAGAR: $%.2f%n", miVenta.calcularTotal());
        System.out.println("**************************************************");
        System.out.println("¡Gracias por su compra!");
    }
}