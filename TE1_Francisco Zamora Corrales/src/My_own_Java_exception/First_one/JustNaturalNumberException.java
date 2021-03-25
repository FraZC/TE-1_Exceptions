package My_own_Java_exception.First_one;
//Exception that only allows natural numbers.
public class JustNaturalNumberException extends Exception{
    public JustNaturalNumberException (String message){
        super (message);
    }
}
