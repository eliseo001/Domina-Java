package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }
     private static void zonaFitApp(){
        var salir = false;
        var sc = new Scanner(System.in);
        //creamos un objeto de la clsase clientela
         IClienteDAO clienteDao =  new ClienteDAO();
         while (!salir){
             try {
              var opcion =  mostrarMenu(sc);
               salir = ejecutarOpciones(sc,opcion, clienteDao);
             }catch (Exception e){
                 System.out.println("Error al ejecutar opcione"+ e.getMessage());
             }
             System.out.println();
         }
     }
     private static int mostrarMenu(Scanner sc){
         System.out.print("""
                 1. Listar clientes 
                 2. Buscar cliente
                 3. Agregar cliente
                 4. Modificar cliente
                 5. Eliminar cliente
                 6. Salir
                 Elije una opcion:\s""");
         return Integer.parseInt(sc.nextLine());

     }
     private static boolean ejecutarOpciones(Scanner sc, int opcion, IClienteDAO clienteDAO){
        var salir =false;
        switch (opcion){
            case 1->{
                System.out.println("---Listado de clientes---");
                var clientes = clienteDAO.listaraCliente();
                clientes.forEach(System.out::println);
            }
            case 2->{
                System.out.println("---Buscar cliente---");
                System.out.println("introduce el id del cliente a buscar");
                var idCliente = Integer.parseInt(sc.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado){
                    System.out.println("Cliente encontrado "+ cliente);
                }else {
                    System.out.println("Cliente no encontrado "+ idCliente);
                }

            }
            case 3 -> {
                System.out.println("---Agregar Cliente");
                System.out.println("Nombre: ");
                var nombre= sc.nextLine();
                System.out.println("Apellido");
                var apellido= sc.nextLine();
                System.out.println("Membresia");
                var membresia = Integer.parseInt(sc.nextLine());
                var cliente = new Cliente(nombre, apellido,membresia);
                var agregado = clienteDAO.agregarCliente(cliente);

                if (agregado){
                    System.out.println("Cliente agregado: "+ cliente);
                }else {
                    System.out.println("Cliente no agregado: "+ cliente);
                }
            }
            case 4 -> {
                System.out.println("---Modificar cliente---");
                System.out.println("Ingrese el id del cliente:");
                var idCliente = Integer.parseInt(sc.nextLine());
                System.out.println("Nombre");
                var nombre= sc.nextLine();
                System.out.println("Apellido");
                var apellido = sc.nextLine();
                System.out.println("Membresia");
                var membresia = Integer.parseInt(sc.nextLine());
                //crea obejetoa  modificar
                var cliente = new Cliente(idCliente,nombre,apellido,membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if(modificado){
                    System.out.println("Cliente modificado: "+ cliente);
                }else {
                    System.out.println("Cliente no modificado: "+cliente);
                }
            }
            case 5 ->{
                System.out.println("---Eliminar cliente---");
                System.out.println("Ingrese el id del cliente a eliminar:");
                var idCliente =  Integer.parseInt(sc.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.elimianarCliente(cliente);

                if (eliminado){
                    System.out.println("Cliente eliminado: "+ cliente);
                }else {
                    System.out.println("Error al eliminar: "+cliente);
                }

            }
            case 6 ->{
                System.out.println("Hasta pronto");
                salir =true;

            }
            default -> System.out.println("Opcion no reconocida "+opcion);
        }
        return salir;
     }
}
