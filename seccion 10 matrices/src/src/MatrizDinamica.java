import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        System.out.println("Matriz dinamica");
        var sc= new Scanner(System.in);

        System.out.println("ingresa la cantidad de filas de la matriz");
        var filas= sc.nextInt();

        System.out.println("ingresa la cantidad de columnas de la matriz");
        var columnas = sc.nextInt();

        var matriz = new int[filas][columnas];

        //este for recorre la matriz para pedirle al usuario que proporcione los valores para cada posicion en especifico

        for (var i = 0; i< matriz.length; i++){

            for (var c =0; c < matriz[i].length; c++){
                System.out.println("porfavor ingresa el valor de la posision"+i+" "+c);
               matriz [i][c]= sc.nextInt();

            }
        }
        //y con este for interamos los valores de la matriz
        for (var i = 0; i < matriz.length; i++){

            for (var c =0; c < matriz[i].length; c++){
                System.out.println("valor["+i+"]["+c+"] = "+matriz[i][c]);

            }
        }
    }
}
