package me.dio.academia.digital.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {

  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente.")
  @CPF(message = "Cpf invalid.")
  private String cpf;

  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  private LocalDate dataDeNascimento;
}
