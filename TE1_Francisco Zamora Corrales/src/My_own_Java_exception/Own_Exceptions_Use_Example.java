package My_own_Java_exception;


import java.util.*;
import java.applet.*;
import java.net.*;
public class Own_Exceptions_Use_Example {
    public static void main(String[] args){
        Hashtable<Integer, String> music = new Hashtable<>();
        music.put(0, "file1.txt");
        music.put(1, "file2.doc");
        music.put(2, "file3.mp4");
        Random rad = new Random();
        int file= rad.nextInt(2 + 2) - 2;
        try{
            Exceptions e = new Exceptions();
            e.correct_value(file,music);

            String song = music.get(file);
            AudioClip clip = Applet.newAudioClip(new URL("file://c:/blah/" + song));
            clip.play();
        }

        catch (MalformedURLException e) {
            System.out.println("MalformedURLException; the URL is wrong");

        }
        catch(Exception ex) {
            System.out.println(ex);
        }

    }
}
