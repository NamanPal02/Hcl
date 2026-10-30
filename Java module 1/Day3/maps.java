package Day3;
import java.util.*;
public class maps {
    public static void main(String[] args) {
        Map <Integer, String> mp = new HashMap<>();
        mp.put(85, "adarsh");
        mp.put(92, "ananya");
        mp.put(73, "arya");
        mp.put(49, "anssh");
        mp.put(95, "anchit");
        System.out.println(mp);
        System.out.println("ananya's marks" + mp.get("ananya"));
        mp.forEach((k,v) -> System.out.println(k + ":" + v));
//        if(mp.containsKey(4)){
//            System.out.println("true");
//            System.out.println(mp.get(4));
//        }
//        else {
//            System.out.println("false");
//        }
    }
}
