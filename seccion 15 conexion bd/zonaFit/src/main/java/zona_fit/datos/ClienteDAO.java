package zona_fit.datos;

import zona_fit.dominio.Cliente;

import java.util.List;

public class ClienteDAO implements IClienteDAO {

    @Override
    public List<Cliente> listaraCliente() {
        return List.of();
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean elimianarCliente(Cliente cliente) {
        return false;
    }
}
