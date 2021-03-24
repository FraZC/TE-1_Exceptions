package My_own_Java_exception;

import My_own_Java_exception.First_one.JustNaturalNumberException;
import My_own_Java_exception.Second_one.OnlyMp3filesException;


import java.util.Hashtable;

public class Exceptions {
    void correct_value(int file, Hashtable<Integer, String> music) throws JustNaturalNumberException, OnlyMp3filesException{
        if (file<0){
            throw new JustNaturalNumberException(" the value "+ file +" is not a natural number ");
        }
        else{
            String song = music.get(file);
            String type = song.substring(song.length() - 4);
            System.out.println(type+ "ss");
            if (!type.equals(".mp3") ){
                throw new OnlyMp3filesException("The file is not a .mp3 file is a " + type);
            }
        }
    }
}

