package Day8;

public class main {
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
//        System.out.println(s1 == s2);
    }
}
