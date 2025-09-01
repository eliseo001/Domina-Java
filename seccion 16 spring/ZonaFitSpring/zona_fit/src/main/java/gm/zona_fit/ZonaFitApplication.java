package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

//@SpringBootApplication

public class ZonaFitApplication implements CommandLineRunner {

	//@Autowired
	private IClienteServicio clienteServicio;



	private static final Logger logger =
			LoggerFactory.getLogger(ZonaFitApplication.class);

	String nl = System.lineSeparator();
	public static void main(String[] args) {
		logger.info("Iniciando la aplicación");
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicación inicializada correctamente 🚀");
	}

	@Override
	public void run(String... args) throws Exception {

		zonaFitApp();
	}
	private	void zonaFitApp(){
	//	logger.info(nl+"*** Aplicacion Zona Fit (GYM) ***"+nl);
		var salir = false;
		var sc = new Scanner(System.in);
		while (!salir){
			var opcion = mostrarMenu(sc);
			salir= ejecutarOpciones(sc, opcion);
			logger.info(nl);

		}
	}
	private int mostrarMenu(Scanner sc){
		logger.info("""		
		\n*** Aplicacion Zona Fit (GYM) ***		
		1. Listar clientes
		2. Buscar cliente
		3. Agregar cliente
		4. Modificar cliente
		5. Eliminar cliente
		6. Salir
		Elisege una opcion\s""");
		return  Integer.parseInt(sc.nextLine());

	}
	private boolean ejecutarOpciones(Scanner sc, int opcion){
		var salir = false;
		switch (opcion){
			case 1->{
				logger.info(nl +"--- Listasdo de clientes ---"+ nl);
				List<Cliente> clientes = clienteServicio.listarCliente();
				clientes.forEach(cliente -> logger.info(cliente.toString()+nl));
			}
			case 2->{
				logger.info(nl +"--- Buscar clientes por id ---"+ nl);
				var idCliente = Integer.parseInt(sc.nextLine());
				Cliente cliente = clienteServicio.bucarClientePorId(idCliente);
				if(cliente!=null){
					logger.info("Cliente encontrado: "+ cliente+nl);

				}else {
					logger.info("Cliente no encontrado: "+ cliente+nl);
				}
			}
			case 3->{
				logger.info(nl+"--- Agregar cliente ---"+ nl);
				logger.info("Nombre: ");
				var nombre = sc.nextLine();
				logger.info("Apellido: ");
				var apellido = sc.nextLine();
				logger.info("Membresia: ");
				var membresia = Integer.parseInt(sc.nextLine());
				var cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				clienteServicio.guardarCliente(cliente);
				logger.info("Cliente agregado: "+cliente+nl);
			}
			case 4->{
				logger.info(nl+"--- Modificar cliente ---"+nl);
				logger.info("Id cliente: ");
				var idCliente = Integer.parseInt(sc.nextLine());
				Cliente cliente= clienteServicio.bucarClientePorId(idCliente);
				if (cliente!=null){
					logger.info("Nombre: ");
					var nombre = sc.nextLine();
					logger.info("Apellido: ");
					var apellido = sc.nextLine();
					logger.info("Membresia: ");
					var membresia = Integer.parseInt(sc.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente modificado "+cliente+ nl);
				}else {
					logger.info("Cliente no encontrado: "+ idCliente);
				}
			}
			case 5->{
				logger.info(nl+"--- Eliminar cliente por id---"+ nl);
				logger.info("Cliente a eliminar: ");
				var idCliente = Integer.parseInt(sc.nextLine());
				var cliente = clienteServicio.bucarClientePorId(idCliente);
				if (cliente!=null){
					clienteServicio.eliminarCliente(cliente);
					logger.info("Cliente eliminado: "+ cliente+nl);
				}else {
					logger.info("Cliente no encontrado: "+ cliente+nl);
				}
			}
			case 6->{
				logger.info("Hasta pronto!"+nl+nl);
				salir = true;

			}
			default -> logger.info("Opcion no reconocida "+opcion+nl);
		}
		return salir;
	}
}