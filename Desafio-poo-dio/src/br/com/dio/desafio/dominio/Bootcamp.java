package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dateInicio;
    private LocalDate dateFim;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devs = new LinkedHashSet<>();
}
