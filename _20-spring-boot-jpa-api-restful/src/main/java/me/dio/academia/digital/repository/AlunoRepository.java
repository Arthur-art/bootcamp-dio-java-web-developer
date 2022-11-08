package me.dio.academia.digital.repository;

import me.dio.academia.digital.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
