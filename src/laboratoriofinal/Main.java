package laboratoriofinal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Datos
        Categoria cat1 = new Categoria(1, "Electrónica");
        Producto prod1 = new Producto(101, "Laptop Gamer", 600.00, 1200.00, cat1);
        Producto prod2 = new Producto(102, "Mouse Inalámbrico", 15.00, 35.00, cat1);
        Cliente cli1 = new Cliente(1, "Juan Pérez", "Calle Principal #123", "7000-0000");
        Empleado emp1 = new Empleado(1, "Ana López", "Gerente de Ventas");

        Venta miVenta = new Venta(5001, "2026-06-12", cli1, emp1);
        miVenta.agregarDetalle(new DetalleVenta(1, 1, prod1));
        miVenta.agregarDetalle(new DetalleVenta(2, 2, prod2));

        // Estructura visual sin códigos ANSI (Para evitar errores)
        StringBuilder reporte = new StringBuilder();
        reporte.append("╔════════════════════════════════════════════════╗\n");
        reporte.append("║            FACTURA DE VENTA # " + miVenta.getIdVenta() + "            ║\n");
        reporte.append("╠════════════════════════════════════════════════╣\n");
        reporte.append("║ FECHA:        " + miVenta.getFecha() + "                      ║\n");
        reporte.append("║ CLIENTE:      " + miVenta.getCliente().getNombre() + "                ║\n");
        reporte.append("║ ATENDIDO POR: " + miVenta.getEmpleado().getNombre() + "           ║\n");
        reporte.append("╠════════════════════════════════════════════════╣\n");
        reporte.append(String.format("║ %-16s %-8s %-9s %-9s ║\n", "PRODUCTO", "CANT.", "PRECIO", "TOTAL"));
        reporte.append("╠════════════════════════════════════════════════╣\n");
        
        for (DetalleVenta d : miVenta.getDetalles()) {
            reporte.append(String.format("║ %-16s %-8d $%-8.2f $%-8.2f ║\n", 
                d.getProducto().getNombre(), d.getCantidad(), 
                d.getProducto().getPrecioVenta(), d.getSubtotal()));
        }
        
        reporte.append("╠════════════════════════════════════════════════╣\n");
        reporte.append("║ TOTAL FINAL A PAGAR: $" + String.format("%.2f", miVenta.calcularTotal()) + "              ║\n");
        reporte.append("╚════════════════════════════════════════════════╝\n");

        // Imprimir con animación
        for (char c : reporte.toString().toCharArray()) {
            System.out.print(c);
            Thread.sleep(3); 
        }
    }
}