public class ParametrosInvalidosException extends Exception{

        public void numberIsValid(int number1, int number2) throws ParametrosInvalidosException{
            if(number1 > number2){
                throw new ParametrosInvalidosException();
            }
        }
}
