import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        System.out.println("Numero positivo");

        var sc = new Scanner(System.in);
        System.out.print("Ingresa un numero");
        var numero = Integer.parseInt(sc.nextLine());
        if (numero >0){
            System.out.println("El numero es positivo "+ numero);
        } else if (numero <0) {
            System.out.println("El numero es negativo " +numero);

        }else{
            System.out.println("El numero es igual a cero "+numero);
        }

    }
}
