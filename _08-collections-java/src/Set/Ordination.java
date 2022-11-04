package Set;

import java.util.*;

public class Ordination {

     /*Dadas as sequintes informações sobre series, crie uma lista e ordene esta lista exibindo:
        (nome - genero - tempoPorEp);
        List.Serie 1 = nome: got, genero: medieval, tempoPorEp: 54.30
        List.Serie 2 = nome: breakingbad, genero: drogas, tempoPorEp: 45.25
        List.Serie 3 = nome: mrrobot, genero: hacker, tempoPorEp: 47.32*/

    public static void main(String[] args) {

        Serie serie1 = new Serie("got", "medieval",54.30);
        Serie serie2 = new Serie("breakingbad","drogas",45.25);
        Serie serie3 = new Serie("mrrobot","hacker",47.32);
        Set<Serie> series = new HashSet<Serie>(){{
            add(serie1);
            add(serie2);
            add(serie3);
        }};
        System.out.println(series);

        for (Serie serie: series
             ) {
            System.out.println(serie.getNome());
        }

        System.out.println("Ordem tempo de episodio: ");
        Set<Serie> series2 = new TreeSet<>(series);
        System.out.println(series2);
    }


}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private double tempoPorEp;

    public Serie(String nome, String genero, double tempoPorEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempoPorEp = tempoPorEp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getTempoPorEp() {
        return tempoPorEp;
    }

    public void setTempoPorEp(double tempoPorEp) {
        this.tempoPorEp = tempoPorEp;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoPorEp=" + tempoPorEp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Double.compare(serie.tempoPorEp, tempoPorEp) == 0 && nome.equals(serie.nome) && genero.equals(serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoPorEp);
    }

    @Override
    public int compareTo(Serie serie) {
        return Double.compare(this.getTempoPorEp(), serie.getTempoPorEp());
    }
}