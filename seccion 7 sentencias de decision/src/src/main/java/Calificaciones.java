import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.println("Sistema de calificaciones");
        var sc = new Scanner(System.in);
        System.out.println("ingrese una calificacion entre 0 y 10");

        int nota= sc.nextInt();
        var NotaLetra ="";
       if(nota>=9 && nota<=10){
           NotaLetra="A";

       } else if (nota>=8&& nota<9) {
           NotaLetra= "B";

       } else if (nota>=7&& nota<8) {
           NotaLetra= "C";

       } else if (nota>=6&& nota<7) {
           NotaLetra= "D";

       } else if (nota>=0&& nota<6) {
           NotaLetra= "F";


       }else {
           System.out.println("Calificacion incorrecta");
       }
        System.out.println(nota+" Calificacion equivalente a letra: "+NotaLetra);

    }
}
