package ec.edu.epn.proyecto_metodologias_agiles.Domain;
import jakarta.persistence.*;
import lombok.*;
@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "platos")
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private double precio;


    @Column(name = "resena")
    private String reseña;

}
