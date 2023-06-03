package az.coders.chapter1.lesson11.localInnerClas;

public class Outer1{


    void exp() {

        class LocalInner {
            static String a="hu";

        }
        System.out.println( LocalInner.a);

    }

    public static void main(String[] args) {
        Outer1 o= new Outer1();

        o.exp();

    }
}
