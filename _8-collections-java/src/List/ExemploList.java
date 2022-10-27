package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
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

        //Imprimindo valores do array
        for (Integer notasValue: notas) {
            System.out.println(notasValue);
        }

        //List imutavel
        List<Integer> notasFinal = List.of(1,2,3,4,5,6,7);


    }
}
