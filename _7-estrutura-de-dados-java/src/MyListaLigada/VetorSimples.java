package MyListaLigada;

import java.util.Scanner;

public class VetorSimples {

    public static void main(String[] args) {

        int[] vetor = new int[5];
        vetor[3] = 4;
        vetor[2] = 8;
        vetor[1] = 12;
        vetor[4] = 11;
        vetor[0] = 14;

        System.out.println(vetor[3]);

        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

        String[] estados = new String[5];
        estados[0] = "AP";
        estados[1] = "SP";
        estados[2] = "RN";
        estados[3] = "MS";
        estados[4] = "MG";

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado vc quer buscar ?");
        String siglaBusca = leitor.nextLine().toUpperCase();

        boolean encontrou = false;
        for(int i=0; i<estados.length; i++){
            String element = estados[i];
            if(element.equals(siglaBusca)){
                encontrou = true;
                System.out.println("Encontrei o estado "+siglaBusca+" na posicao "+i+" do vetor");
            }
        }
        if(!encontrou){
            System.out.println("Estado não cadastrado");
        }
    }
}
