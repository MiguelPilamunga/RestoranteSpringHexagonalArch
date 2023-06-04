package ec.edu.epn.proyecto_metodologias_agiles.Aplication;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort.PlatosInputPort;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort.PlatosJPAInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PlatosUseCase implements PlatosInputPort {
    @Autowired
    PlatosJPAInterface platosJpaInterface;

    @Override
    public Plato createPlatoRestaurante( Plato plato) {
        return platosJpaInterface.save(plato);
    }

    @Override
    public Optional<Plato> getById( Long PlatoRestaurante_id) {
        return platosJpaInterface.findById(PlatoRestaurante_id);
    }

    @Override
    public ArrayList<Plato> getAllDishes() {
        return ((ArrayList<Plato>) platosJpaInterface.findAll());
    }

}
