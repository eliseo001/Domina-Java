import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        System.out.println("Aplicacion de cajero automatico");
        var salir=false;
        var sc= new Scanner(System.in);
        var saldo=1200.0;

        while (!salir){
            System.out.print("""
                ------Cajero------
                Operaciones qeu puede realizar:
                1. Consultar saldo
                2. Retirar
                3. Depositar
                4. Salir\s""");
            var opcion= sc.nextInt();
            switch (opcion){
                case 1 -> System.out.printf("Su saldo es: %.2f%n%n ",saldo);
                case 2 -> {System.out.println("Cuanto dinero desea retirar? ");
                    var retiro = sc.nextDouble();
                    if(retiro<=saldo){
                        saldo -=retiro;
                        System.out.println("retiro exitoso su nuevo saldo es: "+ saldo);

                    }else {
                        System.out.println("saldo insificiente, saldo actual es de: "+saldo);
                    }



                }
                case 3 -> {
                    System.out.println("Cuanto dinero desea depositar? ");
                    var ingreso = sc.nextDouble();
                    saldo +=ingreso;
                }
                case 4->{
                    System.out.println("Saliendo del sistema");
                    salir=true;
                }
                default -> System.out.println("Porfavor ingrese una opccion validad");
            }

        }
    }
}
