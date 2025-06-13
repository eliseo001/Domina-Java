public class indicesCadena {
    public static void main(String[] args) {
        System.out.println("indice cadenas");

        var cadena1= "hola mundo";



        //recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);//recuperar el valor de h
        System.out.println(primerCaracter);
        //recuperar el ultimo caracter (en la posision 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        var caracter= cadena1.charAt(5);
        System.out.println("caracterS = " + caracter);
    }
}
