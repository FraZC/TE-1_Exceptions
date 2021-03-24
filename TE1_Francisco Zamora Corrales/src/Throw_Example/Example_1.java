package Throw_Example;
import java.util.Objects;
public class Example_1 {
    int result;
    public Example_1(String num1, String num2) {
        //it just add couple of numbers
        if (num1.equals("tres") || Objects.equals(num2, "tres")) {
            throw new NumberFormatException("'tres' is not an accepted value");
        }
        else {
            result =Integer.parseInt(num1) + Integer.parseInt(num2);
        }

    }
    @Override
    public  String toString(){ return "the result is:" + result;}
}
