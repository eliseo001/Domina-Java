package primera_parte.persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idUnico;
    private String nombre;
    private String apellido;




    public Persona(){
        this.idUnico = ++Persona.contadorPersonas;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementar el atributo static
        //asignamos el id unico y posincrementamos el contador
        this.idUnico = ++Persona.contadorPersonas;
    }


    @Override
    public String toString(){
    return "Id: "+idUnico+
            ", Nombre: "+ this.nombre+
            ", Apellido: "+this.apellido
        //con super accedo al metodo toStrin original
        +", imprimer direcion de memoria: "+super.toString();
    }
    public String nombreCompleto(){
        var resultado = this.nombre +" "+ this.apellido;
        return resultado;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
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
    public int getIdUnico() {
        return this.idUnico;
    }




}
