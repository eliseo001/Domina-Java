import java.util.Scanner;

public class SumaFuncion {
    public static void main(String[] args) {
        System.out.println("funcion sumar");

        var sc = new Scanner(System.in);
        System.out.println("introduce el numero 1 a sumar: ");
        var num1 = sc.nextInt();
        System.out.println("introduce el numero 2 a sumar: ");
        var num2 = sc.nextInt();
        System.out.println("la suma es: "+ sumar(num1,num2));
    }

    static int sumar(int num1,int num2){
        var resultado = num1+num2;
        return resultado;
    }
}
