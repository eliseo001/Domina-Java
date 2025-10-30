package zona_fit.objetos;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void saludar()
    {
        System.out.println("Hola soy: " + nombre);
    }
    public static void main(String[] args) {
        Persona persona1  = new Persona("Eliseo", "Masuelli", 24);
        System.out.println(persona1);
        persona1.saludar();
    }

}
