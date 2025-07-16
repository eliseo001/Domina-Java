package maquina_snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();

    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);

        //creamos la lista de productos de tipo snack
        List<Snack> prductos = new ArrayList<>();
        System.out.println("*** Maquina de snacks ***");
        Snacks.mostrarSnacks(); //mostrramos el inventario de snack disponibles
        while (!salir){
            try {
             var opcion = mostrarMenu(consola);
             salir = ejecutarOpciones(opcion,consola,prductos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }finally {
                System.out.println();//imprime un salto de linea con cada iteracion
            }
        }
    }


    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menu:
                1. comprar snack
                2. mostrar tikect
                3. agregar nuevo scnack
                4. salir
                Elige una opocion:\s""");
        //leemos y retornamos la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir= false;
        switch (opcion){
            case 1 -> comprarSnack(consola,productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("saliendo de la maquina de snacks..........");
                return salir=true;
            }default -> System.out.println("Opcion invalida: "+ opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.print("que snack desea comprar (id)?");
        var idSnack = Integer.parseInt(consola.nextLine());
        //validar que el snack exisata en la lista de scnaks
        var snackEncontrado = false;
        for(var snack : Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()) {
            productos.add(snack);
                System.out.println("ok, snack agregado: "+ snack);
                snackEncontrado =true;
                break;
            }
        }

        if(!snackEncontrado){
            System.out.println("id de snack no encontrado: "+ idSnack);
        }
    }

    public static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de venta ***";
        var total = 0.0;
        for(var producto : productos){
            ticket += "\n\t- "+ producto.getNombre() +" - $"+ producto.getPrecio();
            total += producto.getPrecio();

        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }


    private static void agregarSnack(Scanner consola){
        System.out.println("Nombre del snack: ");
        var nombre= consola.nextLine();
        System.out.println("Precio del snack: ");
        var precio  = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("tu snack se ha agregado corretacmente");
        Snacks.mostrarSnacks();
    }
}
