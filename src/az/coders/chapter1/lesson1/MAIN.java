package az.coders.chapter1.lesson1;

public class MAIN {

    public static void main(String[] args) {
        String a = "hello";
        final String b = "dd";

//        short, int , char
//                           String, ENUM
        switch (a) {
            case b:
                System.out.println(b);
            case "helo":
                System.out.println("HELLO");
            default:
                System.out.println("Default");
        }
    }
}
