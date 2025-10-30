package zona_fit;

import java.util.Scanner;

public class Ciclos {
   static String[] nombres= {"ana", "juan", "ema", "eliseo"};
    static int f = 3;
    static int c = 3;
    static String[][] tablero = new String[f][c];


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        tablero[1][1] = "X";

//        adiviananza(sc);

//        recorreArrregloFor();
//
//        recorreArrregloForEach();
        llenarArregloBi(sc);
        recorrerArregloBi();

    }
    public static void recorrerArregloBi() {
        System.out.println("--- Mostrando Tablero ---");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.println("Celda: [" + i + "][" + j + "]=" + tablero[i][j]);
            }
        }
    }

    public static void llenarArregloBi(Scanner scanner) {
        System.out.println("--- Llenando Tablero ---");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.println("Agregue valor en la Celda: [" + i + "][" + j + "]=");

                tablero[i][j] = scanner.nextLine();
            }
        }
    }
    public static void recorreArrregloFor()
    {

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre: "+ nombres[i]);
        }
    }

    public static void recorreArrregloForEach()
    {

      for (String nombre :nombres){
          System.out.println("forEach Nombre: " + nombre);
      }
    }
    public static void adiviananza(Scanner sc)
    {
        int numRandom = (int)(Math.random() * 10);

        int num = 0;

        int contador = 0;

        do {
            System.out.println("Adivina el número (entre 0 y 9):");

            num = sc.nextInt();

            contador++;
        }
        while (num != numRandom );

        System.out.println("¡Acertaste! El número era: " + num + ". Lo lograste en " + contador + " intentos.");

    }
}