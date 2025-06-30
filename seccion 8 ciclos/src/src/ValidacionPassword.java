import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("Validacion de Password");
        var sc= new Scanner(System.in);
        var salir=false;
        var contraseña="";
        while(!salir){
            System.out.println("""
                    Aplicacion para crear una contraseña
                    Cree una contraseña de al menos 6 digitos
                    
                    """);
            contraseña = sc.nextLine();
            var CantidadLetras =contraseña.length();

            if (CantidadLetras>=6){
                System.out.println("contraseña creada con exito: "+contraseña);
                System.out.println("saliendo...");

            }else {
                System.out.println("Ingrese una contraseña valida");
            }
        }
    }
}
