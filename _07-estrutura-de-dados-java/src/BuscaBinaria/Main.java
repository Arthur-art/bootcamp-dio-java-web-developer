package BuscaBinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[100000000];

        for(int i=0;i<vetor.length;i++){
            vetor[i] = i*2;
        }

        System.out.println("Qual numero você busca ?");
        Scanner scn = new Scanner(System.in);
        int buscado = scn.nextInt();

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length -1;
        int meio;

        while(inicio <= fim){
            contador++; //Conta quantos testes a busca fez
            meio = (int)((inicio + fim) / 2);
            if(vetor[meio] == buscado){
                achou = true;

                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio +1;
            }else {
                fim = meio -1;
            }
        }

        if(!achou){
            System.out.println("Numero não encontrado;");
        }else{
            System.out.println("Numero encontrado;");
        }
        System.out.println("Quantidade de testes: "+ contador);
    }
}
