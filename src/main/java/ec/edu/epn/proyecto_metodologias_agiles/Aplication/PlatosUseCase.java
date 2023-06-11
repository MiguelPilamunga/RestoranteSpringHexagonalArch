package ec.edu.epn.proyecto_metodologias_agiles.Aplication;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.PlatosInputPort;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort.PlatosJPAInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PlatosUseCase implements PlatosInputPort {
    @Autowired
    PlatosJPAInterface platosJPAInterface;

    @Override
    public Plato createPlatoRestaurante( Plato plato) {
        return platosJPAInterface.save(plato);
    }

    @Override
    public Optional<Plato> getById( Long PlatoRestaurante_id) {
        return platosJPAInterface.findById(PlatoRestaurante_id);
    }

    @Override
    public ArrayList<Plato> getAllDishes() {
        return ((ArrayList<Plato>) platosJPAInterface.findAll());
    }

    @Override
    public void deleteDish(Plato plato){
        platosJPAInterface.delete(plato);
    }

}
