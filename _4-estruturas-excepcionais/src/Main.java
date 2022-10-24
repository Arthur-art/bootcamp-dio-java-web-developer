public class Main {
    public static void main(String[] args) throws CepInvalidoException, PhoneNumberException {

        CepInvalidoException formatCep = new CepInvalidoException();
        PhoneNumberException phoneIsValid = new PhoneNumberException();

        try {
            String cepIsvalid = formatCep.formatarCep("3085470");
            String phone = phoneIsValid.phoneIsValid("31989537539");

            System.out.println(cepIsvalid);
            System.out.println(phone);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Terminado");
        }


    }
}