package ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.InputPort;

import ec.edu.epn.proyecto_metodologias_agiles.Aplication.PlatosUseCase;
import ec.edu.epn.proyecto_metodologias_agiles.Domain.Plato;
import ec.edu.epn.proyecto_metodologias_agiles.Infrastructure.OutputPort.PlatosJPAInterface;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlatosInputPortTest {

    @Test
    void getAllDishes() {
        PlatosInputPort platosInputPort =new PlatosUseCase();

        PlatosJPAInterface platosJPAInterface = Mockito.mock(PlatosJPAInterface.class);

        ArrayList<Plato> listaPlatos = new ArrayList<>();

        Plato plato1 = Plato.builder()
                .nombre("Hamburguesa")
                .descripcion("Descripción de la hamburguesa")
                .precio(9.99)
                .build();

        Plato plato2 = Plato.builder()
                .nombre("Pizza")
                .descripcion("Descripción de la pizza")
                .precio(12.99)
                .build();

        Plato plato3 = Plato.builder()
                .nombre("Ensalada")
                .descripcion("Descripción de la ensalada")
                .precio(7.99)
                .build();

        listaPlatos.add(plato1);
        listaPlatos.add(plato2);
        listaPlatos.add(plato3);

        Mockito.when(platosJPAInterface.findAll()).thenReturn(listaPlatos);

        ArrayList<Plato> listaResult= (ArrayList<Plato>) platosJPAInterface.findAll();

        assertEquals(listaPlatos, listaResult, "Request Sucessfull");


    }
}