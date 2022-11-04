package List;

import java.util.*;

public class MethodsList {
    public static void main(String[] args) {

        ArrayList<Integer> notas = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        notas.add((int)9.7);
        notas.add(10);

        //Posicao do elemento
        System.out.println(notas.indexOf(7));

        // Adicionando a nota 8 na posicao 4
        notas.add(4,900);
        System.out.println(notas);

        //Substituindo um elemento
        notas.set(notas.indexOf(6), 945);
        System.out.println(notas);

        //Verificando se um elemento esta na lista
        boolean elementoExists = notas.contains(52);
        System.out.println(elementoExists);

        System.out.println("Exiba a terceira nota adicionada "+notas.get(2));

        //Imprimindo valores do array
        for (Integer notasValue: notas) {
            System.out.println(notasValue);
        }

        //List imutavel
        List<Integer> notasFinal = List.of(1,2,3,4,5,6,7);

        //Exiba o menor valor da list
        System.out.println("O menor valor da list é "+ Collections.min(notas));
        System.out.println("O maior valor da list é "+ Collections.max(notas));

        //Exiba a soma dos valores do array, Dica: ctrl+alt+V para criar uma variavel iterator
        int soma = 0;
        Iterator<Integer> iterator = notas.iterator();
        while (iterator.hasNext()){
            int next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é "+soma);

        //Exiba a media das notas
        System.out.println(notas.size());
        System.out.println("A media das notas é "+(soma / notas.size()));

        //Remova as notas menores que 7
        Iterator<Integer> iteratorNotas = notas.iterator();
        while (iteratorNotas.hasNext()){
            int next = iteratorNotas.next();
            if(next < 7){
                iteratorNotas.remove();
            }
        }
        System.out.println(notas);

        notas.clear();
        System.out.println("Notas vazia ? "+notas.isEmpty());
    }

}
