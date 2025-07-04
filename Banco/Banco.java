import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Ciudad ciudad;
    private List<Cliente> clientes;

    public Banco(Ciudad ciudad) {
        this.ciudad = ciudad;
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void mostrarClientes() {
        System.out.println("\nClientes registrados en la ciudad de " + ciudad.getNombre() + ":");
        for (Cliente c : clientes) {
            System.out.println("- " + c.getNombre() + " | Servicio: " + c.getServicioAdquirido());
        }
    }
}
