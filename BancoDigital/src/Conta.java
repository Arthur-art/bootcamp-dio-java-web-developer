public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }


    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDados(){
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Numero da conta: "+this.numero);
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
