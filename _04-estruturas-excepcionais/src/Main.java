import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CepInvalidoException, PhoneNumberException {

        CepInvalidoException formatCep = new CepInvalidoException();
        PhoneNumberException phoneIsValid = new PhoneNumberException();

        try {
            String cepIsvalid = formatCep.formatarCep("3854702");
            String phone = phoneIsValid.phoneIsValid("31989537539");

            System.out.println(cepIsvalid);
            System.out.println(phone);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Terminado");
        }

        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for(int i=0 ; i<3 ; i++){
            nomes.add(sc.nextLine());
        }
        System.out.println(nomes);
    }
}