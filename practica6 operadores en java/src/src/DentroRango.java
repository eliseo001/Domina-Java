import java.util.Scanner;

public class DentroRango {
    public static void main(String[] args) {
        System.out.println("Valor dentro de un rango");
        var sc= new Scanner(System.in);
        int a =2, b=12;
        System.out.println("introdusca un numero ");
        int c = sc.nextInt();

        var resultado = c>a && c<b;
        System.out.println("el valor se encuentra entre a y b? " + resultado);


    }
}
