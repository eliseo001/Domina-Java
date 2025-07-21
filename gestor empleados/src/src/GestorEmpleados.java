import java.util.List;
import java.util.Scanner;

public class GestorEmpleados {
    public static void main(String[] args) {

    gestorEmpleados();

    }

    public static void gestorEmpleados(){
        var salir =false;
        var sc = new Scanner(System.in);
        System.out.println("Gestor Empleados");
       // Empleados.mostrarEmpleados();
        while (!salir){
            try {
                var opcion = mostrarMenu(sc);
                salir = ejecutarOpcion(opcion,sc);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner sc) {
        System.out.println("""
                --- Gestor empleados ---
                Menu:
                1. Ver empleados
                2. Aplicar descuento por inasistecia
                3. Agregar empleado
                4. Eliminar empleado por ID
                5. Buscar empleado por nombre
                6. Ver empleados con inasistencias
                7. Ordenar por
                """);
        return Integer.parseInt(sc.nextLine());

    }

    private static boolean ejecutarOpcion(int opcion, Scanner sc){
        var salir =false;
        switch (opcion){
            case 1 -> Empleados.mostrarEmpleados();
            case 2 -> {
                Empleados.descuntoInasistencia();
                System.out.println("Descuento aplicado a empleados con inasistencia");
            }
            case 3 -> Empleados.agregarEmpleado(sc);
            case 4 -> Empleados.eliminarEmpleado(sc);
            case 5 -> Empleados.buscarEmpleadoNombre(sc);
            case 6 -> Empleados.mostrarEmpleadosInasistencias(sc);
            case 7 -> {
                System.out.println("""
                           Elija criteriod e ordenamiento
                           1. nombre de A-Z
                           2. nombre de Z-a
                           3. sueldo ascendente
                           4. sueldo descendente
                        """);
                int subopcion =Integer.parseInt(sc.nextLine());
                switch (subopcion){
                    case 1 -> Empleados.nombreAsc();
                    case 2 -> Empleados.nombreDesc();


                }
            }
        }
        return salir;
    }

}
