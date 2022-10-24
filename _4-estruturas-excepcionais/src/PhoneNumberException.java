public class PhoneNumberException extends Exception {

    public String phoneIsValid(String phoneNumber) throws PhoneNumberException{
        if(phoneNumber.length() != 11){
            throw new PhoneNumberException();
        }else{
            return "Phone is valid";
        }
    }
}
