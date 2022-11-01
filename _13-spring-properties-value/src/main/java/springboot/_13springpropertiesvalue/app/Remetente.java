package springboot._13springpropertiesvalue.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    @Value("${remetente.nome}")
    private String nome;
    @Value("${remetente.email}")
    private String email;
    @Value("${remetente.telefones}")
    private List<Long> telefones = new ArrayList<>(List.of(9201920192L));

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
