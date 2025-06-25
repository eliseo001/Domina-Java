import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
        System.out.println("Identifica la estacion del mes (1-12) ");
        var sc = new Scanner(System.in);
        System.out.print("Ingrese el numero del mes ");
        var mes = Integer.parseInt(sc.nextLine());
        if(mes == 1 || mes ==2 ||mes ==12){
            System.out.println("Invierno");
        } else if (mes==3||mes==4||mes==5) {
            System.out.println("primavera");
        } else if (mes==6||mes==7||mes==8) {
            System.out.println("verano");
        } else if (mes==9||mes==10||mes==11) {
            System.out.println("otoño");
        }else {
            System.out.println("estacion desconocida");
        }

        //mejorado implementando switch
        System.out.println("Ingrese un mes del (1 al 12)");
        int mes2 = sc.nextInt();
        String nombreEstacion;
        nombreEstacion=switch (mes2){
            case 1,2,12 ->"invierno";
            case 3,4,5 ->"primavera";
            case 6,7,8 ->"verano";
            case 9,10,11 ->"otoño";

            default -> "Ingreso un mes invalido "+mes2;

        };
        System.out.println(nombreEstacion);
    }

}
