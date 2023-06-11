package ec.edu.epn.proyecto_metodologias_agiles.Domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "administradores")
public class Administrador extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String departamento;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "contrasena")
    private String contraseña;

    @Column(name = "rol")
    private String rol;


}
