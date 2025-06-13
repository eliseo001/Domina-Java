public class inmutabilidadCadena {
    public static void main(String[] args) {
        System.out.println("inmutabilidad cadenas");

        var cadena1 = "hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "adios";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena1 modificada   = " + cadena1);

        
    }
}
