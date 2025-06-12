public class variable {

    public static void main(String[] args) {
        System.out.println("variables var");
        String nombre1 = "juan";
        System.out.println("nombre1 = " + nombre1);

        //con el uso de var
        var nombre2 = "carlos";
        System.out.println("nombre2 = " + nombre2);
        //definiendo otras variables
        var edad= 30; //se infiere tipo int
        System.out.println("edad = " + edad);
        
        var sueldo = 500.3F; // se infiere tipo floar
        System.out.println("sueldo = " + sueldo);
        
        var esCasado = false; // se infiere tipo boolean
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);
        // esCasado = "no"; no podemos asignarle un tipo distinto
        // se debe definir su valor al declarar la varaible
        // var precio;  tenemos que asignar un valor al declararla
        //precio = 10;
        // se debe poder inferir el tipo de dato
        //var apellido = null; no se puede inferir el tipo de dato

    }
}
