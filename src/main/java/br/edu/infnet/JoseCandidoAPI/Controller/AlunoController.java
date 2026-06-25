package br.edu.infnet.JoseCandidoAPI.Controller;


import br.edu.infnet.JoseCandidoAPI.model.service.AlunoService;
import br.edu.infnet.JoseCandidoAPI.modelDomain.Aluno;
import br.edu.infnet.JoseCandidoAPI.modelDomain.Endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/aluno")

public class AlunoController {


    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService){
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> obterLista(){
        return alunoService.obterList();
    }

    @GetMapping(value = "/{id}")//https://localhost:8080/api/aluno/nomes
    public Aluno obterPorId(@PathVariable Integer id){

        return alunoService.obterPorId(id);
    }

}
