import java.util.Scanner;

public class AutenticadorUsuario {
    public static void main(String[] args) {
        System.out.println("Sistema de autenticacion de usuario");
        
        final var USUARIO = "Eliseo";
        final var CONTRASEÑA = "1234";
        var sc = new Scanner(System.in);
        System.out.print("Cual es tu usuario? ");
        var usuarioIngreso = sc.nextLine();
        System.out.print("Cual es tu contraseña? ");
        var contraseñaIngreso =sc.nextLine();
        
        var acceso = USUARIO.equals(usuarioIngreso) && CONTRASEÑA.equals(contraseñaIngreso);
        System.out.println("Los datos son correctos? " + acceso);
    }
}
