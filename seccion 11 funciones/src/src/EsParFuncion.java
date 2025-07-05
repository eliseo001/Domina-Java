import java.util.Scanner;

public class EsParFuncion {

    public static void main(String[] args) {
        System.out.println("Funcion es par");
        var sc= new Scanner(System.in);
        System.out.println("introduce un numero");
        var num = sc.nextInt();

        System.out.println(num+" es par "+esPar(num));
    }

    static boolean esPar(int num) {
        if (num % 2 == 0) {

            return true;
        } else {

            return false;
        }


    }
}
