package Try_Examples.Whit_Finally;

public class Try_Ex {
    int [] num = {1, 2};
    int div_0;
    public Try_Ex(int index){
        try{
            div_0 = num[index]/0;
        }
        catch (ArrayIndexOutOfBoundsException f){
            System.out.printf("ArrayIndexOutOfBounds; the index %s is out of the array bounds\n", index);

        }
        catch(ArithmeticException f) {
            System.out.println("ArithmeticException; divide by 0");
        }
        finally {
            System.out.println("\nThe index value is:" + index);
            System.out.println("""
                    If the index was lower than 2, probably there is an  ArithmeticException,
                    in the other case there would be an ArrayIndexOutOfBoundsException.""");
        }

    }

}
