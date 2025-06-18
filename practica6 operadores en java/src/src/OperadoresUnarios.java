public class OperadoresUnarios {

    public static void main(String[] args) {
        System.out.println("operadores unarios");
        int a = 3, b=-2, resultado= 0;
        var c = true;
        //operador unario + no modifica el valor de la variable
        resultado= +a;
        System.out.println("resultado +a = " + resultado);
        //operador unario -   invierte el signo de nuestra variable
        resultado= -a;
        System.out.println("resultado -a= " + resultado);

        //operadores unarios de incremento/decremento
        //pre-incremento
        a= 3;
        resultado =++a;  //primero se incrementa el valor
        System.out.println("resultado ++a= " + resultado);
        System.out.println(a);
        //pos-incremento
        a= 3;
        resultado = a++;//primero se usa el valor y despues se incrementa
        System.out.println("resultado a++= " + resultado);
        System.out.println("a ene este momento se incrementa: "+a);

        //Pre-decremento
        b= -2;
        resultado = --b; //primero se incrementa y luego se usa el valor de esta variable
        System.out.println("resultado --b= " + resultado);
        b= -2;
        resultado = b--;//primero se usa el valor y despues se incrementa
        System.out.println("resultado b--= " + resultado);
        System.out.println("b en este momento se decrementa = "+b);
    }
}
