package ListaLigadaEncadeada;

public class Programa {
    public static void main(String[] args) {

        ListaLigadaEncadeada listaLigadaEncadeada = new ListaLigadaEncadeada();

        listaLigadaEncadeada.adicionar("MG");
        listaLigadaEncadeada.adicionar("SP");
        listaLigadaEncadeada.adicionar("DF");

        System.out.println("Primeiro "+listaLigadaEncadeada.getPrimeiro().getValor());
        System.out.println("Proximo "+listaLigadaEncadeada.getPrimeiro().getProximo().getValor());
        System.out.println("Ultimo "+listaLigadaEncadeada.getUltimo().getValor());
        System.out.println("Tamanho "+listaLigadaEncadeada.getTamanho());
        System.out.println(listaLigadaEncadeada.getPosicao(2).getValor());
    }
}
