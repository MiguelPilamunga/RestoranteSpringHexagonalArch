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
    @Column(name = "id" , unique = true ,nullable = false)
    private Long id;

    @Column(name = "nombre", unique = true )
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private double precio;


    @Column(name = "resena")
    private String reseña;

}
