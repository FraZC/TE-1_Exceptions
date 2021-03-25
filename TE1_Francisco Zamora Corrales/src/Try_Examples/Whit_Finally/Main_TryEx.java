package Try_Examples.Whit_Finally;
//Example of a program that try to divide a number (from a array) by 0,woks with Try_Ex class.
// It have two exceptions: ArrayIndexOutOfBoundsException and ArithmeticException, handled by try, catch and finally.
// It use a random int number (form 0 to 13) for take a number of an array of two values and try to divide
// this value by 0,so this program will always return a exception.
// Entry : a random integer number.
// Exit : a exception (ArrayIndexOutOfBoundsException or ArithmeticException) whit an explication of this result.
// Restrictions: it only admit a integer number and better if it is lower than 2.
import java.util.Random;

public class Main_TryEx {
    public static void main (String[] args){

        Random rad = new Random();
        int index= rad.nextInt(14);
        Try_Ex a = new Try_Ex(index);

        System.out.println(a);

    }
}

