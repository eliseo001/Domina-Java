import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class IdUnico {
    public static void main(String[] args) {
        System.out.println("generador de id unico");
        var sc = new Scanner(System.in);
        var random = new Random();
        System.out.print("Ingresa tu nombre ");
        var nombre = sc.nextLine();

        System.out.print("ingresa tu apellido ");
        var apellido = sc.nextLine();

        System.out.print("ingresa tu año de nacimineto (YYYY) ");
        var añoNacimiento = sc.nextLine();

        var numeroAleatorio = random.nextInt(9999)+1;

        //normalizacion de valores
        var numeroAleatorioFormato = String.format("%04d",numeroAleatorio);
        var nombre2= nombre.trim().toUpperCase().substring(0,2);
        var apellido2 =apellido.trim().toUpperCase().substring(0,2);
        var añoNacimiento2= añoNacimiento.trim().substring(2);
        var idUnico= nombre2+apellido2+añoNacimiento2+ numeroAleatorioFormato;

        System.out.printf("""
                %nDetalle persona
                \tNombre %s
                \tApellido %s
                \tAño de nacimiento %s
                \tTu numero de (ID) generado por el sistema es:  %s
                \tFelicidades!
                """,nombre,apellido,añoNacimiento,idUnico);

    }
}
