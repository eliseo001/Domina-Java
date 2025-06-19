import java.util.Scanner;

public class PrestamoLibro {
    public static void main(String[] args) {
        System.out.println("Sistema prestamo libro");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var sc = new Scanner(System.in);
        System.out.println("Cuentas con credeencial de estudiante  (true/false)");

        var tienesCredencial = Boolean.parseBoolean(sc.nextLine());
        System.out.println("a cuantos km vives de la biblioteca? ");
        var distanciaBibliotecaKm=  Integer.parseInt(sc.nextLine());
        var esElegiblePrestamo = tienesCredencial || distanciaBibliotecaKm < DISTANCIA_PERMITIDA_KM;
        System.out.println("esElegiblePrestamo = " + esElegiblePrestamo);
    }
}
