package ec.edu.epn.proyecto_metodologias_agiles.Aplication;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Cliente;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.ClienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class PersonaUseCase implements ClienteInputPort {



    @Override
    public Cliente createCliente(Cliente cliente) {
        return null;
    }

    @Override
    public Optional<Cliente> getById(Long clienteId) {
        return Optional.empty();
    }

    @Override
    public ArrayList<Cliente> getAllClientes() {
        return null;
    }

    @Override
    public void updateCliente(Cliente cliente) {

    }

    @Override
    public void deleteCliente(Cliente cliente) {

    }
}
