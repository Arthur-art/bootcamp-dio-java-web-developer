package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.models.Aluno;
import me.dio.academia.digital.models.Matricula;
import me.dio.academia.digital.models.dtos.MatriculaDto;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    AlunoRepository alunoRepository;
    @Autowired
    MatriculaRepository matriculaRepository;

    @Override
    public Matricula create(MatriculaDto form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.getById(id);
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public List<Matricula> getMatriculasByBairro(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }
    }
}
