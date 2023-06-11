package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;

import java.util.ArrayList;
import java.util.Optional;

public interface PlatosInputPort {
    public Plato createPlatoRestaurante(Plato plato);

    public Optional<Plato> getById(Long PlatoRestaurante_id);

    public ArrayList<Plato> getAllDishes();


    public  void deleteDish(Plato plato);
}
