package me.dio.academia.digital.repository;

import me.dio.academia.digital.models.Aluno;
import me.dio.academia.digital.models.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
}
