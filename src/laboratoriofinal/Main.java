package laboratoriofinal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Venta v = new Venta(5001, "2026-06-12", new Cliente(1, "Juan Pérez", "Sonzacate", "7000-0000"), new Empleado(1, "Ana López", "Gerente"));
        v.agregarDetalle(new DetalleVenta(1, 1, new Producto(101, "Laptop Gamer", 600.00, 1200.00, new Categoria(1, "Electrónica"))));
        v.agregarDetalle(new DetalleVenta(2, 2, new Producto(102, "Mouse Pro", 15.00, 35.00, new Categoria(1, "Electrónica"))));

        System.out.print("Cargando sistema: [");
        for (int i = 0; i < 20; i++) {
            System.out.print("■");
            Thread.sleep(70);
        }
        System.out.print("] 100%");
        System.out.print("\r                                                   \r");

        StringBuilder b = new StringBuilder();
        b.append("╔══════════════════════════════════════════════════╗\n");
        b.append("║            FACTURA ELECTRÓNICA - VENTA           ║\n");
        b.append("╠══════════════════════════════════════════════════╣\n");
        b.append("║ Nro: " + v.getIdVenta() + " | Fecha: " + v.getFecha() + "          ║\n");
        b.append("║ Cliente: " + v.getCliente().getNombre() + "              ║\n");
        b.append("╠══════════════════════════════════════════════════╣\n");
        b.append("║ PRODUCTO          CANT.    PRECIO      TOTAL     ║\n");
        b.append("╠══════════════════════════════════════════════════╣\n");
        
        for (DetalleVenta d : v.getDetalles()) {
            b.append(String.format("║ %-16s %-2d     $%7.2f  $%7.2f ║\n", 
                d.getProducto().getNombre(), d.getCantidad(), 
                d.getProducto().getPrecioVenta(), d.getSubtotal()));
        }
        
        b.append("╠══════════════════════════════════════════════════╣\n");
        b.append("║ TOTAL A PAGAR: $ " + String.format("%.2f", v.calcularTotal()) + "                    ║\n");
        b.append("╚══════════════════════════════════════════════════╝\n");

        for (char c : b.toString().toCharArray()) {
            System.out.print(c);
            Thread.sleep(2);
        }
    }
}