import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CepInvalidoException, PhoneNumberException {

        CepInvalidoException formatCep = new CepInvalidoException();
        PhoneNumberException phoneIsValid = new PhoneNumberException();

        try {
            String cepIsvalid = formatCep.formatarCep("30854702");
            String phone = phoneIsValid.phoneIsValid("31989537539");

            System.out.println(cepIsvalid);
            System.out.println(phone);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Terminado");
        }

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++){
            nomes[i] = sc.nextLine();
        }

        if(nomes.length == 10){
            System.out.println(nomes[2]);
            System.out.println(nomes[6]);
            System.out.println(nomes[8]);
        }
    }
}