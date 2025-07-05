//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Funciones en java");
        saludar("hola");//invocamos la funcion saludar
        saludar("adios");

    }

    //funcion
    static void saludar(String mensaje){
        System.out.println("Mensaje: "+mensaje);
    }
}