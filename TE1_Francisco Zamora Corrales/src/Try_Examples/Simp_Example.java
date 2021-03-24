package Try_Examples;
//Program that try to divide a number by 0

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
