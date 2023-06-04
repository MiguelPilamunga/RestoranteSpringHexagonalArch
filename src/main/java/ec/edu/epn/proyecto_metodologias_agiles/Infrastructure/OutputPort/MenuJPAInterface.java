package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuJPAInterface extends JpaRepository<Menu,Long> {

}
