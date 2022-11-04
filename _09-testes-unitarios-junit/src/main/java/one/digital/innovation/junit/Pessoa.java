package one.digital.innovation.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public boolean ehMaiorIdade(){
        return getIdade() >= 18;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}
