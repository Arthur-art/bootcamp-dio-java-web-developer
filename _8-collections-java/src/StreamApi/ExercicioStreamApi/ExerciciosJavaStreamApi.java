package StreamApi.ExercicioStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExerciciosJavaStreamApi {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));

        System.out.println("Imprimindo os elementos da lista");
        numeros.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Formas simplificadas
        numeros.stream().forEach(s -> System.out.println(s));

        numeros.stream()
                .forEach(System.out::println);


        System.out.println("Pegue os ultimos 5 primeiros e coloque dentro de um Set");
        numeros.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
