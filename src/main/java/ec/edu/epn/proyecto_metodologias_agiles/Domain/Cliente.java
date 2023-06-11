package ec.edu.epn.proyecto_metodologias_agiles.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "clientes")
public class Cliente extends Persona {
    @Column(name = "codigo_cliente")
    private String codigoCliente;

    @Column(name = "correo_electronico")
    private String correoElectronico;
}
