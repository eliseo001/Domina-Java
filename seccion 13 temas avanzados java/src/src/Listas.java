import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        System.out.println("Manejo de listas");

        List <String> miLista  = new ArrayList <>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
       // miLista.add(1); no se puede almacenar ese tipod edatos por que se definio string
        //miLista.add("Domingo"); array list permite crear elemtos repetidos


        for (Object elemento: miLista){
            System.out.println("Dia de la semana: "+elemento);
        }

        //Funciones lambda (funcion anonima de un codigo muy compacto)
        miLista.forEach( elemento -> {
            System.out.println("Elemento: "+elemento);
        });

        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro","Eliseo","Lucas");
        System.out.println("\nlista de nombres");
        nombres.forEach(System.out::println);
    }
}
