package me.dio.academia.digital.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDto {

  @NotBlank(message = "Preencha o campo corretamente.")
  private Long alunoId;

  @NotBlank(message = "Preencha o campo corretamente.")
  private double peso;

  @NotBlank(message = "Preencha o campo corretamente.")
  private double altura;
}
