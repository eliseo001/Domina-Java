public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador ternario");
        //sintaxi
        //condicion ? exp1 : exp2
        //Determinar si un numero es par o no
        var numero =4;
        var resultado =(numero%2 == 0)? "Par" : "Impar";
        System.out.println("el numero = "+numero+" es: " + resultado);
        
        //calcular si es mayor de edad
        var edad= 17;
        var mensaje = (edad>=18 ? "eres mayor de edad": "eres menor de edad");
        System.out.println("Tienes la edad de: "+edad+", " + mensaje);

        //valor positivo, negativo 0 cero(operador ternario pero anidado

        numero=10;
        resultado=(numero>0 ? "positivo": (numero <0) ?"negativo":"cero");
        System.out.println("El numero: "+numero +", es "+ resultado);
    }
}
