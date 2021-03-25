package My_own_Java_exception.Second_one;
//Exception that only allows .mp3 files.
public class OnlyMp3filesException extends Exception{
    public OnlyMp3filesException (String messag){
        super (messag);
    }
}
