import javax.swing.event.DocumentEvent;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        System.out.println("Como leer distintos tipos de datos");
        // leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("ingresa tu edad");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        //Leer un tipo double
        System.out.print("ingresa tu altura");
        var altura  = consola.nextDouble();
        System.out.println("altura = " + altura);
        //consumimos el caracter de dsalto de linea
        consola.nextLine();
        //leer un tipo String
        System.out.println("ingrese tu nombre");

        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        //Conversion de datos
        System.out.println("Porporciona un valor entero");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        //Tipo flotante
        System.out.println("proporciona un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());// todo en un linea
        System.out.println("flotante = " + flotante);

        //boolean
        var boleano = Boolean.parseBoolean(consola.nextLine());
        System.out.println("buleano = " + boleano);
        //double
        var doble = Double.parseDouble(consola.nextLine());
        System.out.println("doble = " + doble);
        }
}
