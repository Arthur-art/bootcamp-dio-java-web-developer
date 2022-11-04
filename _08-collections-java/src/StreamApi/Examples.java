package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Examples {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<Gato>(){{
            add(new Gato("Balerion","Preto",18));
            add(new Gato("Simba","Tigrado",6));
            add(new Gato("Jon","Amarelo",12));
        }};

        //Class anonima
        gatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato o1, Gato o2) {
                return Integer.compare(o1.getIdade(),o2.getIdade());
            }
        });

        System.out.println(gatos);

        System.out.println("Lambda expression");

        gatos.sort(Comparator.comparing((Gato gato)->gato.getNome()));

        //Reference method
        gatos.sort(Comparator.comparing(Gato::getNome));

        System.out.println(gatos);
    }
}
class Gato implements Comparable<Gato>{
    private String nome;
    private String cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}