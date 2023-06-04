package ec.edu.epn.proyecto_metodologias_agiles;

import ec.edu.epn.proyecto_metodologias_agiles.Aplication.PlatosUseCase;
import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
@SpringBootTest
class ProyectoMetodologiasAgilesApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void guardar(){

		Plato plato = Plato.builder().id(2L).nombre("m").precio(12.2).reseña("rico").descripcion("d").build();
		PlatosUseCase platoUC = new PlatosUseCase();
		Plato platoGuardado =platoUC.createPlatoRestaurante(plato);

		assertEquals(plato,platoGuardado,"se guarda el plato ");
	}

}
