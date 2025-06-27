import java.util.Scanner;

public class AdministracionCuentas {
    public static void main(String[] args) {
        System.out.println("Sistema de administraciond e cuentas");

        var sc = new Scanner(System.in);
        var salir=false;//hasta que esto no sea true no sale del sistema




        while (!salir) {
            System.out.print("""
                ***Sistema de administracion de cuenta
                Menu
                1. Crear cuenta
                2. Eliminar cuenta
                3. Salir
                Ecoje una opcion:\s""");
            var opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Selecciono crear cuenta");
                case 2 -> System.out.println("selecciono eliminar cuenta");
                case 3 -> {
                    System.out.println("Saliendo del  sistema");
                    salir=true;
                }
                default -> System.out.println("Opcion invalida...\n");
                }
            }
        }
    }
