package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Menu;
import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;

import java.util.ArrayList;
import java.util.Optional;

public interface MenuInputPort {
    public Menu createMenu(Menu menu);

    public Optional<Menu> getById(Long Menu_id);

    public ArrayList<Menu> getAllMenu();
}
