package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteJPARepository extends JpaRepository<Cliente,Long> {
}
