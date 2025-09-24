package Academia.MelhorAcademia.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import Academia.MelhorAcademia.Model.Aluno;


@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "*")
public class AlunoController {
    @Autowired
    private Academia.MelhorAcademia.Repository.AlunoRepository alunoRepository;

    public AlunoController(Academia.MelhorAcademia.Repository.AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    
}
