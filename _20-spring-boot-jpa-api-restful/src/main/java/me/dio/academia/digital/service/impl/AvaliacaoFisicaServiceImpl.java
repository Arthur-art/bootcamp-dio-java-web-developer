package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.models.AvaliacaoFisica;
import me.dio.academia.digital.models.dtos.AvaliacaoFisicaDto;
import me.dio.academia.digital.models.dtos.AvaliacaoFisicaUpdateDto;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    @Autowired
    AlunoRepository alunoRepository;
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDto avaliacaoFisica) {
        AvaliacaoFisica newAvaliacaoFisica = new AvaliacaoFisica();
        newAvaliacaoFisica.setAluno(alunoRepository.findById(avaliacaoFisica.getAlunoId()).get());
        newAvaliacaoFisica.setPeso(avaliacaoFisica.getPeso());
        newAvaliacaoFisica.setAltura(avaliacaoFisica.getAltura());

        avaliacaoFisicaRepository.save(newAvaliacaoFisica);
        return newAvaliacaoFisica;
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        List<AvaliacaoFisica> avaliacaoFisicas = avaliacaoFisicaRepository.findAll();
        return avaliacaoFisicas;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
