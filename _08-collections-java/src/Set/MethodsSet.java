package Set;

import java.util.*;

public class MethodsSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.4,8.5,9.1,8.3,5.2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma das notas");
        Iterator<Double> iteratorNotas = notas.iterator();
        double soma = 0;
        while(iteratorNotas.hasNext()){
            double next = iteratorNotas.next();
            soma = soma + next;
        }
        System.out.println(soma);

        System.out.println("Remova as notas menores que 8");
        Iterator<Double> iteratorNotas2 = notas.iterator();
        while (iteratorNotas2.hasNext()){
            double next = iteratorNotas2.next();
            if(next < 8){
                iteratorNotas2.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba as notas em ordem crescente");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.4,8.5,9.1,8.3,5.2));
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

    }
}
