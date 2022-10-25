package poo.arthur.introducao;

public class Pessoa {

    public Pessoa(String cpf, String name){
        this.nome = name;
        this.cpf = cpf;
    }
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

