package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dateInicial = LocalDate.now();
    private LocalDate dateFinal = dateInicial.plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDateInicial() {
        return dateInicial;
    }

    public void setDateInicial(LocalDate dateInicial) {
        this.dateInicial = dateInicial;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(LocalDate dateFinal) {
        this.dateFinal = dateFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dateInicial, bootcamp.dateInicial) && Objects.equals(dateFinal, bootcamp.dateFinal) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devsInscritos, bootcamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dateInicial, dateFinal, conteudos, devsInscritos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dateInicial=" + dateInicial +
                ", dateFinal=" + dateFinal +
                ", conteudos=" + conteudos +
                ", devsInscritos=" + devsInscritos +
                '}';
    }
}
