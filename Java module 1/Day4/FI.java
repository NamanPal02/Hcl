package Day4;
import java.util.*;
import java.util.function.Predicate;

public class FI {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        System.out.println(isEven.test(84));
    }
}
