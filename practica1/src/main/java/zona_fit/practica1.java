package zona_fit;

import java.util.Scanner;

public class practica1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "Eliseo";

        int age = 25;

        System.out.println("!hola mundo¡ ");

        System.out.println("hola "+ name + " tenes "+ age + " años");

        System.out.println("Introduzaca su nombre");

        String name1 = sc.nextLine();

        System.out.println("introduzca su edad");

        int edad1 = sc.nextInt();

        System.out.println("Hola buen dia " + name1 + " tenes " + edad1 + " años.");
    }
}
