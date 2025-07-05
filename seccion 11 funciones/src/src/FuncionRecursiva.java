public class FuncionRecursiva {
    public static void main(String[] args) {
        System.out.println("Funciones recursivas");
        funcionRecursiva(5);
    }
    //imprime los numeros del 1 al 5 de manera recursiva
    static void funcionRecursiva(int num){
        if (num ==1){
            System.out.print(num+" ");
        }else {
            funcionRecursiva(num-1);
            System.out.print(num+" ");
        }
    }
}
