package springboot.springbootintroducao;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String nome;
    private Integer idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
