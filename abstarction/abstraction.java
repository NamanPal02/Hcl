package abstarction;

public class abstraction {
    abstract class A{
        void m1();
        int m2();
    }
    abstract class B extends A{
        void m1(){
            System.out.println("Hello");
        }
    }
    interface C{
        static void m1(){
            System.out.println("Static method");
        }
    }

    public static void main(String[] args) {
        C.m1();
//        abstraction obj = new abstraction();
//        B b = new B();
    }
}
