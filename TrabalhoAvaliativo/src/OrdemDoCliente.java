import java.util.ArrayList;
import java.util.List;

public class OrdemDoCliente {
    private List<Cliente> clientes;

    public OrdemDoCliente() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}
