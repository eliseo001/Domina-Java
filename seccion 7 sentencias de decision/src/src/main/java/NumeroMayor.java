import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        System.out.println("El mayor de 2 numeros");
        var sc = new Scanner(System.in);
        System.out.print("ingresa el primer numero ");
        var numero1= Integer.parseInt(sc.nextLine());
        System.out.print("ingresa el segundo numero ");
        var numero2= Integer.parseInt(sc.nextLine());

        if(numero1>numero2){
            System.out.println("El numero: "+numero1+" es mayor que el numero: "+numero2);
        }else if(numero2>numero1){
            System.out.println("El numero: "+numero2+" es mayor que el numero: "+numero1);
        }else {
            System.out.println("El numero: "+numero1+" es igual que el numero: "+numero2);
        }
    }
}
