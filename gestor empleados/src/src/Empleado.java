import java.io.Serializable;
import java.util.Objects;

public class Empleado implements Serializable {
    private static int contadorEmpleado = 0;
    private int idEmpleado;
    private String nombre;
    private String cargo;
    private double sueldo;
    private int inasistencia;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    public Empleado(String nombre, String cargo, double sueldo, int inasistencia){
        this();
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.inasistencia= inasistencia;


    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                ", faltas="+ inasistencia+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return idEmpleado == empleado.idEmpleado && Double.compare(sueldo, empleado.sueldo) == 0 && inasistencia == empleado.inasistencia && Objects.equals(nombre, empleado.nombre) && Objects.equals(cargo, empleado.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, nombre, cargo, sueldo, inasistencia);
    }

    //Getters and setters
    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getInasistencia() {
        return inasistencia;
    }

    public void setInasistencia(int inasistencia) {
        this.inasistencia = inasistencia;
    }
}
