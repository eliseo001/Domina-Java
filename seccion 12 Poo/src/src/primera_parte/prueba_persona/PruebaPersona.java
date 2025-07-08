package primera_parte.prueba_persona;

import primera_parte.persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Prueba primera_parte.persona");
        var persona1 = new Persona("Eliseo","Masuelli");
        var persona2 = new Persona();
        persona2.setNombre("Jose");
        persona2.setApellido("perez");
        System.out.println(persona1.nombreCompleto());
    }
}
