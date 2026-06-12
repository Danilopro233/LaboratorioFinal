package laboratoriofinal;

public class Cliente {
    private int idCliente;
    private String nombre, direccion, telefono;

    public Cliente(int id, String nombre, String direccion, String telefono) {
        this.idCliente = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public int getIdCliente() { return idCliente; }
    public String getNombre() { return nombre; }
}