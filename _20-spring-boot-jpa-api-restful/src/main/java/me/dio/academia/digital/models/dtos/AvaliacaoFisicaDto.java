package me.dio.academia.digital.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDto {

  private Long alunoId;

  private double peso;

  private double altura;
}
