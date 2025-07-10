public class ArgunmentosVariables {
    public static void main(String[] args) {
        System.out.println("Metodos variables");
        //imprimirNumeros(1,2,3,4,5);
        variosParametros("Karla",10,20,30);
    }

     static void variosParametros(String nombre, int... numeros) {
         System.out.println("Nombre: "+nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros){//parametos de argumentos variables
        for (var i =0; i< numeros.length;i++)
            System.out.print(numeros[i]+ " ");
    }
}
