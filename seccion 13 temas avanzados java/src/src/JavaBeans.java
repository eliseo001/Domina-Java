import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        System.out.println("JavaBeans");
        var persona= new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona= " +persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());

    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
