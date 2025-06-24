import java.util.Scanner;

public class SistemaBacario {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema bancario");

        var sc = new Scanner(System.in);
        System.out.print("Deseas salir del sistema (true/false)");
        var salirSistema =  Boolean.parseBoolean(sc.nextLine());
     //verificamos  (aplicando una logica inversa)
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema");
        }else {
            System.out.println("Saliendo del sistema...");
        }

    }
}
