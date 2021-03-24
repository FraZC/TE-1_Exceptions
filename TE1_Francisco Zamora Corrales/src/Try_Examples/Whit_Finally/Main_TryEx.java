package Try_Examples.Whit_Finally;
//Example of a program that try to divide a number (from a array) by 0
//might have two types or errors/exceptions.
import java.util.Random;

public class Main_TryEx {
    public static void main (String[] args){

        Random rad = new Random();
        int index= rad.nextInt(14);
        Try_Ex a = new Try_Ex(index);

        System.out.println(a);

    }
}

