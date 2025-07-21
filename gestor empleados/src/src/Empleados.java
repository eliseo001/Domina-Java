import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Empleados {
    private static boolean descuentoAplicado = false;

    private static final List<Empleado> empleados;
    static {
        empleados = new ArrayList<>();
        empleados.add(new Empleado("Eliseo","gerente",200,2));
        empleados.add(new Empleado("Manuel","Empleado",3200,0));
        empleados.add(new Empleado("Jose","gerente",100,5));
        empleados.add(new Empleado("Pedro","Empleado",2200,2));



    }

    public static List <Empleado> getEmpleados(){
        return empleados;
    }
    public static void mostrarEmpleados(){
        var todosEmpleados="";
        for (var empleado :empleados){
            todosEmpleados += empleado.toString()+"\n";
        }

        System.out.print(todosEmpleados);
        System.out.println("Se aplicaron descuentos = "+descuentoAplicado);
        if (descuentoAplicado==true){
            System.out.println("""
                    **** Descuentos aplicados en el sueldo ****
                    1 inasistencia se le desconto el 5%
                    2-4 inasistencias se le desconto el 10%
                    5 o mas inasistencias se le desconto el 20%
                    """);
        }
    }
    public static void descuntoInasistencia(){
        // boolean descuentoAplicado = false;
        if(descuentoAplicado){
            System.out.println("⚠ El descuento ya fue aplicado anteriormente.");
            return;
        }

        for ( var empleado: empleados){
            double sueldoOriginal = empleado.getSueldo();

            if(empleado.getInasistencia()==1){
                double sueldoDescuento = sueldoOriginal*0.05;
                empleado.setSueldo(sueldoOriginal-sueldoDescuento);
            }else if (empleado.getInasistencia()>=2&& empleado.getInasistencia()<4){
                double sueldoDescuento = sueldoOriginal*0.10;
                empleado.setSueldo(sueldoOriginal-sueldoDescuento);

            }else if (empleado.getInasistencia()>4 ){
                double sueldoDescuento = sueldoOriginal*0.20;
                empleado.setSueldo(sueldoOriginal-sueldoDescuento);

            }else {

            }
        }
        descuentoAplicado = true;
        System.out.println("✅ Descuento aplicado correctamente.");

    }

    public static void agregarEmpleado(Scanner sc){
        System.out.println("Ingrese nombre");
        var nombre= sc.nextLine();
        System.out.println("Ingrese puesto");
        var puesto= sc.nextLine();
        System.out.println("Ingrese sueldo");
        var sueldo = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese inasistencias");
        var inasistencia = Integer.parseInt(sc.nextLine());
        empleados.add(new Empleado(nombre,puesto,sueldo,inasistencia));
    }

    public static void eliminarEmpleado(Scanner sc){
        System.out.println("Ingrese el id del empleado que desea eliminar: ");
        int idEliminar = Integer.parseInt(sc.nextLine());
        boolean eliminado = empleados.removeIf(e -> e.getIdEmpleado() == idEliminar);
        if(eliminado){
            System.out.println("Empleado con ID "+ idEliminar+ " eliminado con exito");
        }else {
            System.out.println("Empleado con ID "+idEliminar+" no fue encontrado");
        }
    }

    public static void buscarEmpleadoNombre(Scanner sc) {
        System.out.println("Ingrese el nombre del empleado que desea buscar: ");
        String nombre = sc.nextLine().toLowerCase();

        for (Empleado e : empleados) {
            if (e.getNombre().toLowerCase().equals(nombre)) {
                System.out.println("Empleado encontrado: " + e);
                return; // cortamos la búsqueda, pero NO devolvemos nada
            }
        }

        System.out.println("No se encontró ningún empleado con ese nombre.");
    }

    public static void mostrarEmpleadosInasistencias(Scanner sc){
        System.out.println("Ver empleados con mas inasistencias, por favor ingrese cantidad ");
        int inasistencias = Integer.parseInt(sc.nextLine());

        List<Empleado> empleadosInasistencia = new ArrayList<>();

        for (Empleado e: empleados){
            if(e.getInasistencia() >= inasistencias){
                empleadosInasistencia.add(e);
            }
        }
        if (empleadosInasistencia.isEmpty()){
            System.out.println("No se encontraron empleados con "+inasistencias);
        }else {
            System.out.println("Empleados con al menos "+ inasistencias+" inasistencias");

            for (Empleado e: empleadosInasistencia){
                System.out.println(e);
            }

        }
    }
    public static void nombreAsc(){
        empleados.sort(Comparator.comparing(Empleado::getNombre));
        for(Empleado e : empleados){
            System.out.println(e);
        }
    }
    public static void nombreDesc(){
        empleados.sort(Comparator.comparing(Empleado::getNombre).reversed());
        for (Empleado e : empleados){
            System.out.println(e);
        }
    }
}
