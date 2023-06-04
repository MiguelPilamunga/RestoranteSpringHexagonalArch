package ec.edu.epn.proyecto_metodologias_agiles.Aplication;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Menu;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.MenuInputPort;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort.MenuJPAInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Component
@Service

public class MenuUseCase implements MenuInputPort {

    @Autowired
    MenuJPAInterface menuJPAInterface;
    @Override
    public Menu createMenu(Menu menu) {
        return menuJPAInterface.save(menu);
    }

    @Override
    public Optional<Menu> getById(Long Menu_id) {
        return menuJPAInterface.findById(Menu_id);
    }

    @Override
    public ArrayList<Menu> getAllMenu() {
        return ((ArrayList<Menu>) menuJPAInterface.findAll());
    }
}
