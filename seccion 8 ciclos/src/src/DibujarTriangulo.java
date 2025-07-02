import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("Dibujar Triangulo");
        var sc =  new Scanner(System.in);
        System.out.println("intrudusca el numero de filas: ");
        var nFilas = sc.nextInt();
        //interamos en las filas
        for(var fila = 1; fila<=nFilas;fila++){
            var espaciosBlanco = " ".repeat(nFilas-fila);
            var astericos = "*".repeat(2*fila-1);
            System.out.println(espaciosBlanco+astericos);
        }

    }
}
