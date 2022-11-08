package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.models.Aluno;
import me.dio.academia.digital.models.AvaliacaoFisica;
import me.dio.academia.digital.models.dtos.AlunoDto;
import me.dio.academia.digital.models.dtos.AlunoUpdateDto;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoDto aluno) {
        Aluno newAluno = new Aluno();
        newAluno.setNome(aluno.getNome());
        newAluno.setDataDeNascimento(aluno.getDataDeNascimento());
        newAluno.setCpf(aluno.getCpf());
        newAluno.setBairro(aluno.getBairro());

        alunoRepository.save(newAluno);
        return newAluno;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDto formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }
}
