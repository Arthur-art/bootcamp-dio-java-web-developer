package me.dio.academia.digital.controller;

import me.dio.academia.digital.models.AvaliacaoFisica;
import me.dio.academia.digital.models.dtos.AvaliacaoFisicaDto;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @GetMapping("/get-avaliacoes-fisicas")
    public List<AvaliacaoFisica> getAvaliacoesFisicas(){
        return avaliacaoFisicaService.getAll();
    }

    @PostMapping("/create-avaliacao-fisica")
    public AvaliacaoFisica createAvaliacaoFisica(@RequestBody AvaliacaoFisicaDto avaliacaoFisica){
        return avaliacaoFisicaService.create(avaliacaoFisica);
    }
}
