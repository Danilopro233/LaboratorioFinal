package laboratoriofinal;

public class Empleado {
    private int idEmpleado;
    private String nombre, cargo, direccion, fechaingreso, horarioEntrada, horarioSalida;

    public Empleado(int id, String nombre, String cargo) {
        this.idEmpleado = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int id) { this.idEmpleado = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String dir) { this.direccion = dir; }
    public String getFechaingreso() { return fechaingreso; }
    public String getHorarioEntrada() { return horarioEntrada; }
    public String getHorarioSalida() { return horarioSalida; }
    @Override
    public String toString() { return "Empleado: " + nombre + " (" + cargo + ")"; }
}