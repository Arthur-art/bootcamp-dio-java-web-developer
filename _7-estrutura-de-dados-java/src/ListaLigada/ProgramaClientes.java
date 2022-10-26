package ListaLigada;

public class ProgramaClientes {

    public static void main(String[] args) {

        ListaLigada<Cliente> cliente = new ListaLigada<Cliente>();
        cliente.adicionar(new Cliente("Arthur","04844702654"));

        System.out.println("Nome "+cliente.getPrimeiro().getValor().getNome());
        System.out.println("Cpf "+cliente.getUltimo().getValor().getCpf());
        System.out.println("Tamanho "+cliente.getTamanho());
    }
}
