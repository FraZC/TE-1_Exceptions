package Double_Handed_Example;
//Example of trying to open a file (that does not exist)
import java.util.Random;

public class Main_ChEx {
    public static void main(String[] args){
        try{
            String[] possible_values = {"some place", "2", "3.45"};
            java.util.Random num = new java.util.Random();
            int x = num.nextInt(possible_values.length);
            String value = (possible_values[x]);
            Cheked_Example file=new Cheked_Example();

            file.openFile( value);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}


