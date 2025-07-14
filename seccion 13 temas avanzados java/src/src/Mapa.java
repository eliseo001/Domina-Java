import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        System.out.println("Mapa");
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","Diego");
        persona.put("Apellido","Flores");
        persona.put("Edad","31");
        persona.put("edad","31");//no se permiten duplicados
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        System.out.println("\nNuevos valores del mapa:");
        persona.put("edad","35"); //modificamos el valor de la llave existente
        persona.remove("Apellido");
        persona.entrySet().forEach(System.out::println);
        //Interar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((llave, valor)->System.out.println("Llave: "+llave+"Valor"+valor));

    }
}
