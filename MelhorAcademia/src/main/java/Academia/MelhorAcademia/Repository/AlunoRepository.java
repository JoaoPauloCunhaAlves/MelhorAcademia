package Academia.MelhorAcademia.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import Academia.MelhorAcademia.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    
}
