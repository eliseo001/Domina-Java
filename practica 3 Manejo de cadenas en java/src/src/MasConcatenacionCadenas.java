public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println("mas fomras de concatenar cadenas en java");
        var cadena1= "hola";
        var cadena2= "mundo";
        var cadena3= cadena1+cadena2;
        System.out.println("cadena3 = " + cadena3);
        //metodo concat
       var  cadena4 = cadena1.concat(" "). concat("mundo");
        System.out.println("cadena3 usando metodo concat: " + cadena4);

        //StrinBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado  builder= " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultado2 = stringBuffer.toString();
        System.out.println("resultado buffer = " + resultado2);

        //Join
        resultado = String.join(" ", cadena1, cadena2, "adios!");
        System.out.println("resultado join = " + resultado);


    }
}
