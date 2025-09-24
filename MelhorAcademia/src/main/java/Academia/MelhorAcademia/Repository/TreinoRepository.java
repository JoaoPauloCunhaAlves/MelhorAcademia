package Academia.MelhorAcademia.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import Academia.MelhorAcademia.Model.Treino;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Integer> {
    
} 
