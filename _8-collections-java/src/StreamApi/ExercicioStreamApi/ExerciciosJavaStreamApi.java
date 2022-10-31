package StreamApi.ExercicioStreamApi;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosJavaStreamApi {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","6","7","8","3","7","8","9"));

        System.out.println("Imprimindo os elementos da lista");
        numeros.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //Formas simplificadas
        numeros.forEach(System.out::println);
        numeros.stream()
                .forEach(System.out::println);


        System.out.println("Pegue os ultimos 5 primeiros e coloque dentro de um Set");
        Set<String> collectVars = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());
        //Utilizando um HashSet
        new HashSet<>(numeros)
                .stream().limit(5)
                .forEach(System.out::println);

        collectVars.forEach(s -> System.out.println(s));


        System.out.println("Transforme esta list de string em uma list de inteiros");
        List<Integer> numerosInt = numeros
                .stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .toList();
        List<Integer> numerosIntStream = new ArrayList<>(numeros.stream()
                .map(value -> Integer.parseInt(value)).toList());
        List<Integer> numerosIntSt = numeros.stream()
                .map(Integer::parseInt).toList();
        System.out.println(numerosIntSt);


        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        List<Integer> num2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(value -> value % 2 == 0 && value > 2)
                .toList();
        System.out.println(num2);


        System.out.println("Mostre a media dos numeros");
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os numeros impares");
        numerosIntStream.removeIf(value -> value % 2 != 0);
        System.out.println(numerosIntStream);


        System.out.println("Removendo numeros repetidos");
        List<Integer> numDistinct = numeros.stream()
                .map(Integer::parseInt)
                .distinct()
                .toList();
        System.out.println(numDistinct);


        System.out.println("O maior numero");
        Integer numMax = numeros.stream()
                .map(Integer::parseInt)
                .max(Integer::compare)
                .get();
        System.out.println(numMax);

        System.out.println("O menor numero");
        Integer numMin = numeros.stream()
                .map(Integer::parseInt)
                .min(Integer::compare)
                .get();
        System.out.println(numMin);

    }
}
