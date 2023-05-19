package az.coders.chapter1.lesson7;

public class V8 extends Engine{


}

abstract class A{
}
class B extends A{
}
class C extends  A{
}
class Main12 {


    public static void main(String[] args) {
        A a1= new B();
        B b=(B) a1;


        A a2= new C();
        C c=(C) a2;


        a1=a2;
        B b1=(B) a2;


    }
}
