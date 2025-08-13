package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

public class ClienteDAO implements IClienteDAO {

    private static boolean cliente;

    @Override

    public List<Cliente> listaraCliente() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente ORDER BY id";

        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        }

        return clientes;
    }
    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        var con = getConexion();
        var sql="SELECT * FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,cliente.getId());
            rs  = ps.executeQuery();
            //pregunta si tenemos un registro a leer
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al recuperar cliente por id" +e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion" + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con =getConexion();
        String sql ="INSERT INTO cliente(nombre, apellido, membresia)"+
                " VALUES(?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getApellido());
            ps.setInt(3,cliente.getMembresia());
            ps.executeUpdate();
            return true;

        }catch (Exception e){
            System.out.println("Error al agregar cliente"+ e.getMessage());
        }finally {

            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion"+ e.getMessage());
            }
        }
        return false;

    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        var sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia()); // ✅ membresía aquí
            ps.setInt(4, cliente.getId());        // ✅ id aquí
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar cliente " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean elimianarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM cliente WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,cliente.getId());
            ps.executeUpdate();
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar cliente: "+e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion "+ e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IClienteDAO clienteDao = new ClienteDAO();

        //busca por id
        var cliente1 = new Cliente(4);
        System.out.println("Clientes antes de la busqueda: " +cliente1);
        var encontrado =  clienteDao.buscarClientePorId(cliente1);
        if(encontrado){
                System.out.println("Cliente encontrado: " + cliente1);
        }else {
                System.out.println("No se encontro el cliente: "+ cliente1.getId());
        }

        //agregar cliente
        {/*   var nuevoCliente = new Cliente("Elsieo", "Masuelli",800);
        var agregado = clienteDao.agregarCliente(nuevoCliente);
        if (agregado){
            System.out.println("cliente agregado " +nuevoCliente);
        }else {
            System.out.println("nop se agrego el cliente: "+nuevoCliente);
        }
*/}


        //modificar cliente
        System.out.println("Modificar cliente existente");
        var modificarCliente = new Cliente(7,"jose", "Lopez",400);
        var modificado = clienteDao.modificarCliente(modificarCliente);

       if (modificado){
           System.out.println("Cliente modificado: "+ modificarCliente);
       }else {
           System.out.println("No se modifico el cliente");
       }

       //Eliminar cliente
        System.out.println("Eliminar cliente por id");
       var eliminarCliente = new Cliente(8);
       var eliminado = clienteDao.elimianarCliente(eliminarCliente);
       if (eliminado){
           System.out.println("Cliente eliminado"+ eliminarCliente);
       }else {
           System.out.println("Error al eliminar cliente");
       }

        //listar clientes
        System.out.println("Listar clientes");
        var clientes = clienteDao.listaraCliente();
        clientes.forEach(System.out::println);

    }



}
