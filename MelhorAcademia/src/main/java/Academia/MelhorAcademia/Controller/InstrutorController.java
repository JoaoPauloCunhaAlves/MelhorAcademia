package Academia.MelhorAcademia.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import Academia.MelhorAcademia.Model.Instrutor;

@RestController
@RequestMapping("/instrutor")
@CrossOrigin(origins = "*")
public class InstrutorController {
    @Autowired
    private Academia.MelhorAcademia.Repository.InstrutorRepository instrutorRepository;

    public InstrutorController(Academia.MelhorAcademia.Repository.InstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }

    @GetMapping
    public List<Academia.MelhorAcademia.Model.Instrutor> getAllInstrutores() {
        return instrutorRepository.findAll();
    }

    @PostMapping
    public Academia.MelhorAcademia.Model.Instrutor createInstrutor(@RequestBody Academia.MelhorAcademia.Model.Instrutor instrutor) {
        return instrutorRepository.save(instrutor);
    }
}
