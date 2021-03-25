package Double_Handed_Example;
//Program that try to open a file (that does not exist).
//works whit Cheked_Example class and has two exceptions:FileNotFoundException and
//IllegalArgumentException, using try/catch  and throw exception. If the location of the file
// isn't exact ("some place"), there would be a FileNotFoundException, but if the sent value is not
// a location (2 or 3.45) there would be a IllegalArgumentException.
// Entry : the location of a file.
// Exit : The exception caught by the throw and the catch.
// Restrictions: It would only admit a location of a file.
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


