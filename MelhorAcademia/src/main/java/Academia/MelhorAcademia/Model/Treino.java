package Academia.MelhorAcademia.Model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String duracao;
    private Date data;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
        private Aluno aluno;

}
