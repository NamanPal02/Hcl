package Day4;
import java.util.*;

@FunctionalInterface
interface calculators{
    int calculate(int a, int b);
    }
public class calculator {
    public static void main(String[] args) {
//        addition
        calculators add = (a,b) -> a + b;
        System.out.println("Addition: " + add.calculate(10,5));

//        subtraction
        calculators sub = (a,b) -> a-b;
        System.out.println("Subtaction: " + sub.calculate(89, 35));

//        multiply
        calculators mul = (a,b) -> a*b;
        System.out.println("Multiply " + mul.calculate(21, 23));

//        Divide
        calculators div = (a,b) -> a/b;
        System.out.println("Divide: " + div.calculate(49,7));

//        modulus
        calculators mod = (a,b) -> a%b;
        System.out.println("modulus: " + mod.calculate(89,4));
    }
}




