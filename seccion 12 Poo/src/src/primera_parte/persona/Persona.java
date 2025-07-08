package primera_parte.persona;

public class Persona {
    private String nombre;
    private String apellido;


    public Persona(){

    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String nombreCompleto(){
        var resultado = this.nombre +" "+ this.apellido;
        return resultado;
    }


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
}
