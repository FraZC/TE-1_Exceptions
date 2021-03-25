package My_own_Java_exception;
//Program that try to open a mp3 file (that does not exist) and play it,
//works whit Exceptions class and has two made exceptions:JustNaturalNumberException and
//OnlyMp3filesException (explained in their packages), and MalformedURLException, using try/catch  and throw
//exceptions. The idea is to randomly choose a number associated with a file using a dictionary value,
//so if the number is negative it would activate the JustNaturalNumberException, then the read file
//(a non mp3 file) would activate the OnlyMp3filesException.
// If this were a functional program it would use MalformedURLException for a wrong URL.
// Entry : A number from 0 to 2 rooted in a dictionary whit files.
// Exit : The sound given by the dictionary.
// Restrictions: It only admits number from 0 to 2 and a mp3 file.


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
