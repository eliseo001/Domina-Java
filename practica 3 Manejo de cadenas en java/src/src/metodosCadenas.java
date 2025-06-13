public class metodosCadenas {
    public static void main(String[] args) {
        System.out.println("Metodos de cadenas");
        // metodo de cadenas
        var cadena1= "Hola mundo";
        //obtener el largbo de una cadenba
        var longitud =cadena1.length();
        System.out.println("longitud = " + longitud);
        
        //remplaza caracteres
        var nuevaCadena = cadena1.replace('o', 'a');// remplaza los caracteres con la letra o por una a
        System.out.println("nuevaCadena = " + nuevaCadena);

        //convertir a mayusculas
        var mayusculas= cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        
        //convertir a minusculas
        var minusculas =cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);
        
        //eliminar espacios al inicio y al finald e uina cadena
        var cadena2 = " hola mundo ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());

    }
}
