package Pilha;

public class Pilha {
    private ListaLigada pilha;

    public Pilha(){
        this.pilha = new ListaLigada();
    }

    public void adicionar(String novoValor){
        this.pilha.adicionarComeco(novoValor);
    }

    public void remover(){
        this.pilha.remover(this.get());
    }

    public String get(){
        return this.pilha.getPrimeiro().getValor();
    }
}
