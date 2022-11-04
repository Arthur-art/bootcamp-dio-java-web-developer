package MyListaLigada;

public class ProgramaInteiros {
    public static void main(String[] args) {

        ListaLigada<Integer> numbers = new ListaLigada<Integer>();

        numbers.adicionar(1);
        numbers.adicionar(2);
        numbers.adicionar(3);
        numbers.adicionar(4);

        System.out.println("Primeiro "+numbers.getPrimeiro().getValor());
        System.out.println("Ultimo "+numbers.getUltimo().getValor());
        System.out.println("Tamanho "+numbers.getTamanho());
    }
}
