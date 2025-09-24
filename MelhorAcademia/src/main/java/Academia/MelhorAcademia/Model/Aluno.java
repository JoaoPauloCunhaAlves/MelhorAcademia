package Academia.MelhorAcademia.Model;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private int peso;
    private int altura;

    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Instrutor instrutor;

    @OneToMany(mappedBy = "aluno")
    private List<Treino> treinos;
}
