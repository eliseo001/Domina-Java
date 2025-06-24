import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("Casa de los espejos");
        var sc = new Scanner(System.in);
        System.out.println("cual es tu edad");
        var edad = Integer.parseInt(sc.nextLine());
        System.out.println("tienes miedo a las oscuridad (true/false)");
        var miedoOcuridad = Boolean.parseBoolean(sc.nextLine());

        //verificacion
        if(!miedoOcuridad && edad>10){
            System.out.println("puedes entrar a la casa de los espejos");
        }else {
            System.out.println("no puedes entrar a la casa de los espejos te podria dar miedo");
        }
    }
}
