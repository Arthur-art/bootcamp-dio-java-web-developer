package MyListaLigada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada<String> listaLigadaEncadeada = new ListaLigada<String>();

        listaLigadaEncadeada.adicionar("MG");
        listaLigadaEncadeada.adicionar("SP");
        listaLigadaEncadeada.adicionar("DF");
        listaLigadaEncadeada.adicionar("AC");

        System.out.println("Primeiro "+listaLigadaEncadeada.getPrimeiro().getValor());
        System.out.println("Ultimo "+listaLigadaEncadeada.getUltimo().getValor());
        System.out.println("Tamanho "+listaLigadaEncadeada.getTamanho());

        System.out.println("*** Lista ***");
        for (int i=0; i<listaLigadaEncadeada.getTamanho(); i++){
            System.out.println(listaLigadaEncadeada.getPosicao(i).getValor());
        }

        listaLigadaEncadeada.remover("DF");

        System.out.println("*** Lista atualizada ***");

        for (int i=0; i<listaLigadaEncadeada.getTamanho(); i++){
            System.out.println(listaLigadaEncadeada.getPosicao(i).getValor());
        }
    }
}
