package ListaLigada;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {

        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //Tempo para adicionar valores

        int limite = 100000;

        // *** Vetor ***
        long timeInicial = System.currentTimeMillis();
        long timeFinal;

        for(int i=0;i<limite;i++){
            vetor.add(i);
        }

        timeFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor");
        System.out.println(timeFinal - timeInicial+" milliseconds");

        // *** Lista ***

        timeInicial = System.currentTimeMillis();
        for(int i=0;i<limite;i++){
            lista.adicionar(i);
        }
        timeFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos na lista");
        System.out.println(timeFinal - timeInicial+" milliseconds");

        //Tempo para ler os valores

        // *** Vetor ***

        timeInicial = System.currentTimeMillis();
        for (int i=0;i<vetor.size(); i++){
            vetor.get(i);
        }
        timeFinal = System.currentTimeMillis();
        System.out.println("Tempo parar ler um vetor de "+limite+" elementos");
        System.out.println(timeFinal - timeInicial+" milliseconds");

        // *** Lista ***

        timeInicial = System.currentTimeMillis();
        for (int i=0;i<lista.getTamanho(); i++){
            lista.getPosicao(i);
        }
        timeFinal = System.currentTimeMillis();
        System.out.println("Tempo parar ler um lista de "+limite+" elementos");
        System.out.println(timeFinal - timeInicial+" milliseconds");
    }
}
