import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("Rango de un variable");
        var sc = new Scanner(System.in);

        System.out.println("proporciona un dato entero");
        var dato =  Integer.parseInt(sc.nextLine());

        //revisamos si esta dentro de rango(entre 1 y 10)
        var estaDetroRango= dato >=1 && dato<=10;
        System.out.println("estaDetroRango = " + estaDetroRango);
        // revisar la logica inversa, se el dato esta fuera de rango    
        var estaFueraRango = !(dato >=1 && dato<=10);
        System.out.println("estaFueraRango = " + estaFueraRango);

    }
}
