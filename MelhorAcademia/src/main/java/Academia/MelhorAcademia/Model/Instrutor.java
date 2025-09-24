package Academia.MelhorAcademia.Model;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int telefone;

    @OneToMany(mappedBy = "instrutor")
        private List<Aluno> alunos;
}
