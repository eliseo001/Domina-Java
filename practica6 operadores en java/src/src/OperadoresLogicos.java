public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("Operadores logicos en java");
        boolean a =true, b= false;
        //and (regresa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado a && b " + resultado);

        //or (regresa verdadero si cualquiera de los valores es verdadero)
        resultado = a || b;
        System.out.println("resultado a || b " + resultado);

        // not invierte el valor logico proporcionado
        resultado = !a;
        System.out.println("resultado !a " + resultado);
    }
}
