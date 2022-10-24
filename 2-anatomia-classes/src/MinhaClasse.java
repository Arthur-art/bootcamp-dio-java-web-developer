import static boletim.arthur.anatomiadeclasses.BoletimEstudantil.notaAluno;

public class MinhaClasse {

    public static void main (String [] args){

       final String BR = "Brasil";
       int ano = 2022;
       boolean javaClass = true;
       double number = 15.19;

       String nome = "Arthur";
       String segundoNome = "Teixeira";
       String userName = nomeCompleto(nome, segundoNome);

       System.out.println(userName);

        System.out.println(notaAluno(10));

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){

        return "resultado do metodo: "+primeiroNome.concat(" ").concat(segundoNome);
    }

}
