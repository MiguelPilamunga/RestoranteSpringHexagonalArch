package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Cliente;

import java.util.ArrayList;
import java.util.Optional;

public interface ClienteInputPort {
    Cliente createCliente(Cliente cliente);

    Optional<Cliente> getById(Long clienteId);

    ArrayList<Cliente> getAllClientes();

    void updateCliente(Cliente cliente);

    void deleteCliente(Cliente cliente);
}
