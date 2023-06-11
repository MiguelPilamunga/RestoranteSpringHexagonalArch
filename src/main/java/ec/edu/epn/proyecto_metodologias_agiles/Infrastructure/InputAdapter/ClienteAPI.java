package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputAdapter;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Cliente;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.ClienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/clientes")
public class ClienteAPI {

    @Autowired
    ClienteInputPort clienteInputPort;
    @GetMapping
    public ArrayList<Cliente> getAll(){
        return clienteInputPort.getAllClientes();
    }

    @PostMapping(value = "/createCustomer" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente createCustomer(@RequestBody Cliente cliente){
        System.out.println("entra al post ");
        return clienteInputPort.createCliente(cliente);
    }

}
