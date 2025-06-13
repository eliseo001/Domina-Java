public class CaracteresEspeciales {
    public static void main(String[] args) {
        System.out.println("Caracteres especiales");
        // \n -imprimir un salto de linea
        var cadena1= "Hola\nmundo";
        System.out.println("cadena1 = " + cadena1);
        
        // \t tablador
        var cadena2 ="\thola\tmundo";
        System.out.println("cadena2 = " + cadena2);
        // \' cadena simple
        var cadena3 = "hola \'mundo";
        System.out.println("cadena3 = " + cadena3);
        
        // \"  cadena doble
        var cadena4 = "hola \"mundo";
        System.out.println("cadena4 = " + cadena4);
        
        // \\ diagonal inversa
        var cadena5 = "hola \\mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
