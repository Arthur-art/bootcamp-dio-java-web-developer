import smarttv.arthur.anatomiadeclasses.SmartTv;

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

       SmartTv smartTv = new SmartTv();

       System.out.println(smartTv.ligada);

       smartTv.canal = 12;

       System.out.println(smartTv.canal);

       smartTv.ligar();

       smartTv.desligar();

       System.out.println(smartTv.ligada);

        double A, B, media;

        A = 100.44;
        B = 12.33;

        media = (  A   * 3.5 +  B   * 7.5)/11;

        System.out.printf("MEDIA = %.5f",  media   );
        System.out.println();
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){

        return "resultado do metodo: "+primeiroNome.concat(" ").concat(segundoNome);
    }

}
