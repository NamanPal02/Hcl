package Day8;

public class Asingleton {
    static final Asingleton obj = new Asingleton();

//    rule1: make constructor private
    private Asingleton(){

    }
    public static Asingleton makeInstance(){
        return obj;
    }
    public String getMsg(){
        return "Heyy...I am using Java";
    }
}
