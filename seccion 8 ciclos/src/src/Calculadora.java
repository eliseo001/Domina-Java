import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Aplicacion calculadora");
        var salir=false;
        var sc = new Scanner(System.in);
        var num1 = 0.0;
        var num2= 0.0;
        while (!salir){
            System.out.print("""
                    Seleccione una opcion de la calculadora
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
            var opcion = sc.nextInt();
            switch (opcion){
                case 1-> {
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextDouble();
                    var resultado = num1+num2;
                    System.out.printf("Resultado %.2f + %.2f = %.2f \n",num1,num2,resultado);
                }
                case 2->{
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextDouble();
                    var resultado = num1-num2;
                    System.out.printf("Resultado %.2f - %.2f = %.2f \n",num1,num2,resultado);
                }
                case 3->{
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextDouble();
                    var resultado = num1*num2;
                    System.out.printf("Resultado %.2f * %.2f = %.2f \n",num1,num2,resultado);
                }
                case 4-> {

                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextDouble();
                    if (num2 != 0){
                        var resultado = num1/num2;
                        System.out.printf("Resultado %.2f / %.2f = %.2f \n",num1,num2,resultado);
                    }else {
                        System.out.println("Error: Division por cero");
                    }


                }
                case 5->{
                    System.out.println("Saliendo de la calculadora");
                    salir=true;
                }
                default -> System.out.println("opcion no valida ingrese una nueva opcion");


            }

        }
    }
}
