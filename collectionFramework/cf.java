package collectionFramework;
import java.util.*;
public class cf {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=10; i++){
            list.add(i);
        }
//        update 2 elements using set(index, newValue)
        list.set(2, 30);
        list.set(7,80);

//        print the updated list
        System.out.println("Updated ArrayList: " + list);
    }
}
