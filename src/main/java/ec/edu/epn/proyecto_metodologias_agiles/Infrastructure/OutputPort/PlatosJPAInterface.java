package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatosJPAInterface extends JpaRepository<Plato,Long> {
}
