package BuscaLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i= 0; i<vetor.length;i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual numero você busca ?");
        Scanner scanner = new Scanner(System.in);

        int numeroBuscado = scanner.nextInt();

        boolean numeroEncontrado = false;
        for(int i= 0; i<vetor.length;i++){
            if(vetor[i] == numeroBuscado){
                System.out.println("numero encontrado");
                numeroEncontrado = true;
                break;
            }
        }

        if(!numeroEncontrado){
            System.out.println("Numero não encontrado;");
        }

    }
}
