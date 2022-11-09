package me.dio.academia.digital.controller;

import me.dio.academia.digital.models.Matricula;
import me.dio.academia.digital.models.dtos.MatriculaDto;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping("/create-matricula")
    public Matricula create(@Valid @RequestBody MatriculaDto form) {
        return service.create(form);
    }

    @GetMapping("/get-matriculas")
    public List<Matricula> getAll() {
        return service.getAll();
    }
    @GetMapping("/get-matricula-by-bairro")
    public List<Matricula> getMatriculasByBairro(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getMatriculasByBairro(bairro);
    }
}
