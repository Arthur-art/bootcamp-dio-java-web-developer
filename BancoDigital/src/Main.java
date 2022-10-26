import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente arthur = new Cliente();
        Cliente suellen = new Cliente();

        arthur.setNome("Arthur");
        suellen.setNome("Suellen");

        Banco nubank = new Banco();

        Conta contaCorrenteArthur = new ContaCorrente(arthur);
        Conta contaPoupancaArthur = new ContaPoupanca(arthur);
        Conta contaCorrenteSuellen = new ContaCorrente(suellen);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(contaCorrenteArthur);
        contas.add(contaPoupancaArthur);
        contas.add(contaCorrenteSuellen);

        nubank.setNome("Nubank");
        nubank.setContas(contas);


        contaCorrenteArthur.depositar(115000);
        contaCorrenteArthur.transferir(10000,contaCorrenteSuellen);
        contaCorrenteArthur.imprimirExtrato();
        contaCorrenteSuellen.imprimirExtrato();
        nubank.getContas();


    }
}
