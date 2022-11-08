import java.util.Arrays;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getContas() {
        System.out.println("*** Contas no Banco: "+nome);

       return contas.toString();
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
