package az.coders.chapter1.lesson11;

public class OuterClass {
    public class InnerClass {

        static  String asd;

        private String asdb;
        static  void  S(){

        }
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        String asd = InnerClass.asd;


        InnerClass innerClass = outerClass.new InnerClass();

        String asdb = innerClass.asdb;

        InnerClass innerClass1= new OuterClass().new InnerClass();
    }
}

class E{


    public static void main(String[] args) {
        String asd = OuterClass.InnerClass.asd;


        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
    }
}
