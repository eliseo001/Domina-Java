public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){

        System.out.println("Nombre: "+ nombre+ " Apellido: "+ apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de clase y objeto primera_parte.persona");
        var objeto1= new Persona();
        objeto1.nombre ="Eliseo";
        objeto1.apellido="Masuelli";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Jose";
        objeto2.apellido = "Perez";
        objeto2.mostrarPersona();
    }
}

