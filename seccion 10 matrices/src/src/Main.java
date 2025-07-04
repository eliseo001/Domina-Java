//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //matrices
        System.out.println("matrices en java");

        //defino la matriz
      // int [][]matriz = new int[2][3];

       var matriz = new int[][]{
               {2,3,4},
               {10,20,30}
       };
       //modificar valores matriz




    //recorrer la matriz
        for (var i = 0; i < matriz.length; i++){ //recorro las filas


            for (var v = 0; v<matriz[i].length;v++){ //recorro las columnas
                System.out.println("valor["+i+"]["+v+"] = "+matriz[i][v]);

            }

        }


    }
}