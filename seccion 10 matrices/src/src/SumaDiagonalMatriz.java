import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("suma de la diagonal de la matriz");

        System.out.println("Matriz dinamica");
        var sc= new Scanner(System.in);
        int sumaDiagonal=0;

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
                System.out.print(matriz[i][c] + " ");
                if (i==c){
                    sumaDiagonal += matriz[i][c];

                }
            }  System.out.println(); // Salto de línea al terminar la fila
        }
        System.out.println("suma diagonal = "+sumaDiagonal);
    }
}
