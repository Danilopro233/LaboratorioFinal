package laboratoriofinal;

public class Cliente {
    private int idCliente;
    private String nombre, direccion, telefono;

    public Cliente(int id, String nombre, String direccion, String tel) {
        this.idCliente = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = tel;
    }
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int id) { this.idCliente = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String dir) { this.direccion = dir; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String tel) { this.telefono = tel; }
    @Override
    public String toString() { return "Cliente: " + nombre; }
}