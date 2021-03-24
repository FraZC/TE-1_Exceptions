package Double_Handed_Example;

import java.io.FileNotFoundException;

public class Cheked_Example {
    //declare exception using throws in the method signature
    void openFile(String value) throws FileNotFoundException, IllegalArgumentException{
        if(value.equals("some place"))
            throw new FileNotFoundException("FileNotFoundException; the field was not found");
        else
            throw new IllegalArgumentException("IllegalArgumentException; a number value is not a place");
    }
}
