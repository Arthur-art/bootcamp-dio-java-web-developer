package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Arthur", LocalDate.of(1996,8,1));
        Assertions.assertEquals(26,pessoa.getIdade());
    }
}
