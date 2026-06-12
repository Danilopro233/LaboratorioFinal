package laboratoriofinal;

public class Empleado {
    private int idEmpleado;
    private String nombre, cargo;

    public Empleado(int id, String nombre, String cargo) {
        this.idEmpleado = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public String getNombre() { return nombre; }
}