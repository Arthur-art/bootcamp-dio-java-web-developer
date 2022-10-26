package ListaLigadaEncadeada;

public class Elemento {
    private String valor;
    private Elemento proximo;

    public Elemento(String novoElemento){
        this.valor = novoElemento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
