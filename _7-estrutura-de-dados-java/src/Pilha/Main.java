package Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.adicionar("John");
        pilha.adicionar("Arthur");
        pilha.adicionar("Patricia");
        pilha.adicionar("Tetro");

        System.out.println("Topo da pilha: "+ pilha.get());
        pilha.remover();
        System.out.println("Novo topo "+ pilha.get());
    }
}
