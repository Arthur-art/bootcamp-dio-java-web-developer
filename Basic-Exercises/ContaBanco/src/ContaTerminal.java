import java.util.Scanner;

public class ContaTerminal {

    //Link do exercicio: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

    public static void main(String[] args){
        Scanner cout = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        long numero = Integer.parseInt(cout.nextLine());

        System.out.println("Por favor, digite o digito da Agência!");
        String agencia = cout.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nome = cout.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        float saldo = Float.parseFloat(cout.nextLine());

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
