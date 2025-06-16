import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("entrada de datos por consola");

        var Scanner = new Scanner(System.in);
        System.out.println("Introduce una linea de texto");
        var linea = Scanner.nextLine();
        System.out.println("la linea introducida es: "+ linea);

        System.out.println("manejo consola");
        var consola = new Scanner(System.in);// in - input- o entra de datos
        System.out.println("Escribe tu nombre");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        
        }
}
