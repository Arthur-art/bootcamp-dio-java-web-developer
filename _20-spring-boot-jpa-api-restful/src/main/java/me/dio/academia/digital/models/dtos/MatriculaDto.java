package me.dio.academia.digital.models.dtos;

import javax.validation.constraints.NotBlank;

public class MatriculaDto {

  @NotBlank(message = "Preencha o campo corretamente.")
  private Long alunoId;

}
