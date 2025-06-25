import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.println("Sentencia switch");
        var sc = new Scanner(System.in);
        System.out.println("""
                Introdusca una opcion
                1 lunes
                2 martes
                3 miercoles
                4 jueves
                5 viernes
                6 sabado
                7 domingo
                """);
        var dia= Integer.parseInt(sc.nextLine());
        switch (dia){
            case 1:
                System.out.println("selecciono a lunes");
                break;
            case 2:
                System.out.println("selecciono a martes");
                break;
            case 3:
                System.out.println("selecciono a miercoles");
                break;
            case 4:
                System.out.println("selecciono a jueves");
                break;
            case 5:
                System.out.println("selecciono a viernes");
                break;
            case 6:
                System.out.println("selecciono a sabado");
                break;
            case 7:
                System.out.println("selecciono a domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
        //switch mejorado

        System.out.println("ingrese un dia del 1 al 7");
        int dia2 = sc.nextInt();
        String nombreDia;
        nombreDia  = switch (dia2){
            case 1 ->"Lunes";
            case 2 ->"Martes";
            case 3 -> "Miercoles";
            case 4 ->"jueves";
            case 5 ->"viernes";
            case 6 ->"sabado";
            case 7 ->"Domingo";
            default -> "Dia invalido: "+ dia2;
        };
        System.out.println(nombreDia);

    }
}
