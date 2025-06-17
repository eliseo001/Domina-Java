import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {
        System.out.println("numeros aleatorios");

        Random random = new Random();
        var numeroEntre0y9 = random.nextInt(10); // Genera número del 0 al 9

        System.out.println("numeroEntre 0 y 9 = " + numeroEntre0y9);
        
        var numeroEntre1y10 = random.nextInt(10) + 1;
        System.out.println("numeroEntre 1 y 10 = " + numeroEntre1y10);
        
        //generarun numero flotante ente 0.0 y 1.0
        
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);
        
        //simular lanzamiento de un dado
        var dado = random.nextInt(6)+1;
        System.out.println("dado = " + dado);
    
    }
}