package me.dio.academia.digital.controller;

import me.dio.academia.digital.models.Aluno;
import me.dio.academia.digital.models.AvaliacaoFisica;
import me.dio.academia.digital.models.dtos.AlunoDto;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @GetMapping("/get-alunos")
    public List<Aluno> getAlunos(){
      return alunoService.getAll();
    }

    @PostMapping("/create-aluno")
    public Aluno createAluno(@Valid @RequestBody AlunoDto aluno){
        return alunoService.create(aluno);
    }

    @GetMapping("/get-avaliacoes-aluno/{id}")
    public List<AvaliacaoFisica> getAvaliacaoFisica(@PathVariable Long id){
        return alunoService.getAllAvaliacaoFisica(id);
    }

    @GetMapping
    public List<Aluno> getAlunoByDateNasc(@RequestParam(value = "dataDeNascimento", required = false) String dataNascimento){
        return alunoService.getAlunoByDateNasc(dataNascimento);
    }
}
