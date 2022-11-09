package me.dio.academia.digital.repository;

import me.dio.academia.digital.models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /**
     *
     * @param bairro bairro referência para o filtro
     * @return lista de alunos matriculados que residem no bairro passado como parâmetro
     */
    @Query(value = "SELECT * FROM tab_matriculas m " +
    "INNER JOIN tab_alunos a ON m.aluno_id = a.id " +
    "WHERE a.bairro = :bairro ", nativeQuery = true)
   // @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
    List<Matricula> findAlunosMatriculadosBairro(String bairro);

    //List<Matricula> findByAlunoBairro(String bairro);
}
