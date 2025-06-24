import java.util.Scanner;

public class SaludFitnes {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la aplicacion salud y fitnes");
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;


        var sc= new Scanner(System.in);
        System.out.print("Ingrese su nombre");
        var nombre = sc.nextLine();
        System.out.println("Ingrese los pasos caminados en el dia");
        var pasos = Integer.parseInt(sc.nextLine());

        var caloriasQuemadas =pasos*CALORIAS_POR_PASO;
        var metaPasos = (pasos>=META_PASOS_DIARIOS ? "Cumplio con la meta" : "No cumplio con la meta");

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemados: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                -----------------------------
                La meta de pasos diarios es de: %d pasos
                
                """,nombre,pasos,caloriasQuemadas,metaPasos,META_PASOS_DIARIOS);

    }
}
