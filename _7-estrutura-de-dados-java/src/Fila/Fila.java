package Fila;

public class Fila {
    private ListaLigada lista;

    public Fila(){
        this.lista = new ListaLigada();
    }

    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);
    }

    public void remover(){
        this.lista.remover(this.get());
    }

    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
