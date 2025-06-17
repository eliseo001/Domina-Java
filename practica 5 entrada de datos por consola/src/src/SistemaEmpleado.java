import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        System.out.println("Sistema empleados");
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el nombre del empleado");
        var NombreEmpleado = consola.nextLine();
        System.out.println("Ingrese la edad del empleado");
        int Edad = consola.nextInt();
        System.out.println("ingrese el salario del empleado");
        double Salario = consola.nextDouble();
        System.out.println("Es jefe del departamento");
        boolean esJefe = consola.nextBoolean();


        System.out.println("\nEmpleado: "+ NombreEmpleado+ " \nEdad: "+Edad+ "\nsalario: $"+Salario+"\nEs jefe: "+ esJefe);
    }
}
