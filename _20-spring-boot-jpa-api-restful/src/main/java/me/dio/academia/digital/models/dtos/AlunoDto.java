package me.dio.academia.digital.models.dtos;

import lombok.Data;

import java.time.LocalDate;
@Data
public class AlunoDto {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;
}
