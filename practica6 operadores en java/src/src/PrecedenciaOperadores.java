public class PrecedenciaOperadores {
    public static void main(String[] args) {
        System.out.println("Precedencia de operadores en java;");
        //1. parentesis y corchetes
        //2. operadores unarios-, ++, --
        //3. operadores aritmeticos *, / y %
        //4. operadores arimeticos+ y.-.
        //5. relacionales <, <= ,> , =>
        //6. equivalencias == y !=
        //7. logicos && ||
        //8. asignacion =, +=, -=, *=, etc
        //exprecion
        //paso 1. division 12/3 = 4 /paso2. multiplicacion 2*3= 6 /paso3. 4+6 = 10 /paso4. 10-1 = 9
        var a= 12/3+2*3-1;
        System.out.println(a);
    }
}
