package az.coders.chapter1.lesson11.staticclass;

public class Outer {


    static  class Inner{

        String a;

        static String constq="ewfs";






    }



}

class Call{

    public  void main() {
        String constq = Outer.Inner.constq;

        Outer.Inner inner= new Outer.Inner();
    }

}
