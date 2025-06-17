import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("Receta de cocina");
        var sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la receta");
        String nombreReceta = sc.nextLine();
        System.out.println("Ingresa ingredientes");
        String ingredientes = sc.nextLine();
        System.out.println("iingrese el timepo de preparacon (minutos) ");
        var tiempo = Float.parseFloat(sc.nextLine());
        System.out.println("ingresa la dificultad( facil, media, dificil");
        String dificultad = sc.nextLine();

        System.out.println("\nNombre de la receta: "+nombreReceta+"\ningredientes: "+ingredientes+"\ntiempo de preparacion: "+tiempo+"\ndificultad: "+dificultad );

}
}
