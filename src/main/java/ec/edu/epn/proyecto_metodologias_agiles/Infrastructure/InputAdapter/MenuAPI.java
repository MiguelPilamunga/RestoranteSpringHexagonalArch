package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputAdapter;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Menu;
import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
@Component
public class MenuAPI {

    @Autowired
    MenuAPI menuInputPort;

    @GetMapping
    public ArrayList<Plato> get(){
        System.out.println("entraget de Menu");
        return menuInputPort.get();
    }
    @PostMapping(value = "/createmenu",produces = MediaType.APPLICATION_JSON_VALUE)
    public Plato createMenu(@RequestBody Menu menu){
        return  menuInputPort.createMenu(menu);
    }

    @PostMapping(value = "/getmenu",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Plato> getMenu(@PathVariable Long id){
        return menuInputPort.getMenu(id);
    }
}
