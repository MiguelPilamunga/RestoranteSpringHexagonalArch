package ec.edu.epn.proyecto_metodologias_agiles.Aplication;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Cliente;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.ClienteInputPort;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort.ClienteJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteUseCase implements ClienteInputPort {

    @Autowired
    ClienteJPARepository clienteJPARepository;

    @Override
    public Cliente createCliente(Cliente cliente) {
        return clienteJPARepository.save(cliente);
    }

    @Override
    public Optional<Cliente> getById(Long clienteId) {
        return Optional.of(clienteJPARepository.getReferenceById(clienteId));
    }

    @Override
    public ArrayList<Cliente> getAllClientes() {
        return ((ArrayList<Cliente>) clienteJPARepository.findAll());
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteJPARepository.save(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteJPARepository.delete(cliente);
    }
}
