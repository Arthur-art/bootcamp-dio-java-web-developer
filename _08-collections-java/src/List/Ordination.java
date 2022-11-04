package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordination {

    public static void main(String[] args) {
        /*Dadas as sequintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
        (nome - idade - cor);
        List.Gato 1 = nome: Jon, idade: 18, cor: amarelo
        List.Gato 2 = nome: Simba, idade: 6, cor: tigrado
        List.Gato 3 = nome: Balerion, genero: 12, cor: preto*/

        List<Gato> gatos = new ArrayList<Gato>(){{
                add(new Gato("Balerion","Preto",18));
                add(new Gato("Simba","Tigrado",6));
                add(new Gato("Jon","Amarelo",12));
        }};

        System.out.println("Exibindo gatos em ordem de inserção: ");
        System.out.println(gatos);

        System.out.println("Exibindo gatos em forma aleatoria: ");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Exibindo gatos em ordem natural (Nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Exibindo gatos em ordem (Idade)");
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Exibindo gatos em ordem (Cor)");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Exibindo gatos em ordem (nome, cor, idade)");
        Collections.sort(gatos, new CompareNomeCorIdade());
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

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class CompareNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome !=0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0) return cor;

        int idade = Integer.compare(gato1.getIdade(), gato2.getIdade());
        if(idade != 0) return idade;

        return 0;
    }
}