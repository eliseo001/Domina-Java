public class omparacionCadenas {
    public static void main(String[] args) {
        System.out.println("Comparacion de cadenas (pool de cadenas)");
        var cadena1 = "java";
        var cadena2 = "java";
        var cadena3 = new String("java");
        //comparacion de cadenas ( ==)

        System.out.print("cadena1 es igual en referencia a cadena2: " );
        System.out.println(cadena1 == cadena2);
        //comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia a cadena3: " );
        System.out.println(cadena1 == cadena3);

        //comparar contenido con el metodo equals
        System.out.print("Cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));


    }
}
