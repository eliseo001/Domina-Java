import java.util.Scanner;

public class PromedioCalificacion {

    public static void main(String[] args) {
        System.out.println("Promedio de calificacion");
        var sc =  new Scanner(System.in);

        System.out.println("introdusca la cantidad de calificacione: ");
        var cantidad = sc.nextInt();

        var calificaciones = new int[cantidad];

        for (var i = 0; i < cantidad;i++ ){
            System.out.println("calificacion["+i+"]");
            calificaciones[i] =sc.nextInt();

        }
        var total= 0;
        for (var i=0;i<cantidad;i++){
            total +=calificaciones[i];


            }
        var promedio = total/cantidad;
        System.out.println("promedio final: "+promedio);


    }
}
