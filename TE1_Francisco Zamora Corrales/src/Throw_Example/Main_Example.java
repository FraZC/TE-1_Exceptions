package Throw_Example;
// Example of a program that try to add two numbers, but might fail
public class Main_Example {
    static String num1;
    static String num2;
    public static void main(String[] args) {
        String[] possible_numbers = {"1", "2", "tres"};
        java.util.Random num = new java.util.Random();
        int a = num.nextInt(possible_numbers.length);
        int b = num.nextInt(possible_numbers.length);
        num1 = (possible_numbers[a]);
        num2 = (possible_numbers[b]);
        System.out.printf("you are sending %s and %s  \n", num1, num2);

        Example_1 e = new Example_1(num1,num2);
        System.out.println(e);
    }
}


