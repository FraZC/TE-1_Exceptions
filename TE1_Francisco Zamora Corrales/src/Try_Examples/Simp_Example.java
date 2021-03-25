package Try_Examples;
//Example of a program that try to divide a number by 0. The error is handled by try/catch exception.
// Entry : nothing.
// Exit : always an ArithmeticException.
// Restrictions: there is not, the reason for existence of this program is to fail.
public class Simp_Example {
    public static void main(String[] args){
        int num1, result;
        try{
            num1 = 0;
            result = 40/num1;
            System.out.print(result);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException; divide by 0");
        }
    }
}
