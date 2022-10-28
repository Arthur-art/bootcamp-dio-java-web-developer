package Map;

import java.util.*;

public class Ordenation {
    /*Dadas as seguintes informações sobre meus Livros favoritos e seus autores.
        crie um dicionário e ordene este dicionário
        exibindo (Nome Autor - Nome Livro):
        Autor = Hawking, Stephen - Livro = nome: Uma Breve Histónia do Tempo. páginas: 256
        Autor = Duhigg, Charles - Livro = nome: 0 Podar do Hábito, paginas: 408
        Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432*/

    public static void main(String[] args) {

        System.out.println("Ordem aleatoria");
        Map<String,Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma Breve Histónia do Tempo",256));
            put("Duhigg, Charles",new Livro("0 Podar do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições Para o Século",432));
        }};


        for (Map.Entry<String,Livro> livro: livros.entrySet()
             ) {
            System.out.println(livro.getKey()+"-"+livro.getValue().getLivro()+"-"+livro.getValue().getPaginas());
        }

        System.out.println("Ordem de inserção");
        Map<String,Livro> livros2 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen",new Livro("Uma Breve Histónia do Tempo",256));
            put("Duhigg, Charles",new Livro("0 Podar do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições Para o Século",432));
        }};

        for (Map.Entry<String,Livro> livro: livros2.entrySet()
        ) {
            System.out.println(livro.getKey()+"-"+livro.getValue().getLivro()+"-"+livro.getValue().getPaginas());
        }

        System.out.println("Ordem do autor");
        Map<String,Livro> livros3 = new TreeMap<String, Livro>(){{
            put("Hawking, Stephen",new Livro("Uma Breve Histónia do Tempo",256));
            put("Duhigg, Charles",new Livro("0 Podar do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições Para o Século",432));
        }};

        for (Map.Entry<String,Livro> livro: livros3.entrySet()
        ) {
            System.out.println(livro.getKey()+"-"+livro.getValue().getLivro()+"-"+livro.getValue().getPaginas());
        }

        System.out.println("Ordem do autor");

       Set<Map.Entry<String,Livro>> livros4 = new TreeSet<>(new ComparatorLivro());
       livros4.addAll(livros.entrySet());
        System.out.println(livros4);

    }
}

class ComparatorLivro implements Comparator<Map.Entry<String,Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getLivro().compareToIgnoreCase(livro2.getValue().getLivro());
    }
}

class Livro{
    private String livro;
    private int paginas;

    public Livro(String livro, int paginas) {
        this.livro = livro;
        this.paginas = paginas;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "livro='" + livro + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}