package zona_fit;

import java.util.Scanner;

public class operadoresAritmeticos
{
    public static void main(String[] args) {
        System.out.println("Operadores aritmeticos");

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero a sumar");

        float num1 = sc.nextFloat();

        System.out.println("introduzca otro numero a sumar");

        float num2 = sc.nextFloat();

        float suma = num1 + num2;

        System.out.println(suma);

        System.out.println("Intruzca su edad");

        int edad = sc.nextInt();

        System.out.println("Le faltan " + añosJubilarse(edad) + " años para jubilarse");

        verificarVotacion(edad);
    }

    public static int añosJubilarse(int edadUsuario)
    {
        int edadJubilatoria = 65;

        return (edadJubilatoria - edadUsuario);
    }
    public static boolean esMayorEdad(int edadUsuario)
    {
        return edadUsuario >= 18;
    }

    public static void verificarVotacion(int edadUsuario)
    {
        if (! esMayorEdad(edadUsuario)){
            System.out.println("El usuario no puede votar es menor de edad");
            return;
        }
        System.out.println("El usaurio puede votar es mayor de edad");
    }
}
