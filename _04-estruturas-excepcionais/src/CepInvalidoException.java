public class CepInvalidoException extends Exception {

    public  String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }else{
            return cep;
        }
    }
}
