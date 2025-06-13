//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //cadenas
        System.out.println("manejo de cadenas");
        var cadena1 = "Hola";
        var cadena2 = new String("mundo");//se crea un objeto en java formal
        var cadena3 = cadena1 + " " + cadena2;
        var cadena4 = """
                
               "Este 
                es un texto
                multilinea"
                """;

        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);
        System.out.println("cadena4 = " + cadena4);

    }
}