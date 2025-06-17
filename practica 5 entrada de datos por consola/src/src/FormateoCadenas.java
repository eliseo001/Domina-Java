public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("Formateo de cadenas");
        var nombre = "Eliseo";
        var edad= 23;
        var salario = 21000.5;
        //String.format se sustituye de izquierda a derecha %Sstring %D entero
        var mensaje= String.format("Nombre: %s,Edad: %d, salario: %.2f",nombre,edad,salario);
        System.out.println("mensaje = " + mensaje);
        //metodo printf
        System.out.printf("Nombre: %s, Edad %d, Salario %.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;

        //formateo con text block

        mensaje= """
                %nDetalle Persona:\s
                ----------------------
                \tNombre: %s
                \tN. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f%n
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println("mensaje = " + mensaje);

        //formateo con text block y print directamente   }
        System.out.printf("""
                %nDetalle Persona:\s
                ----------------------
                \tNombre: %s
                \tN. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f%n
                """,nombre,numeroEmpleado,edad,salario);
    }
}