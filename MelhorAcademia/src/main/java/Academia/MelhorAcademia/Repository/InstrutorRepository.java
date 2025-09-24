package Academia.MelhorAcademia.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import Academia.MelhorAcademia.Model.Instrutor;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {
    
}
