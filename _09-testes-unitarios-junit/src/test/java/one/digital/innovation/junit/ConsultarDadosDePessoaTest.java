package one.digital.innovation.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest{

    @BeforeAll
    static void configurarConexão(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Arthur",  LocalDate.of(1996,8,1)));
    }

    @AfterEach
    void removerDadosParaTeste(){
        BancoDeDados.removeDados(new Pessoa("Arthur",  LocalDate.of(1996,8,1)));
    }


    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
