import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("Sistema de autenticacion 2");
        final var USUARIO = "Eliseo";
        final var PASSWORD= "123";
        var sc= new Scanner(System.in);
        System.out.println("ingrese su usuario ");
        var usuario = sc.nextLine().strip();
        System.out.println("Ingrese su contraseña");
        var contraseña =sc.nextLine().strip();
        if (USUARIO.equals(usuario)&&PASSWORD.equals(contraseña)){
            System.out.println("Bienvenido al sistema");
        } else if (USUARIO !=usuario && PASSWORD.equals(contraseña)) {
            System.out.println("usuario invalido");
        } else if (USUARIO.equals(usuario)&&PASSWORD!=contraseña) {
            System.out.println("Password incorrecta");
        }else {
            System.out.println("Usuario y Password incorrectas");
        }
    }
}
