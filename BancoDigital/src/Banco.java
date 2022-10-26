import java.util.Arrays;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public void getContas() {
        System.out.println("*** Contas no Banco: "+nome);
       contas.forEach(item->{
           System.out.println("Cliente: "+item.cliente.getNome());
           System.out.println("Agencia: "+item.agencia);
           System.out.println("Numero da conta: "+item.numero);
           System.out.println(String.format("Saldo: %.2f",item.saldo));
       });
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
}
