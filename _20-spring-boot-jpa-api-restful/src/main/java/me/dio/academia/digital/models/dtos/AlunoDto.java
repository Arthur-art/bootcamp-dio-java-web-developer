package me.dio.academia.digital.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;
}
