package Academia.MelhorAcademia.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("/treino")
@CrossOrigin(origins = "*")
public class TreinoController {
    @Autowired
    private Academia.MelhorAcademia.Repository.TreinoRepository treinoRepository;

    public TreinoController(Academia.MelhorAcademia.Repository.TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    @GetMapping
    public java.util.List<Academia.MelhorAcademia.Model.Treino> getAllTreinos() {
        return treinoRepository.findAll();
    }

    @PostMapping
    public Academia.MelhorAcademia.Model.Treino createTreino(@org.springframework.web.bind.annotation.RequestBody Academia.MelhorAcademia.Model.Treino treino) {
        return treinoRepository.save(treino);
    }
}
