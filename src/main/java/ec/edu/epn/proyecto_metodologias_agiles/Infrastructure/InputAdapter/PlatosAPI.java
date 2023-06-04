package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputAdapter;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.PlatosInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/platos")
@Component
public class PlatosAPI {
    @Autowired
    PlatosInputPort platosInputPort;
    @GetMapping
    public ArrayList<Plato> get(){
        System.out.println("entraget");
        return platosInputPort.getAllDishes();
    }
    @PostMapping(value = "/createplato",produces = MediaType.APPLICATION_JSON_VALUE)
    public Plato createPlato(@RequestBody Plato plato){
        return  platosInputPort.createPlatoRestaurante(plato);
    }

    @PostMapping(value = "/getdish",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Plato> getdish(@PathVariable Long id){
        return platosInputPort.getById(id);
    }

}
