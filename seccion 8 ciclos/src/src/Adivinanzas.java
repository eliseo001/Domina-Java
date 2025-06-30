import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        System.out.println("Juego de adivinanzas");
        var sc = new Scanner(System.in);
        var salir =false;
        var contador = 0;
        final var INTENTOS=3;
        Random random = new Random();
        int Nrandom = random.nextInt(50)+1;
        System.out.println("""
                    Adivinanza de un numero entre el 0 y 50
                    Tiene 10 intentos para adivinar
                    Ingrese un numero para adivinar
                    """);

        while (!salir){

            var numero = sc.nextInt();
            contador++;
            if (contador==INTENTOS){
                System.out.println("Alcanso el numero maximos de intentos (perdio)");
                salir=true;
            }else if  (Nrandom==numero){

                System.out.println("Felicidades adivino el numero "+Nrandom);
                System.out.println("Lo consigio en el intento: "+ contador);
                System.out.println("saliendo del sistema");
                salir=true;
            }else {
                System.out.println("Siga intentando, le quedan: "+(INTENTOS-contador)+" intentos");

            }

        }
    }
}
