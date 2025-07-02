import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Arreglos");
        int[]enteros;
        enteros= new int[5];//indice del o al 4

        //declarar e inicializar el arreglo en la misma linea
        int[] numeros = new int[3];
        enteros [0] = 13;//al indice 0 le asignamos el valor de 13
        enteros [1] = 2;
        enteros [4] = 21;

        System.out.println("valor 1: "+ enteros[0]);

        int[]num ={100,200,300,400,500};//asignamos los valores desde el inicio


        for (var i=0;i<num.length;i++){// de esta manera recorremos lo indices des de el valor de i = 0 hasta i<a 5
            System.out.println("valor del indice: "+i+ " = "+num[i]);
        }


        //introduccion de valores a un arrreglo
        var sc = new Scanner(System.in);
        System.out.println("Porporciona el largo del arreglo: ");
        var largoAreglo = sc.nextInt();
        var arreglito = new int[largoAreglo];
        //solicitaremos los valores del arreglo

        for (var i =0;i<largoAreglo;i++){
            System.out.println("Prporciona enteros["+i+"] =");
            arreglito[i] = sc.nextInt();
        }
        // imprimimos los valores del arreglo
        for (var n=0;n<largoAreglo;n++){
            System.out.println(arreglito[n]);
        }



    }
}